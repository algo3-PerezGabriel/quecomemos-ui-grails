package ar.tp.dieta;

import ar.tp.dieta.ElementoDeReceta;
import ar.tp.dieta.Usuario;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.uqbar.commons.utils.Observable;

@Observable
@Accessors
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public abstract class Condicion {
  public boolean esDiabetes() {
    return false;
  }
  
  public boolean esHipertension() {
    return false;
  }
  
  public boolean esVegano() {
    return false;
  }
  
  public boolean esCeliaco() {
    return false;
  }
  
  public boolean seSubsana(final Usuario unUsuario) {
    return true;
  }
  
  public boolean validarCondicion(final Usuario unUsuario) {
    return true;
  }
  
  public boolean ingredienteEsInadecuado(final ElementoDeReceta unElemento) {
    return false;
  }
}
