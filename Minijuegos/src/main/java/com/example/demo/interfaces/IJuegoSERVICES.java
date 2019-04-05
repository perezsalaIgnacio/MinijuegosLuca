package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.Juego;
import com.example.demo.dto.JuegoDTO;

public interface IJuegoSERVICES {

	public List<JuegoDTO> listarjuegos();
	public void borrar_Juego(int id_juego);	
	public void add_juego(JuegoDTO juego);    
	public JuegoDTO buscar_porid_juegos(int id_juego);
}
