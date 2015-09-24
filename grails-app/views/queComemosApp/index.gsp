<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Que Comemos?</title>
	<asset:stylesheet href="application.css"/>
</head>
<body>

<div class="container center">
	<div class="panel">
	    <div class="panel-heading">Login</div>
	    <div class="panel-body">

	    	<form class="form center" method='POST'>

		        <div class="form-element">
		          <label class="form-label" for='nombreUsr'>Usuario</label>
		          <input class="form-input" type="text" name="usrName" id='nombreUsr'/></br>
		        </div>

		        <div class="form-element">
		          <label class="form-label" for="password">Contraseña</label>
		          <input class="form-input" type="password" name="usrPass" id='password'/></br>
		        </div>
		        <div>
		        <br>
		        	<table>
		        	<tr>
			        <td><g:actionSubmit class="primary" controller="login" action="logear" value="OK"/></td>
			        <td><g:actionSubmit class="primary" controller="login" action="logear" value="Cancelar"/></td>
			        </tr>
			        </table>
				</div>
			</form>
	    </div>
   </div> 
</div>

</body>
</html>