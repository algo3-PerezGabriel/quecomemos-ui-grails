package ar.tp.dieta;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class JsonSimpleReader {
  public List<String> parseJsonNombre(final String recetaString) {
    List<String> _xblockexpression = null;
    {
      final List<String> nombreDeLasRecetasFinal = new ArrayList<String>();
      List<String> nombresRecetas = new ArrayList<String>();
      JsonArray jsonArray = this.stringToJsonArray(recetaString);
      int i = 0;
      while ((i < jsonArray.size())) {
        {
          JsonElement _get = jsonArray.get(i);
          JsonObject _asJsonObject = _get.getAsJsonObject();
          JsonElement _get_1 = _asJsonObject.get("nombre");
          String _string = _get_1.toString();
          nombresRecetas.add(_string);
          i++;
        }
      }
      final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String nombre) {
          int _length = nombre.length();
          int _minus = (_length - 1);
          String _substring = nombre.substring(1, _minus);
          nombreDeLasRecetasFinal.add(_substring);
        }
      };
      IterableExtensions.<String>forEach(nombresRecetas, _function);
      _xblockexpression = nombreDeLasRecetasFinal;
    }
    return _xblockexpression;
  }
  
  protected JsonArray stringToJsonArray(final String aString) {
    JsonParser parser = new JsonParser();
    JsonElement tradeElement = parser.parse(aString);
    return tradeElement.getAsJsonArray();
  }
}
