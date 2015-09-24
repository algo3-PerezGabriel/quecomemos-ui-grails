package ar.tp.dieta;

import ar.tp.dieta.Filtro;
import ar.tp.dieta.Grupo;
import ar.tp.dieta.Receta;
import ar.tp.dieta.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class FiltroPorIngredienteCaro implements Filtro {
  private final String[] elementosCaros = { "lechon", "lomo", "salmon", "alcaparras" };
  
  public List<Receta> aplicarFiltroUsuario(final Usuario unUsuario, final List<Receta> recetas) {
    List<Receta> _xblockexpression = null;
    {
      final List<Receta> recetasFinal = new ArrayList<Receta>();
      final Procedure1<Receta> _function = new Procedure1<Receta>() {
        public void apply(final Receta receta) {
          boolean _contieneAlguno = receta.contieneAlguno(((List<String>)Conversions.doWrapArray(FiltroPorIngredienteCaro.this.elementosCaros)));
          boolean _not = (!_contieneAlguno);
          if (_not) {
            recetasFinal.add(receta);
          }
        }
      };
      IterableExtensions.<Receta>forEach(recetas, _function);
      _xblockexpression = recetasFinal;
    }
    return _xblockexpression;
  }
  
  public List<Receta> aplicarFiltroGrupo(final Grupo unGrupo, final List<Receta> recetasSinFiltrar) {
    return null;
  }
}
