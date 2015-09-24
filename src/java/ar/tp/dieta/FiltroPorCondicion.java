package ar.tp.dieta;

import ar.tp.dieta.Filtro;
import ar.tp.dieta.Grupo;
import ar.tp.dieta.Receta;
import ar.tp.dieta.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class FiltroPorCondicion implements Filtro {
  public List<Receta> aplicarFiltroUsuario(final Usuario unUsuario, final List<Receta> recetas) {
    List<Receta> _xblockexpression = null;
    {
      final List<Receta> recetasFiltradas = new ArrayList<Receta>();
      final Procedure1<Receta> _function = new Procedure1<Receta>() {
        public void apply(final Receta receta) {
          boolean _esInadecuadaParaUsuario = receta.esInadecuadaParaUsuario(unUsuario);
          if (_esInadecuadaParaUsuario) {
            recetasFiltradas.add(receta);
          }
        }
      };
      IterableExtensions.<Receta>forEach(recetas, _function);
      _xblockexpression = recetasFiltradas;
    }
    return _xblockexpression;
  }
  
  public List<Receta> aplicarFiltroGrupo(final Grupo unGrupo, final List<Receta> recetasSinFiltrar) {
    List<Receta> _xblockexpression = null;
    {
      final List<Receta> recetasFiltradas = new ArrayList<Receta>();
      final Procedure1<Receta> _function = new Procedure1<Receta>() {
        public void apply(final Receta receta) {
          boolean _esInadecuadaParaGrupo = receta.esInadecuadaParaGrupo(unGrupo);
          boolean _not = (!_esInadecuadaParaGrupo);
          if (_not) {
            recetasFiltradas.add(receta);
          }
        }
      };
      IterableExtensions.<Receta>forEach(recetasSinFiltrar, _function);
      _xblockexpression = recetasFiltradas;
    }
    return _xblockexpression;
  }
}
