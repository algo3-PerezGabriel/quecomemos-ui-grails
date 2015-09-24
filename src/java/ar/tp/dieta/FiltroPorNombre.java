package ar.tp.dieta;

import ar.tp.dieta.Filtro;
import ar.tp.dieta.Grupo;
import ar.tp.dieta.Receta;
import ar.tp.dieta.Usuario;
import com.google.common.base.Objects;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class FiltroPorNombre implements Filtro {
  private String nombre;
  
  public FiltroPorNombre(final String unNombre) {
    this.nombre = unNombre;
  }
  
  public List<Receta> aplicarFiltroUsuario(final Usuario unUsuario, final List<Receta> recetasSinFiltrar) {
    List<Receta> _xifexpression = null;
    boolean _equals = Objects.equal(this.nombre, null);
    if (_equals) {
      return recetasSinFiltrar;
    } else {
      final Function1<Receta, Boolean> _function = new Function1<Receta, Boolean>() {
        public Boolean apply(final Receta it) {
          String _devolverNombre = it.devolverNombre();
          return Boolean.valueOf(_devolverNombre.equals(FiltroPorNombre.this.nombre));
        }
      };
      Iterable<Receta> _filter = IterableExtensions.<Receta>filter(recetasSinFiltrar, _function);
      _xifexpression = IterableExtensions.<Receta>toList(_filter);
    }
    return _xifexpression;
  }
  
  public List<Receta> aplicarFiltroGrupo(final Grupo unGrupo, final List<Receta> recetasSinFiltrar) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
