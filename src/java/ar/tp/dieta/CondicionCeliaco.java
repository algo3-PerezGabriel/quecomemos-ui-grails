package ar.tp.dieta;

import ar.tp.dieta.Condicion;
import ar.tp.dieta.ElementoDeReceta;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;

@Accessors
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class CondicionCeliaco extends Condicion {
  public boolean esCeliaco() {
    return true;
  }
  
  public boolean ingredienteEsInadecuado(final ElementoDeReceta unElemento) {
    return false;
  }
}
