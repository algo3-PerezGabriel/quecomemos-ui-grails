package ar.tp.dieta;

import ar.tp.dieta.Ingrediente;
import ar.tp.dieta.Receta;
import ar.tp.dieta.Usuario;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Observable
@Accessors
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class RecetaBuilder {
  private Receta receta;
  
  public RecetaBuilder(final String nombreReceta) {
    Receta _receta = new Receta();
    this.receta = _receta;
    this.receta.setNombreDeLaReceta(nombreReceta);
  }
  
  public RecetaBuilder calorias(final int calorias) {
    this.receta.setCalorias(calorias);
    return this;
  }
  
  public RecetaBuilder owner(final Usuario autor) {
    this.receta.setOwner(autor);
    return this;
  }
  
  public RecetaBuilder dificultad(final String dificultad) {
    this.receta.setDificultadDePreparacion(dificultad);
    return this;
  }
  
  public RecetaBuilder procesoPreparacion(final String procesoPreparacion) {
    this.receta.setProcesoDePreparacion(procesoPreparacion);
    return this;
  }
  
  public RecetaBuilder temporada(final String temporada) {
    this.receta.setTemporadaALaQueCorresponde(temporada);
    return this;
  }
  
  public RecetaBuilder agregarIngrediente(final Ingrediente unIngrediente) {
    this.receta.agregarIngrediente(unIngrediente);
    return this;
  }
  
  public RecetaBuilder agregarCondimento(final Ingrediente unCondimento) {
    this.receta.agregarCondimento(unCondimento);
    return this;
  }
  
  public Receta build() {
    return this.receta;
  }
  
  @Pure
  public Receta getReceta() {
    return this.receta;
  }
  
  public void setReceta(final Receta receta) {
    this.receta = receta;
  }
}
