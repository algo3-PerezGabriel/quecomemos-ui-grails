package ar.edu.unsam.dieta.tp.model.app;

import ar.edu.unsam.dieta.tp.model.app.QueComemosAppModel;
import ar.tp.dieta.RepoDeUsuarios;
import ar.tp.dieta.Usuario;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class LoginUserModel {
  public RepoDeUsuarios repoUsuarios = new RepoDeUsuarios();
  
  private String nombreUsuario;
  
  private String passwordUsuario;
  
  public QueComemosAppModel validarLogin() {
    Usuario _logearUsuario = this.repoUsuarios.logearUsuario(this.nombreUsuario, this.passwordUsuario);
    return new QueComemosAppModel(_logearUsuario);
  }
  
  @Pure
  public RepoDeUsuarios getRepoUsuarios() {
    return this.repoUsuarios;
  }
  
  public void setRepoUsuarios(final RepoDeUsuarios repoUsuarios) {
    this.repoUsuarios = repoUsuarios;
  }
  
  @Pure
  public String getNombreUsuario() {
    return this.nombreUsuario;
  }
  
  public void setNombreUsuario(final String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }
  
  @Pure
  public String getPasswordUsuario() {
    return this.passwordUsuario;
  }
  
  public void setPasswordUsuario(final String passwordUsuario) {
    this.passwordUsuario = passwordUsuario;
  }
}
