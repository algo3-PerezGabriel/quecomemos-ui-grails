package ar.tp.dieta;

import ar.tp.dieta.BusinessException;
import ar.tp.dieta.Busqueda;
import ar.tp.dieta.Condicion;
import ar.tp.dieta.ElementoDeReceta;
import ar.tp.dieta.Grupo;
import ar.tp.dieta.Ingrediente;
import ar.tp.dieta.Miembro;
import ar.tp.dieta.Receta;
import ar.tp.dieta.RecetaBuilder;
import ar.tp.dieta.Rutina;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Observable
@Accessors
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class Usuario extends Miembro {
  private Double peso;
  
  private Double altura;
  
  private GregorianCalendar fechaDeNacimiento;
  
  private GregorianCalendar diaDeHoy;
  
  private String sexo;
  
  private Rutina rutina;
  
  private List<Condicion> condicionesPreexistentes = new ArrayList<Condicion>();
  
  private List<String> comidasQueNoMeGustan = new ArrayList<String>();
  
  private List<Receta> misRecetas = new ArrayList<Receta>();
  
  private List<Grupo> misGrupos = new ArrayList<Grupo>();
  
  private List<Receta> recetasFavoritas = new ArrayList<Receta>();
  
  private List<Receta> ultimasConsultadas = new ArrayList<Receta>();
  
  private String direccionCorreo;
  
  private Boolean resultadoDeConsultasAFavoritos = Boolean.valueOf(false);
  
  private String password;
  
  public GregorianCalendar setFechaDeNacimiento(final int ano, final int mes, final int diaDelMes) {
    GregorianCalendar _gregorianCalendar = new GregorianCalendar(ano, mes, diaDelMes);
    return this.fechaDeNacimiento = _gregorianCalendar;
  }
  
  public double indiceDeMasaCorporal() {
    double _pow = Math.pow((this.altura).doubleValue(), 2);
    return ((this.peso).doubleValue() / _pow);
  }
  
  protected boolean validarIMC() {
    boolean _and = false;
    double _indiceDeMasaCorporal = this.indiceDeMasaCorporal();
    boolean _greaterEqualsThan = (18 >= _indiceDeMasaCorporal);
    if (!_greaterEqualsThan) {
      _and = false;
    } else {
      double _indiceDeMasaCorporal_1 = this.indiceDeMasaCorporal();
      boolean _lessEqualsThan = (_indiceDeMasaCorporal_1 <= 30);
      _and = _lessEqualsThan;
    }
    return _and;
  }
  
  public boolean sigoUnaRutinaSaludable() {
    return this.rutina.rutinaSaludable(this);
  }
  
  public void agregarCondicion(final Condicion unaCondicion) {
    this.condicionesPreexistentes.add(unaCondicion);
  }
  
  public void agregarPreferencia(final String unaComida) {
    this.preferencias.add(unaComida);
  }
  
  public void agregarComidaQueMeDisgusta(final String unaComida) {
    this.comidasQueNoMeGustan.add(unaComida);
  }
  
  protected boolean subsanaTodasLasCondiciones() {
    final Function1<Condicion, Boolean> _function = new Function1<Condicion, Boolean>() {
      public Boolean apply(final Condicion condicion) {
        boolean _seSubsana = condicion.seSubsana(Usuario.this);
        return Boolean.valueOf((!_seSubsana));
      }
    };
    return IterableExtensions.<Condicion>exists(this.condicionesPreexistentes, _function);
  }
  
  protected boolean rutinaEsIntensiva() {
    return this.rutina.rutinaEsIntensiva();
  }
  
  protected boolean rutinaEsActiva() {
    return this.rutina.rutinaEsActiva();
  }
  
  protected boolean meGustaLaCarne() {
    return this.preferencias.contains("carne");
  }
  
  protected boolean meGustaLaFruta() {
    return this.preferencias.contains("fruta");
  }
  
  public void agregarReceta(final Receta unaReceta) {
    unaReceta.setOwner(this);
    this.misRecetas.add(unaReceta);
  }
  
  public void agregarRecetaDeGrupo(final Grupo unGrupo, final String nombreReceta) {
    Receta recetaNueva = new Receta();
    Receta _copiarReceta = unGrupo.copiarReceta(this, unGrupo, recetaNueva, nombreReceta);
    this.misRecetas.add(_copiarReceta);
  }
  
  public void crearReceta(final String nombre, final int calorias, final String dificultad, final String preparacion, final String temporada, final Ingrediente ingrediente1, final Ingrediente ingrediente2) {
    RecetaBuilder _recetaBuilder = new RecetaBuilder(nombre);
    RecetaBuilder _calorias = _recetaBuilder.calorias(calorias);
    RecetaBuilder _owner = _calorias.owner(this);
    RecetaBuilder _dificultad = _owner.dificultad(dificultad);
    RecetaBuilder _procesoPreparacion = _dificultad.procesoPreparacion(preparacion);
    RecetaBuilder _temporada = _procesoPreparacion.temporada(temporada);
    RecetaBuilder _agregarIngrediente = _temporada.agregarIngrediente(ingrediente1);
    RecetaBuilder _agregarIngrediente_1 = _agregarIngrediente.agregarIngrediente(ingrediente2);
    Receta nuevaReceta = _agregarIngrediente_1.build();
    this.misRecetas.add(nuevaReceta);
  }
  
  public Receta devolverReceta(final String nombre) {
    Receta _xblockexpression = null;
    {
      final Function1<Receta, Boolean> _function = new Function1<Receta, Boolean>() {
        public Boolean apply(final Receta receta) {
          String _devolverNombre = receta.devolverNombre();
          return Boolean.valueOf(_devolverNombre.equals(nombre));
        }
      };
      Receta receta = IterableExtensions.<Receta>findFirst(this.misRecetas, _function);
      boolean _equals = receta.equals(null);
      if (_equals) {
        throw new BusinessException("No existe la receta en la lista de recetas.");
      }
      _xblockexpression = receta;
    }
    return _xblockexpression;
  }
  
  public boolean creeEstaReceta(final Receta unaReceta) {
    return this.misRecetas.contains(unaReceta);
  }
  
  public ElementoDeReceta devolverSubReceta(final String nombreReceta, final String nombreSubreceta) {
    ElementoDeReceta _xblockexpression = null;
    {
      Receta _devolverReceta = this.devolverReceta(nombreReceta);
      ArrayList<ElementoDeReceta> _elementosDeReceta = _devolverReceta.getElementosDeReceta();
      final Function1<ElementoDeReceta, Boolean> _function = new Function1<ElementoDeReceta, Boolean>() {
        public Boolean apply(final ElementoDeReceta subReceta) {
          String _nombre = subReceta.getNombre();
          return Boolean.valueOf(_nombre.equals(nombreSubreceta));
        }
      };
      ElementoDeReceta subReceta = IterableExtensions.<ElementoDeReceta>findFirst(_elementosDeReceta, _function);
      boolean _equals = subReceta.equals(null);
      if (_equals) {
        throw new BusinessException("No existe la subreceta en la lista de subrecetas.");
      }
      _xblockexpression = subReceta;
    }
    return _xblockexpression;
  }
  
  public void modificarReceta(final String nombreOriginal, final String nombreNuevo, final int calorias, final String proceso, final String dificultad, final String temporada) {
    Receta nuevaReceta = new Receta();
    Receta _devolverReceta = this.devolverReceta(nombreOriginal);
    nuevaReceta = _devolverReceta;
    final Procedure1<Receta> _function = new Procedure1<Receta>() {
      public void apply(final Receta it) {
        it.setProcesoDePreparacion(proceso);
        it.setCalorias(calorias);
        it.setDificultadDePreparacion(dificultad);
        it.setTemporadaALaQueCorresponde(temporada);
        it.cambiarNombre(nombreNuevo);
      }
    };
    ObjectExtensions.<Receta>operator_doubleArrow(nuevaReceta, _function);
  }
  
  public boolean meConvieneReceta(final Receta receta) {
    return receta.esInadecuadaParaUsuario(this);
  }
  
  public void agregarRecetaFavorita(final Receta unaReceta) {
    this.recetasFavoritas.add(unaReceta);
  }
  
  public boolean quitarFavorita(final Receta unaReceta) {
    return this.recetasFavoritas.remove(unaReceta);
  }
  
  public boolean favearReceta(final Receta unaReceta) {
    boolean _xifexpression = false;
    boolean _contains = this.recetasFavoritas.contains(unaReceta);
    if (_contains) {
      _xifexpression = this.recetasFavoritas.remove(unaReceta);
    } else {
      _xifexpression = this.recetasFavoritas.add(unaReceta);
    }
    return _xifexpression;
  }
  
  public void agregarRecetaFavorita(final Grupo unGrupo, final String nombre) {
    Receta _devolverRecetaDeMiembro = unGrupo.devolverRecetaDeMiembro(nombre);
    this.recetasFavoritas.add(_devolverRecetaDeMiembro);
  }
  
  public void agregarResultadosDeConsultasAFavoritos() {
    this.resultadoDeConsultasAFavoritos = Boolean.valueOf(true);
  }
  
  public void noAgregarResultadosDeConsultasAFavoritos() {
    this.resultadoDeConsultasAFavoritos = Boolean.valueOf(false);
  }
  
  public boolean contenesEstaRecetaEnFavs(final Receta unaReceta) {
    return this.recetasFavoritas.contains(unaReceta);
  }
  
  public List<Receta> recetasQuePuedoVer() {
    List<Receta> _xblockexpression = null;
    {
      final List<Receta> recetasQueVeo = new ArrayList<Receta>();
      final Procedure1<Receta> _function = new Procedure1<Receta>() {
        public void apply(final Receta receta) {
          recetasQueVeo.add(receta);
        }
      };
      IterableExtensions.<Receta>forEach(this.recetario.recetas, _function);
      final Procedure1<Grupo> _function_1 = new Procedure1<Grupo>() {
        public void apply(final Grupo grupo) {
          final Iterable<Receta> _function = new Iterable<Receta>() {
            public Iterator<Receta> iterator() {
              Iterable<Receta> _recetasDelGrupoPara = grupo.recetasDelGrupoPara(Usuario.this);
              return _recetasDelGrupoPara.iterator();
            }
          };
          Iterables.<Receta>addAll(recetasQueVeo, _function);
        }
      };
      IterableExtensions.<Grupo>forEach(this.misGrupos, _function_1);
      final Iterable<Receta> _function_2 = new Iterable<Receta>() {
        public Iterator<Receta> iterator() {
          return Usuario.this.misRecetas.iterator();
        }
      };
      Iterables.<Receta>addAll(recetasQueVeo, _function_2);
      _xblockexpression = recetasQueVeo;
    }
    return _xblockexpression;
  }
  
  public boolean tePuedoSugerirEstaReceta(final Receta receta) {
    boolean _and = false;
    boolean _esInadecuadaParaUsuario = receta.esInadecuadaParaUsuario(this);
    boolean _not = (!_esInadecuadaParaUsuario);
    if (!_not) {
      _and = false;
    } else {
      boolean _noMeGustaEstaReceta = this.noMeGustaEstaReceta(receta);
      boolean _not_1 = (!_noMeGustaEstaReceta);
      _and = _not_1;
    }
    return _and;
  }
  
  public boolean noMeGustaEstaReceta(final Receta receta) {
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      public Boolean apply(final String ingrediente) {
        ArrayList<ElementoDeReceta> _elementosDeReceta = receta.getElementosDeReceta();
        final Function1<ElementoDeReceta, Boolean> _function = new Function1<ElementoDeReceta, Boolean>() {
          public Boolean apply(final ElementoDeReceta elem) {
            String _nombre = elem.getNombre();
            return Boolean.valueOf(_nombre.equals(ingrediente));
          }
        };
        return Boolean.valueOf(IterableExtensions.<ElementoDeReceta>exists(_elementosDeReceta, _function));
      }
    };
    return IterableExtensions.<String>exists(this.comidasQueNoMeGustan, _function);
  }
  
  public boolean tieneSobrepeso() {
    double _indiceDeMasaCorporal = this.indiceDeMasaCorporal();
    return (_indiceDeMasaCorporal >= 30);
  }
  
  public boolean tenesEstaCondicion(final Condicion unaCondicion) {
    final Function1<Condicion, Boolean> _function = new Function1<Condicion, Boolean>() {
      public Boolean apply(final Condicion condicion) {
        Class<? extends Condicion> _class = condicion.getClass();
        Class<? extends Condicion> _class_1 = unaCondicion.getClass();
        return Boolean.valueOf(_class.equals(_class_1));
      }
    };
    return IterableExtensions.<Condicion>exists(this.condicionesPreexistentes, _function);
  }
  
  public List<Receta> busquedaFiltrada() {
    List<Receta> _xblockexpression = null;
    {
      List<Receta> recetasFiltradas = this.recetasQuePuedoVer();
      boolean _isEmpty = this.misBusquedas.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        Iterator<Busqueda> iterBusqueda = this.misBusquedas.iterator();
        while (iterBusqueda.hasNext()) {
          Busqueda _next = iterBusqueda.next();
          List<Receta> _aplicarBusquedaUsuario = _next.aplicarBusquedaUsuario(this, recetasFiltradas);
          recetasFiltradas = _aplicarBusquedaUsuario;
        }
      }
      _xblockexpression = recetasFiltradas;
    }
    return _xblockexpression;
  }
  
  public boolean tieneFavorita(final Receta unaReceta) {
    return this.recetasFavoritas.contains(unaReceta);
  }
  
  public boolean sinFavoritas() {
    return this.recetasFavoritas.isEmpty();
  }
  
  public boolean sinConsultadas() {
    return this.ultimasConsultadas.isEmpty();
  }
  
  public Usuario validarPassword(final String unaPass) {
    Usuario _xifexpression = null;
    boolean _equals = unaPass.equals(this.password);
    if (_equals) {
      _xifexpression = this;
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  @Pure
  public Double getPeso() {
    return this.peso;
  }
  
  public void setPeso(final Double peso) {
    this.peso = peso;
  }
  
  @Pure
  public Double getAltura() {
    return this.altura;
  }
  
  public void setAltura(final Double altura) {
    this.altura = altura;
  }
  
  @Pure
  public GregorianCalendar getFechaDeNacimiento() {
    return this.fechaDeNacimiento;
  }
  
  public void setFechaDeNacimiento(final GregorianCalendar fechaDeNacimiento) {
    this.fechaDeNacimiento = fechaDeNacimiento;
  }
  
  @Pure
  public GregorianCalendar getDiaDeHoy() {
    return this.diaDeHoy;
  }
  
  public void setDiaDeHoy(final GregorianCalendar diaDeHoy) {
    this.diaDeHoy = diaDeHoy;
  }
  
  @Pure
  public String getSexo() {
    return this.sexo;
  }
  
  public void setSexo(final String sexo) {
    this.sexo = sexo;
  }
  
  @Pure
  public Rutina getRutina() {
    return this.rutina;
  }
  
  public void setRutina(final Rutina rutina) {
    this.rutina = rutina;
  }
  
  @Pure
  public List<Condicion> getCondicionesPreexistentes() {
    return this.condicionesPreexistentes;
  }
  
  public void setCondicionesPreexistentes(final List<Condicion> condicionesPreexistentes) {
    this.condicionesPreexistentes = condicionesPreexistentes;
  }
  
  @Pure
  public List<String> getComidasQueNoMeGustan() {
    return this.comidasQueNoMeGustan;
  }
  
  public void setComidasQueNoMeGustan(final List<String> comidasQueNoMeGustan) {
    this.comidasQueNoMeGustan = comidasQueNoMeGustan;
  }
  
  @Pure
  public List<Receta> getMisRecetas() {
    return this.misRecetas;
  }
  
  public void setMisRecetas(final List<Receta> misRecetas) {
    this.misRecetas = misRecetas;
  }
  
  @Pure
  public List<Grupo> getMisGrupos() {
    return this.misGrupos;
  }
  
  public void setMisGrupos(final List<Grupo> misGrupos) {
    this.misGrupos = misGrupos;
  }
  
  @Pure
  public List<Receta> getRecetasFavoritas() {
    return this.recetasFavoritas;
  }
  
  public void setRecetasFavoritas(final List<Receta> recetasFavoritas) {
    this.recetasFavoritas = recetasFavoritas;
  }
  
  @Pure
  public List<Receta> getUltimasConsultadas() {
    return this.ultimasConsultadas;
  }
  
  public void setUltimasConsultadas(final List<Receta> ultimasConsultadas) {
    this.ultimasConsultadas = ultimasConsultadas;
  }
  
  @Pure
  public String getDireccionCorreo() {
    return this.direccionCorreo;
  }
  
  public void setDireccionCorreo(final String direccionCorreo) {
    this.direccionCorreo = direccionCorreo;
  }
  
  @Pure
  public Boolean getResultadoDeConsultasAFavoritos() {
    return this.resultadoDeConsultasAFavoritos;
  }
  
  public void setResultadoDeConsultasAFavoritos(final Boolean resultadoDeConsultasAFavoritos) {
    this.resultadoDeConsultasAFavoritos = resultadoDeConsultasAFavoritos;
  }
  
  @Pure
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(final String password) {
    this.password = password;
  }
}
