package ar.tp.dieta;

import ar.tp.dieta.Condicion;
import ar.tp.dieta.ElementoDeReceta;
import ar.tp.dieta.Usuario;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class CondicionVegano extends Condicion {
  private List<String> elementosNoRecomendables = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("pollo", "carne", "chivito", "chori", "lomo"));
  
  public boolean esVegano() {
    return true;
  }
  
  public boolean seSubsana(final Usuario unUsuario) {
    return unUsuario.meGustaLaFruta();
  }
  
  public boolean validarCondicion(final Usuario unUsuario) {
    boolean _meGustaLaCarne = unUsuario.meGustaLaCarne();
    return (!_meGustaLaCarne);
  }
  
  public boolean ingredienteEsInadecuado(final ElementoDeReceta unElemento) {
    String _nombre = unElemento.getNombre();
    return this.elementosNoRecomendables.contains(_nombre);
  }
  
  @Pure
  public List<String> getElementosNoRecomendables() {
    return this.elementosNoRecomendables;
  }
  
  public void setElementosNoRecomendables(final List<String> elementosNoRecomendables) {
    this.elementosNoRecomendables = elementosNoRecomendables;
  }
}
