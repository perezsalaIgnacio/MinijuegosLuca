<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>General</title>
<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
<!-- Our Custom CSS -->
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/index2.css">

<!-- Font Awesome JS -->
<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"
	integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ"
	crossorigin="anonymous"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

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
	<div class="back">
		<div class="wrapper">

			<!-- Sidebar  -->
			<nav id="sidebar">
				<div class="sidebar-header">
					<h3>Generos</h3>
				</div>
				<ul class="list-unstyled components">
					<li><a href="#">Estrategia</a></li>
					<li><a href="#">Arcade</a></li>
					<li><a href="#">Clasicos</a></li>
					<li><a href="#">Accion</a></li>
					<li><a href="#">Aventuras</a></li>
					<li><a href="#">Carreras</a></li>
					<li><a href="#">Deporte</a></li>
					<li><a href="#">Gestion</a></li>
					<li><a href="#">Habilidad</a></li>
					<li><a href="#">Mesa</a></li>
					<li><a href="#">Infantiles</a></li>
					<li><a href="#">Colecciones</a></li>
					<li><a href="#">Colecciones</a></li>
					<li><a href="#">Colecciones</a></li>
					<li><a href="#">Colecciones</a></li>
					<li><a href="#">Colecciones</a></li>
				</ul>
			</nav>



			<div class="container">
				<div class="row">
					<hr>
				</div>

				<div class="row">
					<div class="col-sm-2"></div>
					<div class="col-sm-8">
						<div id="carouselExampleIndicators" class="carousel slide"
							data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#carouselExampleIndicators" data-slide-to="0"
									class="active"></li>
								<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
								<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
							</ol>
							<div class="carousel-inner">
								<div class="carousel-item active">
									<img class="d-block w-100"
										src="https://cdn2.unrealengine.com/Fortnite%2Fblog%2Finfinity-gauntlet%2FFN_News_Large_4.1-Patch-Notes-1920x1080-fbf82fd6a8d1f7a016a8aa8186287471c6039fe0.jpg"
										alt="First slide">
								</div>
								<div class="carousel-item">
									<img class="d-block w-100"
										src="https://media.gq.com/photos/5ba923f680ea977b1708eb4a/master/pass/rip-telltale-games-gq.jpg"
										alt="Second slide">
								</div>
								<div class="carousel-item">
									<img class="d-block w-100"
										src="https://data3.origin.com/content/dam/originx/web/app/programs/About/aboutorigin_3840x2160_battlefield1.jpg"
										alt="Third slide">
								</div>
							</div>
							<a class="carousel-control-prev"
								href="#carouselExampleIndicators" role="button"
								data-slide="prev"> <span class="carousel-control-prev-icon"
								aria-hidden="true"></span> <span class="sr-only">Siguiente</span>
							</a> <a class="carousel-control-next"
								href="#carouselExampleIndicators" role="button"
								data-slide="next"> <span class="carousel-control-next-icon"
								aria-hidden="true"></span> <span class="sr-only">Anterior</span>
							</a>
						</div>
					</div>
				</div>
				<div class="row">
					<hr>
				</div>
				<div class="row">
					<div class="col">
						<!-- Team member -->
						<div class="image-flip"
							ontouchstart="this.classList.toggle('hover');">
							<div class="mainflip">
								<div class="frontside">
									<div class="card">
										<div class="card-body text-center">
											<p>
												<img class=" img-fluid"
													src="https://www.tebeosfera.com/T3content/img/T3_recreaciones/o/-/zipi_y_zape_zeta_2000_-el_tonel_del_tiempo-/R-200_zipi_y_zape_zeta_2000_-el_tonel_del_tiempo-.jpg"
													alt="card image">
											</p>
											<h4 class="card-title">Juego1</h4>
											<p class="card-text">Este es el juego numero 1.</p>
											<a href="#" class="btn btn-primary btn-sm"><i
												class="fa fa-plus"></i></a>
										</div>
									</div>
								</div>
								<div class="backside">
									<div class="card">
										<div class="card-body text-center mt-4">
											<h4 class="card-title">Juego 1</h4>
											<p class="card-text">Este es el juego numero 1 y va de
												matar cosas con cosas.</p>
											<ul class="list-inline">
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-facebook"></i>
												</a></li>
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-twitter"></i>
												</a></li>
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-skype"></i>
												</a></li>
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-google"></i>
												</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- ./Team member -->
					</div>
					<div class="col">
						<!-- Team member -->
						<div class="image-flip"
							ontouchstart="this.classList.toggle('hover');">
							<div class="mainflip">
								<div class="frontside">
									<div class="card">
										<div class="card-body text-center">
											<p>
												<img class=" img-fluid"
													src="https://www.tebeosfera.com/T3content/img/T3_recreaciones/o/-/zipi_y_zape_zeta_2000_-el_tonel_del_tiempo-/R-200_zipi_y_zape_zeta_2000_-el_tonel_del_tiempo-.jpg"
													alt="card image">
											</p>
											<h4 class="card-title">Juego1</h4>
											<p class="card-text">Este es el juego numero 1.</p>
											<a href="#" class="btn btn-primary btn-sm"><i
												class="fa fa-plus"></i></a>
										</div>
									</div>
								</div>
								<div class="backside">
									<div class="card">
										<div class="card-body text-center mt-4">
											<h4 class="card-title">Juego 1</h4>
											<p class="card-text">Este es el juego numero 1 y va de
												matar cosas con cosas.</p>
											<ul class="list-inline">
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-facebook"></i>
												</a></li>
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-twitter"></i>
												</a></li>
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-skype"></i>
												</a></li>
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-google"></i>
												</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- ./Team member -->
					</div>
					<div class="col">
						<!-- Team member -->
						<div class="image-flip"
							ontouchstart="this.classList.toggle('hover');">
							<div class="mainflip">
								<div class="frontside">
									<div class="card">
										<div class="card-body text-center">
											<p>
												<img class=" img-fluid"
													src="https://www.tebeosfera.com/T3content/img/T3_recreaciones/o/-/zipi_y_zape_zeta_2000_-el_tonel_del_tiempo-/R-200_zipi_y_zape_zeta_2000_-el_tonel_del_tiempo-.jpg"
													alt="card image">
											</p>
											<h4 class="card-title">Juego1</h4>
											<p class="card-text">Este es el juego numero 1.</p>
											<a href="#" class="btn btn-primary btn-sm"><i
												class="fa fa-plus"></i></a>
										</div>
									</div>
								</div>
								<div class="backside">
									<div class="card">
										<div class="card-body text-center mt-4">
											<h4 class="card-title">Juego 1</h4>
											<p class="card-text">Este es el juego numero 1 y va de
												matar cosas con cosas.</p>
											<ul class="list-inline">
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-facebook"></i>
												</a></li>
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-twitter"></i>
												</a></li>
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-skype"></i>
												</a></li>
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank" href="#">
														<i class="fa fa-google"></i>
												</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- ./Team member -->
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- jQuery CDN - Slim version (=without AJAX) -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<!-- Popper.JS -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
		integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
		crossorigin="anonymous"></script>
	<!-- Bootstrap JS -->
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
		integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
		crossorigin="anonymous"></script>

	<script type="text/javascript">
		$(document).ready(function() {
			$('#sidebarCollapse').on('click', function() {
				$('#sidebar').toggleClass('active');
			});
		});
	</script>
</body>
</html>