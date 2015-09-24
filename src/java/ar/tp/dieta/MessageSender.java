package ar.tp.dieta;

import ar.tp.dieta.Email;
import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public interface MessageSender {
  public abstract void send(final Email mail);
}
