package com.example.demo.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="juegos")
public class Juego {
	@Id
	@Column(name="id_juego")
	private int id_juegos;
	@Column(name="valoracion")
	private double valoracion;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="mejor_usuario")
	private String mejorUsuario;
	@Column(name="fecha")
	private Date fecha;
	
	
	public Juego() {}
	
	public Juego(int id_juegos, double valoracion, String descripcion, String mejorUsuario, Date fecha) {
		this.id_juegos = id_juegos;
		this.valoracion = valoracion;
		this.descripcion = descripcion;
		this.mejorUsuario = mejorUsuario;
		this.fecha = fecha;
	}



	@Override
	public String toString() {
		return "Juego [id_juegos=" + id_juegos + ", valoracion=" + valoracion + ", descripcion=" + descripcion
				+ ", mejorUsuario=" + mejorUsuario + ", fecha=" + fecha + "]";
	}



	public int getId_juegos() {
		return id_juegos;
	}



	public void setId_juegos(int id_juegos) {
		this.id_juegos = id_juegos;
	}



	public double getValoracion() {
		return valoracion;
	}



	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getMejorUsuario() {
		return mejorUsuario;
	}



	public void setMejorUsuario(String mejorUsuario) {
		this.mejorUsuario = mejorUsuario;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
