package ar.edu.unsam.dieta.tp.model.app;

import ar.edu.unsam.dieta.tp.model.app.VistaRecetaModel;
import ar.tp.dieta.Busqueda;
import ar.tp.dieta.Filtro;
import ar.tp.dieta.FiltroPorTemporada;
import ar.tp.dieta.Receta;
import ar.tp.dieta.RecetarioPublico;
import ar.tp.dieta.RepoRecetas;
import ar.tp.dieta.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Observable
@Accessors
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class QueComemosAppModel {
  private Usuario theUser;
  
  private String outputTituloGrilla;
  
  private Receta recetaSeleccionada;
  
  private List<Receta> recetasEnGrilla = new ArrayList<Receta>();
  
  private RecetarioPublico recetario = new RepoRecetas().getRecetarioPublico();
  
  private String conNombre;
  
  private String conDificultad;
  
  private String conIngrediente;
  
  private String conTemporada;
  
  private int caloriasInferior;
  
  private int caloriasSuperior;
  
  private boolean conFiltrosUsuario;
  
  public QueComemosAppModel(final Usuario elUsr) {
    this.theUser = elUsr;
    List<Receta> _decidirRecetas = this.decidirRecetas();
    this.recetasEnGrilla = _decidirRecetas;
  }
  
  public List<Receta> decidirRecetas() {
    List<Receta> _xifexpression = null;
    boolean _sinFavoritas = this.theUser.sinFavoritas();
    boolean _not = (!_sinFavoritas);
    if (_not) {
      List<Receta> _xblockexpression = null;
      {
        this.outputTituloGrilla = "Estas son tus recetas favoritas";
        _xblockexpression = this.theUser.getRecetasFavoritas();
      }
      _xifexpression = _xblockexpression;
    } else {
      List<Receta> _xifexpression_1 = null;
      boolean _sinConsultadas = this.theUser.sinConsultadas();
      boolean _not_1 = (!_sinConsultadas);
      if (_not_1) {
        List<Receta> _xblockexpression_1 = null;
        {
          this.outputTituloGrilla = "Estas fueron tus últimas consultas";
          _xblockexpression_1 = this.theUser.getUltimasConsultadas();
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        List<Receta> _xblockexpression_2 = null;
        {
          this.outputTituloGrilla = "Estas son las recetas top del momento";
          _xblockexpression_2 = this.recetario.getRecetas();
        }
        _xifexpression_1 = _xblockexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public boolean favearReceta() {
    return this.theUser.favearReceta(this.recetaSeleccionada);
  }
  
  public VistaRecetaModel vistaDetalle() {
    return new VistaRecetaModel(this.theUser, this.recetaSeleccionada);
  }
  
  public void ejecutarBusqueda() {
    this.outputTituloGrilla = "Resultado de la busqueda";
    final Busqueda busqueda = new Busqueda();
    List<Filtro> _crearFiltros = this.crearFiltros();
    busqueda.filtros = _crearFiltros;
    List<Receta> _recetas = this.recetario.getRecetas();
    List<Receta> _aplicarBusquedaUsuario = busqueda.aplicarBusquedaUsuario(this.theUser, _recetas);
    this.recetasEnGrilla = _aplicarBusquedaUsuario;
    this.theUser.setUltimasConsultadas(this.recetasEnGrilla);
  }
  
  public List<Filtro> crearFiltros() {
    List<Filtro> _xblockexpression = null;
    {
      List<Filtro> filtros = new ArrayList<Filtro>();
      final Procedure1<List<Filtro>> _function = new Procedure1<List<Filtro>>() {
        public void apply(final List<Filtro> it) {
          FiltroPorTemporada _filtroPorTemporada = new FiltroPorTemporada(QueComemosAppModel.this.conTemporada);
          it.add(_filtroPorTemporada);
        }
      };
      ObjectExtensions.<List<Filtro>>operator_doubleArrow(filtros, _function);
      _xblockexpression = filtros;
    }
    return _xblockexpression;
  }
  
  @Pure
  public Usuario getTheUser() {
    return this.theUser;
  }
  
  public void setTheUser(final Usuario theUser) {
    this.theUser = theUser;
  }
  
  @Pure
  public String getOutputTituloGrilla() {
    return this.outputTituloGrilla;
  }
  
  public void setOutputTituloGrilla(final String outputTituloGrilla) {
    this.outputTituloGrilla = outputTituloGrilla;
  }
  
  @Pure
  public Receta getRecetaSeleccionada() {
    return this.recetaSeleccionada;
  }
  
  public void setRecetaSeleccionada(final Receta recetaSeleccionada) {
    this.recetaSeleccionada = recetaSeleccionada;
  }
  
  @Pure
  public List<Receta> getRecetasEnGrilla() {
    return this.recetasEnGrilla;
  }
  
  public void setRecetasEnGrilla(final List<Receta> recetasEnGrilla) {
    this.recetasEnGrilla = recetasEnGrilla;
  }
  
  @Pure
  public RecetarioPublico getRecetario() {
    return this.recetario;
  }
  
  public void setRecetario(final RecetarioPublico recetario) {
    this.recetario = recetario;
  }
  
  @Pure
  public String getConNombre() {
    return this.conNombre;
  }
  
  public void setConNombre(final String conNombre) {
    this.conNombre = conNombre;
  }
  
  @Pure
  public String getConDificultad() {
    return this.conDificultad;
  }
  
  public void setConDificultad(final String conDificultad) {
    this.conDificultad = conDificultad;
  }
  
  @Pure
  public String getConIngrediente() {
    return this.conIngrediente;
  }
  
  public void setConIngrediente(final String conIngrediente) {
    this.conIngrediente = conIngrediente;
  }
  
  @Pure
  public String getConTemporada() {
    return this.conTemporada;
  }
  
  public void setConTemporada(final String conTemporada) {
    this.conTemporada = conTemporada;
  }
  
  @Pure
  public int getCaloriasInferior() {
    return this.caloriasInferior;
  }
  
  public void setCaloriasInferior(final int caloriasInferior) {
    this.caloriasInferior = caloriasInferior;
  }
  
  @Pure
  public int getCaloriasSuperior() {
    return this.caloriasSuperior;
  }
  
  public void setCaloriasSuperior(final int caloriasSuperior) {
    this.caloriasSuperior = caloriasSuperior;
  }
  
  @Pure
  public boolean isConFiltrosUsuario() {
    return this.conFiltrosUsuario;
  }
  
  public void setConFiltrosUsuario(final boolean conFiltrosUsuario) {
    this.conFiltrosUsuario = conFiltrosUsuario;
  }
}
