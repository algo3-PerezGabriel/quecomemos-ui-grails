
<html>
<head>
	<title>Bienvenido Que Comemos?</title>
</head>
<body>
	<label>${modelo.outputTituloGrilla }</label>
<br>
			<div id="list-receta" class="content scaffold-list">
				<table class="table table-striped table-bordered table-hover table-condensed">
					<thead>
						<tr>
						<th>Nombre</th>
						<th>Calorias</th>
						<th>Dificultad</th>
						<th>Temporada</th>
						<th>Acciones</th>
						</tr>
					</thead>
					<tbody>
						<g:each in="${modelo.recetasEnGrilla }" status="i" var="receta">
							<tr class="${(i % 2) == 0 ? 'info' : '' }">
								<td>${receta.nombreDeLaReceta}</td>
								<td>${receta.calorias}</td>
								<td>${receta.dificultadDePreparacion}</td>
								<td>${receta.temporadaALaQueCorresponde}</td>
								<td>accion</td>
							</tr>
						</g:each>
					</tbody>
				</table>
			</div>
</body>
</html>