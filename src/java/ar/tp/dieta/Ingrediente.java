package ar.tp.dieta;

import ar.tp.dieta.Condicion;
import ar.tp.dieta.ElementoDeReceta;
import javax.annotation.Generated;
import org.uqbar.commons.utils.Observable;

@Observable
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class Ingrediente extends ElementoDeReceta {
  public boolean soyInadecuadoParaCondicion(final Condicion unaCondicion) {
    return unaCondicion.ingredienteEsInadecuado(this);
  }
  
  public void setCondimento() {
    this.setCondimento(true);
    this.setIngrediente(false);
  }
  
  public void setIngrediente() {
    this.setIngrediente(true);
    this.setCondimento(false);
  }
}
