package ar.edu.unsam.dieta.tp.model.app;

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
public class CopiarRecetaModelo {
  private Usuario elUsr;
  
  private Receta laReceta;
  
  private String nombreReceta;
  
  public CopiarRecetaModelo(final Usuario unUsr, final Receta unaReceta) {
    this.elUsr = unUsr;
    this.laReceta = unaReceta;
    String _nombreDeLaReceta = unaReceta.getNombreDeLaReceta();
    String _plus = ("Mi " + _nombreDeLaReceta);
    this.nombreReceta = _plus;
  }
  
  public String getNombreOrigen() {
    return this.laReceta.getNombreDeLaReceta();
  }
  
  public void copiarReceta() {
    Receta _clonateConNombre = this.laReceta.clonateConNombre(this.nombreReceta);
    this.elUsr.agregarReceta(_clonateConNombre);
  }
  
  @Pure
  public Usuario getElUsr() {
    return this.elUsr;
  }
  
  public void setElUsr(final Usuario elUsr) {
    this.elUsr = elUsr;
  }
  
  @Pure
  public Receta getLaReceta() {
    return this.laReceta;
  }
  
  public void setLaReceta(final Receta laReceta) {
    this.laReceta = laReceta;
  }
  
  @Pure
  public String getNombreReceta() {
    return this.nombreReceta;
  }
  
  public void setNombreReceta(final String nombreReceta) {
    this.nombreReceta = nombreReceta;
  }
}
