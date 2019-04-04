package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.Puntuaciones;

public interface IUsuarioSERVICES {

	public List<Puntuaciones> listarpuntuaciones();
	public void borrar_puntuaciones(int id_puntuacion);	
	public void add_puntuacion(Puntuaciones puntuacion);    
	public Puntuaciones buscar_porid_puntuacion(int id_puntuacion);
}
