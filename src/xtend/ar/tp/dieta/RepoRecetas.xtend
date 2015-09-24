package ar.tp.dieta

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class RepoRecetas {

	protected Ingrediente pollo
	protected Ingrediente arroz
	protected Ingrediente azafran
	protected Ingrediente sal
	protected Ingrediente cebolla
	protected Ingrediente lomo
	protected Ingrediente azucar
	protected Ingrediente cereal
	protected Ingrediente pasta
	protected Ingrediente mostaza
	protected Ingrediente manteca
	protected Ingrediente gelatina
	protected Ingrediente tomate
	protected Ingrediente lechuga
	protected Ingrediente salmon
	protected Ingrediente lechon
	protected Ingrediente molleja
	protected Ingrediente vacio
	protected Ingrediente pechitoDeCerdo	
		
	public Receta lomoMostaza
	public Receta arrozConPollo	
	public Receta fideosConManteca
	public Receta gelatinaFrambuesa
	public Receta ensalada
	public Receta arrozBlanco
	public Receta asado
	
	public RecetarioPublico recetarioPublico = new RecetarioPublico()
	
	public Usuario usuarioPublico
	
	new(){	
		arroz = new IngredienteBuilder("arroz").cantidad(500).build()
		pollo = new IngredienteBuilder("pollo").cantidad(1000).build()
		lomo = new IngredienteBuilder("lomo").cantidad(1000).build()
		pasta = new IngredienteBuilder("pasta").cantidad(500).build()

		cebolla = new IngredienteBuilder("cebolla").cantidad(150).build()
		mostaza = new IngredienteBuilder("mostaza").cantidad(30).build()
		manteca= new IngredienteBuilder("manteca").cantidad(10).build()
		gelatina= new IngredienteBuilder("gelatina").cantidad(250).build()
		tomate = new IngredienteBuilder("tomate").cantidad(150).build()
		lechuga = new IngredienteBuilder("lechuga").cantidad(300).build()
		molleja = new IngredienteBuilder("molleja").cantidad(300).build()
		vacio = new IngredienteBuilder("vacio").cantidad(1500).build()
		pechitoDeCerdo = new IngredienteBuilder("pechito de cerdo").cantidad(1500).build

		azucar = new IngredienteBuilder("azucar").cantidad(500).build()
		azafran = new IngredienteBuilder("azafran").cantidad(2).build()
		sal = new IngredienteBuilder("sal").cantidad(2).build()
		
		usuarioPublico = new UsuarioBuilder("Publico")
								.peso(100.4)
								.altura(1.89)
								.fechaNacimiento(1990, 4, 3)
								.sexo("M")
								.rutina(new RutinaSedentaria)
								.build()
		
		arrozConPollo = new RecetaBuilder("Arroz con Pollo")
				.calorias(500)
				.owner(usuarioPublico)
				.dificultad("Mediana")
				.procesoPreparacion("Hervir el arroz con azafran y agregar el pollo previamente salteado")
				.temporada("INVIERNO")
				.agregarIngrediente(arroz)
				.agregarIngrediente(pollo)
				.agregarCondimento(azafran)
				.build()
				recetarioPublico.agregarReceta(arrozConPollo)
				
		fideosConManteca = new RecetaBuilder("Fideos con manteca")
				.calorias(600)
				.owner(usuarioPublico)
				.dificultad("Facil")
				.procesoPreparacion("Hervir los fideos. Colar.")
				.temporada("INVIERNO")
				.agregarIngrediente(pasta)
				.agregarCondimento(sal)
				.agregarIngrediente(manteca)
				.build()
				recetarioPublico.agregarReceta(fideosConManteca)
				
		lomoMostaza = new RecetaBuilder("Lomo a la Mostaza")
				.calorias(1200)
				.owner(usuarioPublico)
				.dificultad("Dificil")
				.procesoPreparacion("Poner el lomo con la mostaza en el horno.")
				.temporada("VERANO")
				.agregarIngrediente(lomo)
				.agregarCondimento(sal)
				.agregarCondimento(mostaza)
				.build()
				recetarioPublico.agregarReceta(lomoMostaza)
				
		gelatinaFrambuesa = new RecetaBuilder("Gelatina de Frambuesa")
				.calorias(120)
				.owner(usuarioPublico)
				.dificultad("Facil")
				.procesoPreparacion("Mezclar gelatina azucar y agua")
				.temporada("VERANO")
				.agregarIngrediente(gelatina)
				.agregarCondimento(azucar)
				.build()
				recetarioPublico.agregarReceta(gelatinaFrambuesa)
		
		ensalada = new RecetaBuilder("Ensalada")
				.calorias(100)
				.owner(usuarioPublico)
				.dificultad("Facil")
				.procesoPreparacion("Cortar la verdura y mezclar. No olvidar de lavar")
				.temporada("TODO EL AÑO")
				.agregarIngrediente(cebolla)
				.agregarIngrediente(lechuga)
				.agregarIngrediente(tomate)
				.agregarCondimento(sal)
				.build()
				recetarioPublico.agregarReceta(ensalada)
		
		arrozBlanco = new RecetaBuilder("Arroz Blanco")
				.calorias(250)
				.owner(usuarioPublico)
				.dificultad("Facil")
				.procesoPreparacion("Hervir el arroz. Comer.")
				.temporada("INVIERNO")
				.agregarIngrediente(arroz)
				.build()
				recetarioPublico.agregarReceta(arrozBlanco)
		
		asado = new RecetaBuilder("Asado")
				.calorias(2500)
				.owner(usuarioPublico)
				.dificultad("Mediana")
				.procesoPreparacion("Prender el fuego y asar la carne. Condimentar a gusto")
				.temporada("TODO EL AÑO")
				.agregarIngrediente(pechitoDeCerdo)
				.agregarIngrediente(vacio)
				.agregarIngrediente(pollo)
				.agregarIngrediente(molleja)
				.build()
				recetarioPublico.agregarReceta(asado)
		
//		recetarioPublico.recetas =>[
//			add(asado)
//			add(arrozConPollo)
//			add(lomoMostaza)
//			add(fideosConManteca)
//			add(gelatinaFrambuesa)
//			add(ensalada)
//			add(arrozBlanco)
//		]
		
	}	
		
}