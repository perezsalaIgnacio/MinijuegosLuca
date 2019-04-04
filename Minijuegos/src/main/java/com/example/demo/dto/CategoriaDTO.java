package com.example.demo.dto;


public class CategoriaDTO {
		
		private int id_categoria;
		
		
		private String descripcion;
		
		public CategoriaDTO() {}
		
		public CategoriaDTO(int id_categoria, String descripcion) {
			this.id_categoria = id_categoria;
			this.descripcion = descripcion;
		}
		

		@Override
		public String toString() {
			return "Categoria [id_categoria=" + id_categoria + ", descripcion=" + descripcion + "]";
		}


		public int getId_categoria() {
			return id_categoria;
		}


		public void setId_categoria(int id_categoria) {
			this.id_categoria = id_categoria;
		}


		public String getDescripcion() {
			return descripcion;
		}


		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		

}
