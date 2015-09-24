package ar.tp.dieta;

import ar.tp.dieta.Filtro;
import ar.tp.dieta.Grupo;
import ar.tp.dieta.Receta;
import ar.tp.dieta.Usuario;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class PosteriorBusquedaOrdenadoCalorias implements Filtro {
  public List<Receta> aplicarFiltroUsuario(final Usuario unUsuario, final List<Receta> recetasSinFiltrar) {
    final Function1<Receta, Integer> _function = new Function1<Receta, Integer>() {
      public Integer apply(final Receta it) {
        return Integer.valueOf(it.getCalorias());
      }
    };
    return IterableExtensions.<Receta, Integer>sortBy(recetasSinFiltrar, _function);
  }
  
  public List<Receta> aplicarFiltroGrupo(final Grupo unGrupo, final List<Receta> recetasSinFiltrar) {
    final Function1<Receta, Integer> _function = new Function1<Receta, Integer>() {
      public Integer apply(final Receta it) {
        return Integer.valueOf(it.getCalorias());
      }
    };
    return IterableExtensions.<Receta, Integer>sortBy(recetasSinFiltrar, _function);
  }
}
