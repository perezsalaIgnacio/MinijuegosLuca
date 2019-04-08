package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comentario_juegos")
public class ComentariosJuegos {
	@Id
	@Column(name="id_usuario")
	private int id_usuario;
	@Column(name="id_juego")
	private int id_juego;
	@Column(name="id_comentario")
	private int id_comentario;
	@Column(name="comentario")
	private String comentario;
	
	public ComentariosJuegos() {}
	
	public ComentariosJuegos(int id_usuario, int id_juego, int id_comentario, String comentario) {
		super();
		this.id_usuario = id_usuario;
		this.id_juego = id_juego;
		this.id_comentario = id_comentario;
		this.comentario = comentario;
	}
	@Override
	public String toString() {
		return "ComentariosJuegos [id_usuario=" + id_usuario + ", id_juego=" + id_juego + ", id_comentario="
				+ id_comentario + ", comentario=" + comentario + "]";
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
	public int getId_comentario() {
		return id_comentario;
	}
	public void setId_comentario(int id_comentario) {
		this.id_comentario = id_comentario;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	

}
