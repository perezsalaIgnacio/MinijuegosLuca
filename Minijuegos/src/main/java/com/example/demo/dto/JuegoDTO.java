package com.example.demo.dto;

import java.util.Date;

public class JuegoDTO {
	
	private int id_juegos;
	
	private double valoracion;
	
	private String descripcion;
	
	private String mejorUsuario;
	
	private Date fecha;
	
	
	public JuegoDTO() {}
	
	public JuegoDTO(int id_juegos, double valoracion, String descripcion, String mejorUsuario, Date fecha) {
		super();
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
