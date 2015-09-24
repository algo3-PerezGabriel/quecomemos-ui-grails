package quecomemos.ui.web.grails

import ar.edu.unsam.dieta.tp.model.app.LoginUserModel
import ar.edu.unsam.dieta.tp.model.app.QueComemosAppModel


class QueComemosAppController {

	static scope = "session"
	
	static allowedMethods = [
		logear: 'POST'
	]
	
	def modeloLogin = new LoginUserModel()
	def modeloBienvenida
	//aca salvar el modelo sig
	
	def index() { }
	
	def logear() {
		modeloLogin.nombreUsuario = params.usrName
		modeloLogin.passwordUsuario = params.usrPass
		modeloBienvenida = modeloLogin.validarLogin()
		this.nextVista(modeloBienvenida)
	}
	
	def nextVista(QueComemosAppModel elModelo){
		[modelo: elModelo]
	}
}



