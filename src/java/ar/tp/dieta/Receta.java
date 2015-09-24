package ar.tp.dieta;

import ar.tp.dieta.Condicion;
import ar.tp.dieta.CondicionCeliaco;
import ar.tp.dieta.CondicionDiabetes;
import ar.tp.dieta.CondicionHipertension;
import ar.tp.dieta.CondicionVegano;
import ar.tp.dieta.ElementoDeReceta;
import ar.tp.dieta.Grupo;
import ar.tp.dieta.Ingrediente;
import ar.tp.dieta.RecetaBuilder;
import ar.tp.dieta.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class Receta extends ElementoDeReceta implements Cloneable {
  private String nombreDeLaReceta;
  
  private int calorias;
  
  private ArrayList<ElementoDeReceta> elementosDeReceta = new ArrayList<ElementoDeReceta>();
  
  private String procesoDePreparacion;
  
  private String dificultadDePreparacion;
  
  private String temporadaALaQueCorresponde;
  
  private int tiempoPreparacion;
  
  private int anioDeCreacion;
  
  private Usuario owner;
  
  public void agregarIngrediente(final Ingrediente unIngrediente) {
    unIngrediente.setIngrediente();
    this.elementosDeReceta.add(unIngrediente);
  }
  
  public void agregarCondimento(final Ingrediente unCondimento) {
    unCondimento.setCondimento();
    this.elementosDeReceta.add(unCondimento);
  }
  
  public void removerIngrediente(final Ingrediente unIngrediente) {
    this.elementosDeReceta.remove(unIngrediente);
  }
  
  public void removerCondimento(final Ingrediente unCondimento) {
    this.elementosDeReceta.remove(unCondimento);
  }
  
  public boolean validar() {
    boolean _and = false;
    boolean _validarCalorias = this.validarCalorias();
    if (!_validarCalorias) {
      _and = false;
    } else {
      boolean _isEmpty = this.elementosDeReceta.isEmpty();
      boolean _not = (!_isEmpty);
      _and = _not;
    }
    return _and;
  }
  
  public boolean validarCalorias() {
    boolean _and = false;
    int _calorias = this.getCalorias();
    boolean _greaterEqualsThan = (10 >= _calorias);
    if (!_greaterEqualsThan) {
      _and = false;
    } else {
      int _calorias_1 = this.getCalorias();
      boolean _lessEqualsThan = (_calorias_1 <= 5000);
      _and = _lessEqualsThan;
    }
    return _and;
  }
  
  public boolean inadecuadaParaCondiciones(final Condicion unaCondicion) {
    final Function1<ElementoDeReceta, Boolean> _function = new Function1<ElementoDeReceta, Boolean>() {
      public Boolean apply(final ElementoDeReceta elemento) {
        return Boolean.valueOf(elemento.soyInadecuadoParaCondicion(unaCondicion));
      }
    };
    return IterableExtensions.<ElementoDeReceta>exists(this.elementosDeReceta, _function);
  }
  
  public boolean esInadecuadaParaUsuario(final Usuario unUsuario) {
    List<Condicion> _condicionesPreexistentes = unUsuario.getCondicionesPreexistentes();
    final Function1<Condicion, Boolean> _function = new Function1<Condicion, Boolean>() {
      public Boolean apply(final Condicion condicion) {
        return Boolean.valueOf(Receta.this.soyInadecuadoParaCondicion(condicion));
      }
    };
    return IterableExtensions.<Condicion>exists(_condicionesPreexistentes, _function);
  }
  
  public boolean agregarSubreceta(final Receta unaSubreceta) {
    return this.elementosDeReceta.add(unaSubreceta);
  }
  
  public void cambiarNombre(final String nombre) {
    this.setNombreDeLaReceta(nombre);
  }
  
  public String devolverNombre() {
    return this.getNombreDeLaReceta();
  }
  
  public boolean soyInadecuadoParaCondicion(final Condicion unaCondicion) {
    final Function1<ElementoDeReceta, Boolean> _function = new Function1<ElementoDeReceta, Boolean>() {
      public Boolean apply(final ElementoDeReceta elemento) {
        return Boolean.valueOf(elemento.soyInadecuadoParaCondicion(unaCondicion));
      }
    };
    boolean _exists = IterableExtensions.<ElementoDeReceta>exists(this.elementosDeReceta, _function);
    return (!_exists);
  }
  
  public boolean exesoDeCalorias() {
    return (this.calorias > 500);
  }
  
  public boolean esInadecuadaParaGrupo(final Grupo grupo) {
    List<Usuario> _miembros = grupo.getMiembros();
    final Function1<Usuario, Boolean> _function = new Function1<Usuario, Boolean>() {
      public Boolean apply(final Usuario miembro) {
        return Boolean.valueOf(Receta.this.esInadecuadaParaUsuario(miembro));
      }
    };
    return IterableExtensions.<Usuario>exists(_miembros, _function);
  }
  
  public boolean contieneIngrediente(final String nombreIngrediente) {
    final Function1<ElementoDeReceta, Boolean> _function = new Function1<ElementoDeReceta, Boolean>() {
      public Boolean apply(final ElementoDeReceta elem) {
        String _nombre = elem.getNombre();
        return Boolean.valueOf(_nombre.equals(nombreIngrediente));
      }
    };
    return IterableExtensions.<ElementoDeReceta>exists(this.elementosDeReceta, _function);
  }
  
  public boolean contieneAlguno(final List<String> nombresIngredientes) {
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      public Boolean apply(final String nombreIngrediente) {
        return Boolean.valueOf(Receta.this.contieneIngrediente(nombreIngrediente));
      }
    };
    return IterableExtensions.<String>exists(nombresIngredientes, _function);
  }
  
  public String ingredientesAString() {
    String _xblockexpression = null;
    {
      List<String> stringsList = new ArrayList<String>();
      for (final ElementoDeReceta elemento : this.elementosDeReceta) {
        String _nombre = elemento.getNombre();
        stringsList.add(_nombre);
      }
      _xblockexpression = stringsList.toString();
    }
    return _xblockexpression;
  }
  
  public boolean tuNombreEsEste(final String nombre) {
    return this.nombreDeLaReceta.equals(nombre);
  }
  
  public List<ElementoDeReceta> getIngredientes() {
    List<ElementoDeReceta> _xblockexpression = null;
    {
      final Function1<ElementoDeReceta, Boolean> _function = new Function1<ElementoDeReceta, Boolean>() {
        public Boolean apply(final ElementoDeReceta it) {
          return Boolean.valueOf(it.sosIngrediente());
        }
      };
      Iterable<ElementoDeReceta> _filter = IterableExtensions.<ElementoDeReceta>filter(this.elementosDeReceta, _function);
      final Iterator<ElementoDeReceta> ingredienteIter = _filter.iterator();
      final List<ElementoDeReceta> ingredientes = new ArrayList<ElementoDeReceta>();
      while (ingredienteIter.hasNext()) {
        ElementoDeReceta _next = ingredienteIter.next();
        ingredientes.add(_next);
      }
      _xblockexpression = ingredientes;
    }
    return _xblockexpression;
  }
  
  public List<String> getCondimentos() {
    List<String> _xblockexpression = null;
    {
      final Function1<ElementoDeReceta, Boolean> _function = new Function1<ElementoDeReceta, Boolean>() {
        public Boolean apply(final ElementoDeReceta it) {
          return Boolean.valueOf(it.sosCondimento());
        }
      };
      Iterable<ElementoDeReceta> _filter = IterableExtensions.<ElementoDeReceta>filter(this.elementosDeReceta, _function);
      final Iterator<ElementoDeReceta> condimentoIter = _filter.iterator();
      final List<String> condimentos = new ArrayList<String>();
      while (condimentoIter.hasNext()) {
        ElementoDeReceta _next = condimentoIter.next();
        String _nombre = _next.getNombre();
        condimentos.add(_nombre);
      }
      _xblockexpression = condimentos;
    }
    return _xblockexpression;
  }
  
  public List<String> obtenerCondicionesAsString() {
    final List<String> condicionesInadecuadas = new ArrayList<String>();
    CondicionCeliaco _condicionCeliaco = new CondicionCeliaco();
    boolean _inadecuadaParaCondiciones = this.inadecuadaParaCondiciones(_condicionCeliaco);
    boolean _equals = Boolean.valueOf(_inadecuadaParaCondiciones).equals(Boolean.valueOf(true));
    if (_equals) {
      condicionesInadecuadas.add("Celiacos");
    }
    CondicionVegano _condicionVegano = new CondicionVegano();
    boolean _inadecuadaParaCondiciones_1 = this.inadecuadaParaCondiciones(_condicionVegano);
    boolean _equals_1 = Boolean.valueOf(_inadecuadaParaCondiciones_1).equals(Boolean.valueOf(true));
    if (_equals_1) {
      condicionesInadecuadas.add("Veganos");
    }
    CondicionHipertension _condicionHipertension = new CondicionHipertension();
    boolean _inadecuadaParaCondiciones_2 = this.inadecuadaParaCondiciones(_condicionHipertension);
    boolean _equals_2 = Boolean.valueOf(_inadecuadaParaCondiciones_2).equals(Boolean.valueOf(true));
    if (_equals_2) {
      condicionesInadecuadas.add("Hipertensos");
    }
    CondicionDiabetes _condicionDiabetes = new CondicionDiabetes();
    boolean _inadecuadaParaCondiciones_3 = this.inadecuadaParaCondiciones(_condicionDiabetes);
    boolean _equals_3 = Boolean.valueOf(_inadecuadaParaCondiciones_3).equals(Boolean.valueOf(true));
    if (_equals_3) {
      condicionesInadecuadas.add("Diabeticos");
    }
    return condicionesInadecuadas;
  }
  
  public Receta devolverme() {
    return this;
  }
  
  public Receta clonateConNombre(final String nombreNuevo) {
    Receta _xblockexpression = null;
    {
      RecetaBuilder _recetaBuilder = new RecetaBuilder(nombreNuevo);
      RecetaBuilder _calorias = _recetaBuilder.calorias(this.calorias);
      RecetaBuilder _dificultad = _calorias.dificultad(this.dificultadDePreparacion);
      RecetaBuilder _owner = _dificultad.owner(this.owner);
      RecetaBuilder _procesoPreparacion = _owner.procesoPreparacion(this.procesoDePreparacion);
      Receta receta = _procesoPreparacion.build();
      receta.elementosDeReceta = this.elementosDeReceta;
      _xblockexpression = receta;
    }
    return _xblockexpression;
  }
  
  @Pure
  public String getNombreDeLaReceta() {
    return this.nombreDeLaReceta;
  }
  
  public void setNombreDeLaReceta(final String nombreDeLaReceta) {
    this.nombreDeLaReceta = nombreDeLaReceta;
  }
  
  @Pure
  public int getCalorias() {
    return this.calorias;
  }
  
  public void setCalorias(final int calorias) {
    this.calorias = calorias;
  }
  
  @Pure
  public ArrayList<ElementoDeReceta> getElementosDeReceta() {
    return this.elementosDeReceta;
  }
  
  public void setElementosDeReceta(final ArrayList<ElementoDeReceta> elementosDeReceta) {
    this.elementosDeReceta = elementosDeReceta;
  }
  
  @Pure
  public String getProcesoDePreparacion() {
    return this.procesoDePreparacion;
  }
  
  public void setProcesoDePreparacion(final String procesoDePreparacion) {
    this.procesoDePreparacion = procesoDePreparacion;
  }
  
  @Pure
  public String getDificultadDePreparacion() {
    return this.dificultadDePreparacion;
  }
  
  public void setDificultadDePreparacion(final String dificultadDePreparacion) {
    this.dificultadDePreparacion = dificultadDePreparacion;
  }
  
  @Pure
  public String getTemporadaALaQueCorresponde() {
    return this.temporadaALaQueCorresponde;
  }
  
  public void setTemporadaALaQueCorresponde(final String temporadaALaQueCorresponde) {
    this.temporadaALaQueCorresponde = temporadaALaQueCorresponde;
  }
  
  @Pure
  public int getTiempoPreparacion() {
    return this.tiempoPreparacion;
  }
  
  public void setTiempoPreparacion(final int tiempoPreparacion) {
    this.tiempoPreparacion = tiempoPreparacion;
  }
  
  @Pure
  public int getAnioDeCreacion() {
    return this.anioDeCreacion;
  }
  
  public void setAnioDeCreacion(final int anioDeCreacion) {
    this.anioDeCreacion = anioDeCreacion;
  }
  
  @Pure
  public Usuario getOwner() {
    return this.owner;
  }
  
  public void setOwner(final Usuario owner) {
    this.owner = owner;
  }
}
