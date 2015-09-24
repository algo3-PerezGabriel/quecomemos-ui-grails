package ar.tp.dieta;

import ar.tp.dieta.Condicion;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Observable
@Accessors
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public abstract class ElementoDeReceta {
  private String nombre = new String();
  
  private int cantidad = 0;
  
  private boolean ingrediente = false;
  
  private boolean condimento = false;
  
  public abstract boolean soyInadecuadoParaCondicion(final Condicion unaCondicion);
  
  public String getNombre() {
    return this.nombre;
  }
  
  public boolean sosIngrediente() {
    return this.ingrediente;
  }
  
  public boolean sosCondimento() {
    return this.condimento;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public int getCantidad() {
    return this.cantidad;
  }
  
  public void setCantidad(final int cantidad) {
    this.cantidad = cantidad;
  }
  
  @Pure
  public boolean isIngrediente() {
    return this.ingrediente;
  }
  
  public void setIngrediente(final boolean ingrediente) {
    this.ingrediente = ingrediente;
  }
  
  @Pure
  public boolean isCondimento() {
    return this.condimento;
  }
  
  public void setCondimento(final boolean condimento) {
    this.condimento = condimento;
  }
}
