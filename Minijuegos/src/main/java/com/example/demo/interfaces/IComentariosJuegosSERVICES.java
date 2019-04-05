package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.ComentariosJuegos;
import com.example.demo.dto.ComentariosJuegosDTO;

public interface IComentariosJuegosSERVICES {

	public List<ComentariosJuegosDTO> listarcomentariosJuegos();
	public void borrar_comentariosJuegos(int id_comentario);	
	public void add_comentariojuegos(ComentariosJuegosDTO comentariosJuegos);    
	public ComentariosJuegosDTO buscar_porid_comentariojuegos(int id_comentario);

}
