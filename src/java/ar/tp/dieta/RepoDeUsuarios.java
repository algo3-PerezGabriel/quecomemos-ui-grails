package ar.tp.dieta;

import ar.tp.dieta.CondicionHipertension;
import ar.tp.dieta.Receta;
import ar.tp.dieta.RepoRecetas;
import ar.tp.dieta.RutinaSedentaria;
import ar.tp.dieta.Usuario;
import ar.tp.dieta.UsuarioBuilder;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class RepoDeUsuarios extends RepoRecetas {
  public Usuario tojo;
  
  public Usuario juan;
  
  private List<Receta> topTenConsultas = new ArrayList<Receta>();
  
  private List<Usuario> usuarios = new ArrayList<Usuario>();
  
  public RepoDeUsuarios() {
    UsuarioBuilder _usuarioBuilder = new UsuarioBuilder("Daniel");
    UsuarioBuilder _peso = _usuarioBuilder.peso(Double.valueOf(120.4));
    UsuarioBuilder _altura = _peso.altura(Double.valueOf(1.89));
    UsuarioBuilder _fechaNacimiento = _altura.fechaNacimiento(1992, 6, 4);
    UsuarioBuilder _sexo = _fechaNacimiento.sexo("M");
    RutinaSedentaria _rutinaSedentaria = new RutinaSedentaria();
    UsuarioBuilder _rutina = _sexo.rutina(_rutinaSedentaria);
    UsuarioBuilder _preferencia = _rutina.preferencia("carne");
    CondicionHipertension _condicionHipertension = new CondicionHipertension();
    UsuarioBuilder _condicion = _preferencia.condicion(_condicionHipertension);
    UsuarioBuilder _conRecetaFavorita = _condicion.conRecetaFavorita(this.fideosConManteca);
    UsuarioBuilder _conRecetaFavorita_1 = _conRecetaFavorita.conRecetaFavorita(this.arrozConPollo);
    UsuarioBuilder _conRecetaFavorita_2 = _conRecetaFavorita_1.conRecetaFavorita(this.gelatinaFrambuesa);
    UsuarioBuilder _email = _conRecetaFavorita_2.email("dtoja@unsam.edu.ar");
    UsuarioBuilder _conPassword = _email.conPassword("daniel");
    Usuario _build = _conPassword.build();
    this.tojo = _build;
    UsuarioBuilder _usuarioBuilder_1 = new UsuarioBuilder("Juan");
    UsuarioBuilder _peso_1 = _usuarioBuilder_1.peso(Double.valueOf(80.0));
    UsuarioBuilder _altura_1 = _peso_1.altura(Double.valueOf(1.87));
    UsuarioBuilder _fechaNacimiento_1 = _altura_1.fechaNacimiento(1991, 8, 1);
    UsuarioBuilder _sexo_1 = _fechaNacimiento_1.sexo("M");
    UsuarioBuilder _email_1 = _sexo_1.email("jcantarini@unsam.edu.ar");
    UsuarioBuilder _conPassword_1 = _email_1.conPassword("juan");
    Usuario _build_1 = _conPassword_1.build();
    this.juan = _build_1;
    this.usuarios.add(this.tojo);
    this.usuarios.add(this.juan);
  }
  
  public Usuario logearUsuario(final String nombre, final String password) {
    Usuario _xblockexpression = null;
    {
      final Function1<Usuario, Boolean> _function = new Function1<Usuario, Boolean>() {
        public Boolean apply(final Usuario u) {
          String _nombre = u.getNombre();
          return Boolean.valueOf(_nombre.equals(nombre));
        }
      };
      Usuario elUsr = IterableExtensions.<Usuario>findFirst(this.usuarios, _function);
      Usuario _xifexpression = null;
      boolean _equals = Objects.equal(elUsr, null);
      if (_equals) {
        _xifexpression = null;
      } else {
        _xifexpression = elUsr.validarPassword(password);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Pure
  public Usuario getTojo() {
    return this.tojo;
  }
  
  public void setTojo(final Usuario tojo) {
    this.tojo = tojo;
  }
  
  @Pure
  public Usuario getJuan() {
    return this.juan;
  }
  
  public void setJuan(final Usuario juan) {
    this.juan = juan;
  }
  
  @Pure
  public List<Receta> getTopTenConsultas() {
    return this.topTenConsultas;
  }
  
  public void setTopTenConsultas(final List<Receta> topTenConsultas) {
    this.topTenConsultas = topTenConsultas;
  }
  
  @Pure
  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }
  
  public void setUsuarios(final List<Usuario> usuarios) {
    this.usuarios = usuarios;
  }
}
