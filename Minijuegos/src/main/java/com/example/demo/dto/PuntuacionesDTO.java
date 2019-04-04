package com.example.demo.dto;

public class PuntuacionesDTO {
		
		private int id_puntuacion;

		private int id_usuario;
		
		private String  puntuacion;
	
		private int id_juego;
		
		
		public PuntuacionesDTO() {}
		
		public PuntuacionesDTO(String puntuacion, int id_usuario, int id_juego, int id_puntuacion, String comentario) {
		
			this.puntuacion = puntuacion;
			this.id_usuario = id_usuario;
			this.id_juego = id_juego;
			this.id_puntuacion = id_puntuacion;
				}
		@Override
		public String toString() {
			return "Puntuaciones [puntuacion=" + puntuacion + ", id_usuario=" + id_usuario + ", id_juego=" + id_juego
					+ ", id_puntuacion=" + id_puntuacion + "]";
		}
		public String getPuntuacion() {
			return puntuacion;
		}
		public void setPuntuacion(String puntuacion) {
			this.puntuacion = puntuacion;
		}
		public int getId_usuario() {
			return id_usuario;
		}
		public void setId_usuario(int id_usuario) {
			this.id_usuario = id_usuario;
		}
		public int getId_juego() {
			return id_juego;
		}
		public void setId_juego(int id_juego) {
			this.id_juego = id_juego;
		}
		public int getId_puntuacion() {
			return id_puntuacion;
		}
		public void setId_puntuacion(int id_puntuacion) {
			this.id_puntuacion = id_puntuacion;
		}

	

}
