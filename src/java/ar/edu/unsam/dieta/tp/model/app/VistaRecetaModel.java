package ar.edu.unsam.dieta.tp.model.app;

import ar.edu.unsam.dieta.tp.model.app.CopiarRecetaModelo;
import ar.tp.dieta.Receta;
import ar.tp.dieta.Usuario;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class VistaRecetaModel {
  private Usuario elUsuario;
  
  private Receta laReceta;
  
  public VistaRecetaModel(final Usuario unUsuario, final Receta unaReceta) {
    this.elUsuario = unUsuario;
    this.laReceta = unaReceta;
  }
  
  public boolean getEsFavorita() {
    return this.elUsuario.tieneFavorita(this.laReceta);
  }
  
  public void setEsFavorita(final boolean valor) {
    this.elUsuario.favearReceta(this.laReceta);
    boolean _tieneFavorita = this.elUsuario.tieneFavorita(this.laReceta);
    this.setEsFavorita(_tieneFavorita);
  }
  
  public CopiarRecetaModelo inicializarModeloCopiar() {
    return new CopiarRecetaModelo(this.elUsuario, this.laReceta);
  }
  
  @Pure
  public Usuario getElUsuario() {
    return this.elUsuario;
  }
  
  public void setElUsuario(final Usuario elUsuario) {
    this.elUsuario = elUsuario;
  }
  
  @Pure
  public Receta getLaReceta() {
    return this.laReceta;
  }
  
  public void setLaReceta(final Receta laReceta) {
    this.laReceta = laReceta;
  }
}
