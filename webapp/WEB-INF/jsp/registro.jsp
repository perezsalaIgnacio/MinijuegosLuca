<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>Registro</title>
<link href='https://fonts.googleapis.com/css?family=Roboto:400,700,900'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/registro.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<form class="form-inline">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Buscar" aria-label="Buscar">
			<button class="btn btn-secondary" type="submit">Buscar</button>
		</form>
		<div class="text-center">
			<a href="/index"><img src="imagenes/minijuegos-logo.png"
				class="rounded" alt="Responsive image" style="margin-left: -260px"></a>
		</div>
		<form class="form-inline my-2 my-lg-0">
			<a href="/login" style="color: #c0c0c0;"><i
				class="fa fa-user fa-2x"></i></a>
		</form>
	</nav>


	<div class="back"></div>
	<div class="registration-form">
		<header>
			<h1>Registro</h1>
			<p>Rellene los siguiente campos</p>
		</header>

		<form>
			<div class="input-section nick-section">
				<input class="nick" type="text" placeholder="INTRODUZCA SU NICK"
					autocomplete="off" />
				<div class="animated-button">
					<span class="icon-nick"><i class="fa fa-user"></i></span><span
						class="next-button nick"><i class="fa fa-arrow-up"></i></span>
				</div>
			</div>
			<div class="input-section email-section folded">
				<input class="email" type="email" placeholder="INTRODUZCA SU EMAIL"
					autocomplete="off" />
				<div class="animated-button">
					<span class="icon-paper-plane"><i class="fa fa-envelope-o"></i></span><span
						class="next-button email"><i class="fa fa-arrow-up"></i></span>
				</div>
			</div>

			<div class="input-section password-section folded">
				<input class="password" type="password"
					placeholder="INTRODUZCA SU PASSWORD" />
				<div class="animated-button">
					<span class="icon-lock"><i class="fa fa-lock"></i></span><span
						class="next-button password"><i class="fa fa-arrow-up"></i></span>
				</div>
			</div>

			<div class="input-section repeat-password-section folded">
				<input class="repeat-password" type="password"
					placeholder="REPITA SU PASSWORD" />
				<div class="animated-button">
					<span class="icon-repeat-lock"><i class="fa fa-lock"></i></span><span
						class="next-button repeat-password"><i
						class="fa fa-paper-plane"></i></span>
				</div>
			</div>


			<div class="success">
				<p>Cuenta Creada</p>
			</div>
		</form>
	</div>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script src="js/registro.js"></script>
</body>
</html>
