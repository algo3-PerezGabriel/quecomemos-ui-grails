package ar.tp.dieta;

import ar.tp.dieta.Ingrediente;
import ar.tp.dieta.IngredienteBuilder;
import ar.tp.dieta.Receta;
import ar.tp.dieta.RecetaBuilder;
import ar.tp.dieta.RecetarioPublico;
import ar.tp.dieta.RutinaSedentaria;
import ar.tp.dieta.Usuario;
import ar.tp.dieta.UsuarioBuilder;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class RepoRecetas {
  protected Ingrediente pollo;
  
  protected Ingrediente arroz;
  
  protected Ingrediente azafran;
  
  protected Ingrediente sal;
  
  protected Ingrediente cebolla;
  
  protected Ingrediente lomo;
  
  protected Ingrediente azucar;
  
  protected Ingrediente cereal;
  
  protected Ingrediente pasta;
  
  protected Ingrediente mostaza;
  
  protected Ingrediente manteca;
  
  protected Ingrediente gelatina;
  
  protected Ingrediente tomate;
  
  protected Ingrediente lechuga;
  
  protected Ingrediente salmon;
  
  protected Ingrediente lechon;
  
  protected Ingrediente molleja;
  
  protected Ingrediente vacio;
  
  protected Ingrediente pechitoDeCerdo;
  
  public Receta lomoMostaza;
  
  public Receta arrozConPollo;
  
  public Receta fideosConManteca;
  
  public Receta gelatinaFrambuesa;
  
  public Receta ensalada;
  
  public Receta arrozBlanco;
  
  public Receta asado;
  
  public RecetarioPublico recetarioPublico = new RecetarioPublico();
  
  public Usuario usuarioPublico;
  
  public RepoRecetas() {
    IngredienteBuilder _ingredienteBuilder = new IngredienteBuilder("arroz");
    IngredienteBuilder _cantidad = _ingredienteBuilder.cantidad(500);
    Ingrediente _build = _cantidad.build();
    this.arroz = _build;
    IngredienteBuilder _ingredienteBuilder_1 = new IngredienteBuilder("pollo");
    IngredienteBuilder _cantidad_1 = _ingredienteBuilder_1.cantidad(1000);
    Ingrediente _build_1 = _cantidad_1.build();
    this.pollo = _build_1;
    IngredienteBuilder _ingredienteBuilder_2 = new IngredienteBuilder("lomo");
    IngredienteBuilder _cantidad_2 = _ingredienteBuilder_2.cantidad(1000);
    Ingrediente _build_2 = _cantidad_2.build();
    this.lomo = _build_2;
    IngredienteBuilder _ingredienteBuilder_3 = new IngredienteBuilder("pasta");
    IngredienteBuilder _cantidad_3 = _ingredienteBuilder_3.cantidad(500);
    Ingrediente _build_3 = _cantidad_3.build();
    this.pasta = _build_3;
    IngredienteBuilder _ingredienteBuilder_4 = new IngredienteBuilder("cebolla");
    IngredienteBuilder _cantidad_4 = _ingredienteBuilder_4.cantidad(150);
    Ingrediente _build_4 = _cantidad_4.build();
    this.cebolla = _build_4;
    IngredienteBuilder _ingredienteBuilder_5 = new IngredienteBuilder("mostaza");
    IngredienteBuilder _cantidad_5 = _ingredienteBuilder_5.cantidad(30);
    Ingrediente _build_5 = _cantidad_5.build();
    this.mostaza = _build_5;
    IngredienteBuilder _ingredienteBuilder_6 = new IngredienteBuilder("manteca");
    IngredienteBuilder _cantidad_6 = _ingredienteBuilder_6.cantidad(10);
    Ingrediente _build_6 = _cantidad_6.build();
    this.manteca = _build_6;
    IngredienteBuilder _ingredienteBuilder_7 = new IngredienteBuilder("gelatina");
    IngredienteBuilder _cantidad_7 = _ingredienteBuilder_7.cantidad(250);
    Ingrediente _build_7 = _cantidad_7.build();
    this.gelatina = _build_7;
    IngredienteBuilder _ingredienteBuilder_8 = new IngredienteBuilder("tomate");
    IngredienteBuilder _cantidad_8 = _ingredienteBuilder_8.cantidad(150);
    Ingrediente _build_8 = _cantidad_8.build();
    this.tomate = _build_8;
    IngredienteBuilder _ingredienteBuilder_9 = new IngredienteBuilder("lechuga");
    IngredienteBuilder _cantidad_9 = _ingredienteBuilder_9.cantidad(300);
    Ingrediente _build_9 = _cantidad_9.build();
    this.lechuga = _build_9;
    IngredienteBuilder _ingredienteBuilder_10 = new IngredienteBuilder("molleja");
    IngredienteBuilder _cantidad_10 = _ingredienteBuilder_10.cantidad(300);
    Ingrediente _build_10 = _cantidad_10.build();
    this.molleja = _build_10;
    IngredienteBuilder _ingredienteBuilder_11 = new IngredienteBuilder("vacio");
    IngredienteBuilder _cantidad_11 = _ingredienteBuilder_11.cantidad(1500);
    Ingrediente _build_11 = _cantidad_11.build();
    this.vacio = _build_11;
    IngredienteBuilder _ingredienteBuilder_12 = new IngredienteBuilder("pechito de cerdo");
    IngredienteBuilder _cantidad_12 = _ingredienteBuilder_12.cantidad(1500);
    Ingrediente _build_12 = _cantidad_12.build();
    this.pechitoDeCerdo = _build_12;
    IngredienteBuilder _ingredienteBuilder_13 = new IngredienteBuilder("azucar");
    IngredienteBuilder _cantidad_13 = _ingredienteBuilder_13.cantidad(500);
    Ingrediente _build_13 = _cantidad_13.build();
    this.azucar = _build_13;
    IngredienteBuilder _ingredienteBuilder_14 = new IngredienteBuilder("azafran");
    IngredienteBuilder _cantidad_14 = _ingredienteBuilder_14.cantidad(2);
    Ingrediente _build_14 = _cantidad_14.build();
    this.azafran = _build_14;
    IngredienteBuilder _ingredienteBuilder_15 = new IngredienteBuilder("sal");
    IngredienteBuilder _cantidad_15 = _ingredienteBuilder_15.cantidad(2);
    Ingrediente _build_15 = _cantidad_15.build();
    this.sal = _build_15;
    UsuarioBuilder _usuarioBuilder = new UsuarioBuilder("Publico");
    UsuarioBuilder _peso = _usuarioBuilder.peso(Double.valueOf(100.4));
    UsuarioBuilder _altura = _peso.altura(Double.valueOf(1.89));
    UsuarioBuilder _fechaNacimiento = _altura.fechaNacimiento(1990, 4, 3);
    UsuarioBuilder _sexo = _fechaNacimiento.sexo("M");
    RutinaSedentaria _rutinaSedentaria = new RutinaSedentaria();
    UsuarioBuilder _rutina = _sexo.rutina(_rutinaSedentaria);
    Usuario _build_16 = _rutina.build();
    this.usuarioPublico = _build_16;
    RecetaBuilder _recetaBuilder = new RecetaBuilder("Arroz con Pollo");
    RecetaBuilder _calorias = _recetaBuilder.calorias(500);
    RecetaBuilder _owner = _calorias.owner(this.usuarioPublico);
    RecetaBuilder _dificultad = _owner.dificultad("Mediana");
    RecetaBuilder _procesoPreparacion = _dificultad.procesoPreparacion("Hervir el arroz con azafran y agregar el pollo previamente salteado");
    RecetaBuilder _temporada = _procesoPreparacion.temporada("INVIERNO");
    RecetaBuilder _agregarIngrediente = _temporada.agregarIngrediente(this.arroz);
    RecetaBuilder _agregarIngrediente_1 = _agregarIngrediente.agregarIngrediente(this.pollo);
    RecetaBuilder _agregarCondimento = _agregarIngrediente_1.agregarCondimento(this.azafran);
    Receta _build_17 = _agregarCondimento.build();
    this.arrozConPollo = _build_17;
    this.recetarioPublico.agregarReceta(this.arrozConPollo);
    RecetaBuilder _recetaBuilder_1 = new RecetaBuilder("Fideos con manteca");
    RecetaBuilder _calorias_1 = _recetaBuilder_1.calorias(600);
    RecetaBuilder _owner_1 = _calorias_1.owner(this.usuarioPublico);
    RecetaBuilder _dificultad_1 = _owner_1.dificultad("Facil");
    RecetaBuilder _procesoPreparacion_1 = _dificultad_1.procesoPreparacion("Hervir los fideos. Colar.");
    RecetaBuilder _temporada_1 = _procesoPreparacion_1.temporada("INVIERNO");
    RecetaBuilder _agregarIngrediente_2 = _temporada_1.agregarIngrediente(this.pasta);
    RecetaBuilder _agregarCondimento_1 = _agregarIngrediente_2.agregarCondimento(this.sal);
    RecetaBuilder _agregarIngrediente_3 = _agregarCondimento_1.agregarIngrediente(this.manteca);
    Receta _build_18 = _agregarIngrediente_3.build();
    this.fideosConManteca = _build_18;
    this.recetarioPublico.agregarReceta(this.fideosConManteca);
    RecetaBuilder _recetaBuilder_2 = new RecetaBuilder("Lomo a la Mostaza");
    RecetaBuilder _calorias_2 = _recetaBuilder_2.calorias(1200);
    RecetaBuilder _owner_2 = _calorias_2.owner(this.usuarioPublico);
    RecetaBuilder _dificultad_2 = _owner_2.dificultad("Dificil");
    RecetaBuilder _procesoPreparacion_2 = _dificultad_2.procesoPreparacion("Poner el lomo con la mostaza en el horno.");
    RecetaBuilder _temporada_2 = _procesoPreparacion_2.temporada("VERANO");
    RecetaBuilder _agregarIngrediente_4 = _temporada_2.agregarIngrediente(this.lomo);
    RecetaBuilder _agregarCondimento_2 = _agregarIngrediente_4.agregarCondimento(this.sal);
    RecetaBuilder _agregarCondimento_3 = _agregarCondimento_2.agregarCondimento(this.mostaza);
    Receta _build_19 = _agregarCondimento_3.build();
    this.lomoMostaza = _build_19;
    this.recetarioPublico.agregarReceta(this.lomoMostaza);
    RecetaBuilder _recetaBuilder_3 = new RecetaBuilder("Gelatina de Frambuesa");
    RecetaBuilder _calorias_3 = _recetaBuilder_3.calorias(120);
    RecetaBuilder _owner_3 = _calorias_3.owner(this.usuarioPublico);
    RecetaBuilder _dificultad_3 = _owner_3.dificultad("Facil");
    RecetaBuilder _procesoPreparacion_3 = _dificultad_3.procesoPreparacion("Mezclar gelatina azucar y agua");
    RecetaBuilder _temporada_3 = _procesoPreparacion_3.temporada("VERANO");
    RecetaBuilder _agregarIngrediente_5 = _temporada_3.agregarIngrediente(this.gelatina);
    RecetaBuilder _agregarCondimento_4 = _agregarIngrediente_5.agregarCondimento(this.azucar);
    Receta _build_20 = _agregarCondimento_4.build();
    this.gelatinaFrambuesa = _build_20;
    this.recetarioPublico.agregarReceta(this.gelatinaFrambuesa);
    RecetaBuilder _recetaBuilder_4 = new RecetaBuilder("Ensalada");
    RecetaBuilder _calorias_4 = _recetaBuilder_4.calorias(100);
    RecetaBuilder _owner_4 = _calorias_4.owner(this.usuarioPublico);
    RecetaBuilder _dificultad_4 = _owner_4.dificultad("Facil");
    RecetaBuilder _procesoPreparacion_4 = _dificultad_4.procesoPreparacion("Cortar la verdura y mezclar. No olvidar de lavar");
    RecetaBuilder _temporada_4 = _procesoPreparacion_4.temporada("TODO EL AÑO");
    RecetaBuilder _agregarIngrediente_6 = _temporada_4.agregarIngrediente(this.cebolla);
    RecetaBuilder _agregarIngrediente_7 = _agregarIngrediente_6.agregarIngrediente(this.lechuga);
    RecetaBuilder _agregarIngrediente_8 = _agregarIngrediente_7.agregarIngrediente(this.tomate);
    RecetaBuilder _agregarCondimento_5 = _agregarIngrediente_8.agregarCondimento(this.sal);
    Receta _build_21 = _agregarCondimento_5.build();
    this.ensalada = _build_21;
    this.recetarioPublico.agregarReceta(this.ensalada);
    RecetaBuilder _recetaBuilder_5 = new RecetaBuilder("Arroz Blanco");
    RecetaBuilder _calorias_5 = _recetaBuilder_5.calorias(250);
    RecetaBuilder _owner_5 = _calorias_5.owner(this.usuarioPublico);
    RecetaBuilder _dificultad_5 = _owner_5.dificultad("Facil");
    RecetaBuilder _procesoPreparacion_5 = _dificultad_5.procesoPreparacion("Hervir el arroz. Comer.");
    RecetaBuilder _temporada_5 = _procesoPreparacion_5.temporada("INVIERNO");
    RecetaBuilder _agregarIngrediente_9 = _temporada_5.agregarIngrediente(this.arroz);
    Receta _build_22 = _agregarIngrediente_9.build();
    this.arrozBlanco = _build_22;
    this.recetarioPublico.agregarReceta(this.arrozBlanco);
    RecetaBuilder _recetaBuilder_6 = new RecetaBuilder("Asado");
    RecetaBuilder _calorias_6 = _recetaBuilder_6.calorias(2500);
    RecetaBuilder _owner_6 = _calorias_6.owner(this.usuarioPublico);
    RecetaBuilder _dificultad_6 = _owner_6.dificultad("Mediana");
    RecetaBuilder _procesoPreparacion_6 = _dificultad_6.procesoPreparacion("Prender el fuego y asar la carne. Condimentar a gusto");
    RecetaBuilder _temporada_6 = _procesoPreparacion_6.temporada("TODO EL AÑO");
    RecetaBuilder _agregarIngrediente_10 = _temporada_6.agregarIngrediente(this.pechitoDeCerdo);
    RecetaBuilder _agregarIngrediente_11 = _agregarIngrediente_10.agregarIngrediente(this.vacio);
    RecetaBuilder _agregarIngrediente_12 = _agregarIngrediente_11.agregarIngrediente(this.pollo);
    RecetaBuilder _agregarIngrediente_13 = _agregarIngrediente_12.agregarIngrediente(this.molleja);
    Receta _build_23 = _agregarIngrediente_13.build();
    this.asado = _build_23;
    this.recetarioPublico.agregarReceta(this.asado);
  }
  
  @Pure
  public Ingrediente getPollo() {
    return this.pollo;
  }
  
  public void setPollo(final Ingrediente pollo) {
    this.pollo = pollo;
  }
  
  @Pure
  public Ingrediente getArroz() {
    return this.arroz;
  }
  
  public void setArroz(final Ingrediente arroz) {
    this.arroz = arroz;
  }
  
  @Pure
  public Ingrediente getAzafran() {
    return this.azafran;
  }
  
  public void setAzafran(final Ingrediente azafran) {
    this.azafran = azafran;
  }
  
  @Pure
  public Ingrediente getSal() {
    return this.sal;
  }
  
  public void setSal(final Ingrediente sal) {
    this.sal = sal;
  }
  
  @Pure
  public Ingrediente getCebolla() {
    return this.cebolla;
  }
  
  public void setCebolla(final Ingrediente cebolla) {
    this.cebolla = cebolla;
  }
  
  @Pure
  public Ingrediente getLomo() {
    return this.lomo;
  }
  
  public void setLomo(final Ingrediente lomo) {
    this.lomo = lomo;
  }
  
  @Pure
  public Ingrediente getAzucar() {
    return this.azucar;
  }
  
  public void setAzucar(final Ingrediente azucar) {
    this.azucar = azucar;
  }
  
  @Pure
  public Ingrediente getCereal() {
    return this.cereal;
  }
  
  public void setCereal(final Ingrediente cereal) {
    this.cereal = cereal;
  }
  
  @Pure
  public Ingrediente getPasta() {
    return this.pasta;
  }
  
  public void setPasta(final Ingrediente pasta) {
    this.pasta = pasta;
  }
  
  @Pure
  public Ingrediente getMostaza() {
    return this.mostaza;
  }
  
  public void setMostaza(final Ingrediente mostaza) {
    this.mostaza = mostaza;
  }
  
  @Pure
  public Ingrediente getManteca() {
    return this.manteca;
  }
  
  public void setManteca(final Ingrediente manteca) {
    this.manteca = manteca;
  }
  
  @Pure
  public Ingrediente getGelatina() {
    return this.gelatina;
  }
  
  public void setGelatina(final Ingrediente gelatina) {
    this.gelatina = gelatina;
  }
  
  @Pure
  public Ingrediente getTomate() {
    return this.tomate;
  }
  
  public void setTomate(final Ingrediente tomate) {
    this.tomate = tomate;
  }
  
  @Pure
  public Ingrediente getLechuga() {
    return this.lechuga;
  }
  
  public void setLechuga(final Ingrediente lechuga) {
    this.lechuga = lechuga;
  }
  
  @Pure
  public Ingrediente getSalmon() {
    return this.salmon;
  }
  
  public void setSalmon(final Ingrediente salmon) {
    this.salmon = salmon;
  }
  
  @Pure
  public Ingrediente getLechon() {
    return this.lechon;
  }
  
  public void setLechon(final Ingrediente lechon) {
    this.lechon = lechon;
  }
  
  @Pure
  public Ingrediente getMolleja() {
    return this.molleja;
  }
  
  public void setMolleja(final Ingrediente molleja) {
    this.molleja = molleja;
  }
  
  @Pure
  public Ingrediente getVacio() {
    return this.vacio;
  }
  
  public void setVacio(final Ingrediente vacio) {
    this.vacio = vacio;
  }
  
  @Pure
  public Ingrediente getPechitoDeCerdo() {
    return this.pechitoDeCerdo;
  }
  
  public void setPechitoDeCerdo(final Ingrediente pechitoDeCerdo) {
    this.pechitoDeCerdo = pechitoDeCerdo;
  }
  
  @Pure
  public Receta getLomoMostaza() {
    return this.lomoMostaza;
  }
  
  public void setLomoMostaza(final Receta lomoMostaza) {
    this.lomoMostaza = lomoMostaza;
  }
  
  @Pure
  public Receta getArrozConPollo() {
    return this.arrozConPollo;
  }
  
  public void setArrozConPollo(final Receta arrozConPollo) {
    this.arrozConPollo = arrozConPollo;
  }
  
  @Pure
  public Receta getFideosConManteca() {
    return this.fideosConManteca;
  }
  
  public void setFideosConManteca(final Receta fideosConManteca) {
    this.fideosConManteca = fideosConManteca;
  }
  
  @Pure
  public Receta getGelatinaFrambuesa() {
    return this.gelatinaFrambuesa;
  }
  
  public void setGelatinaFrambuesa(final Receta gelatinaFrambuesa) {
    this.gelatinaFrambuesa = gelatinaFrambuesa;
  }
  
  @Pure
  public Receta getEnsalada() {
    return this.ensalada;
  }
  
  public void setEnsalada(final Receta ensalada) {
    this.ensalada = ensalada;
  }
  
  @Pure
  public Receta getArrozBlanco() {
    return this.arrozBlanco;
  }
  
  public void setArrozBlanco(final Receta arrozBlanco) {
    this.arrozBlanco = arrozBlanco;
  }
  
  @Pure
  public Receta getAsado() {
    return this.asado;
  }
  
  public void setAsado(final Receta asado) {
    this.asado = asado;
  }
  
  @Pure
  public RecetarioPublico getRecetarioPublico() {
    return this.recetarioPublico;
  }
  
  public void setRecetarioPublico(final RecetarioPublico recetarioPublico) {
    this.recetarioPublico = recetarioPublico;
  }
  
  @Pure
  public Usuario getUsuarioPublico() {
    return this.usuarioPublico;
  }
  
  public void setUsuarioPublico(final Usuario usuarioPublico) {
    this.usuarioPublico = usuarioPublico;
  }
}
