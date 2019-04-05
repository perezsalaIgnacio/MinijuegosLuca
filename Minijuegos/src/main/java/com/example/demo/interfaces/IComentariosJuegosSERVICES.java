package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.ComentariosJuegos;

public interface IComentariosJuegosSERVICES {

	public List<ComentariosJuegos> listarcomentariosJuegos();
	public void borrar_comentariosJuegos(int id_comentario);	
	public void add_comentariojuegos(ComentariosJuegos comentariosJuegos);    
	public ComentariosJuegos buscar_porid_comentariojuegos(int id_comentario);

}
