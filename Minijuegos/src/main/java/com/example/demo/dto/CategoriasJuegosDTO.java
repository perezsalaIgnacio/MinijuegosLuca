package com.example.demo.dto;

public class CategoriasJuegosDTO {
	private int id_juego;
	private int id_categoria;
	private int id_categoria_juego;
	
	public CategoriasJuegosDTO() {}
	
	public CategoriasJuegosDTO(int id_juego, int id_categoria, int id_categoria_juego) {
		
		this.id_juego = id_juego;
		this.id_categoria = id_categoria;
		this.id_categoria_juego = id_categoria_juego;
	}
	@Override
	public String toString() {
		return "CategoriasJuegos [id_juego=" + id_juego + ", id_categoria=" + id_categoria + ", id_categoria_juego="
				+ id_categoria_juego + "]";
	}
	public int getId_juego() {
		return id_juego;
	}
	public void setId_juego(int id_juego) {
		this.id_juego = id_juego;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public int getId_categoria_juego() {
		return id_categoria_juego;
	}
	public void setId_categoria_juego(int id_categoria_juego) {
		this.id_categoria_juego = id_categoria_juego;
	}
	
}
