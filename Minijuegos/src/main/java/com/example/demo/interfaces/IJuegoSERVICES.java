package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.Juego;

public interface IJuegoSERVICES {

	public List<Juego> listarjuegos();
	public void borrar_Juego(int id_juego);	
	public void add_juego(Juego juego);    
	public Juego buscar_porid_juegos(int id_juego);
}
