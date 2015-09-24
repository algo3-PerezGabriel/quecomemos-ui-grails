package ar.tp.dieta;

import ar.tp.dieta.BusinessException;
import ar.tp.dieta.Receta;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class RecetarioPublico implements Cloneable {
  public List<Receta> recetas = new ArrayList<Receta>();
  
  public void agregarReceta(final Receta unaReceta) {
    this.recetas.add(unaReceta);
  }
  
  public void mirarRecetario() {
    final Procedure1<Receta> _function = new Procedure1<Receta>() {
      public void apply(final Receta receta) {
        String _nombreDeLaReceta = receta.getNombreDeLaReceta();
        InputOutput.<String>println(_nombreDeLaReceta);
      }
    };
    IterableExtensions.<Receta>forEach(this.recetas, _function);
  }
  
  public Receta elegirReceta(final String nombre) {
    Receta _xblockexpression = null;
    {
      Receta _busquedaReceta = this.busquedaReceta(nombre);
      boolean _equals = Objects.equal(_busquedaReceta, null);
      if (_equals) {
        throw new BusinessException("La receta buscada no existe.");
      }
      _xblockexpression = this.busquedaReceta(nombre);
    }
    return _xblockexpression;
  }
  
  public Receta busquedaReceta(final String nombreReceta) {
    final Function1<Receta, Boolean> _function = new Function1<Receta, Boolean>() {
      public Boolean apply(final Receta receta) {
        String _nombreDeLaReceta = receta.getNombreDeLaReceta();
        return Boolean.valueOf(_nombreDeLaReceta.equals(nombreReceta));
      }
    };
    return IterableExtensions.<Receta>findFirst(this.recetas, _function);
  }
  
  /**
   * copiarReceta inicializa una nueva variable recetaTemporal, a
   * la que se le va a asignar la coincidencia de buscar la receta
   * requerida en el listado de recetas (metodo busquedaReceta)
   * luego se copiaran todos los atributos 1x1 de una receta a otra y
   *  se retornara la nueva Receta con todos los atributos copiados
   */
  public boolean recetarioContiene(final Receta unaReceta) {
    return this.recetas.contains(unaReceta);
  }
  
  @Pure
  public List<Receta> getRecetas() {
    return this.recetas;
  }
  
  public void setRecetas(final List<Receta> recetas) {
    this.recetas = recetas;
  }
}
