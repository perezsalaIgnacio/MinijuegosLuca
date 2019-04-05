package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.beans.ComentariosJuegos;
import com.example.demo.interfaces.IComentariosJuegosSERVICES;

@Service
public class ComentariosJuegosSERVICES implements IComentariosJuegosSERVICES {

	@Override
	public List<ComentariosJuegos> listarcomentariosJuegos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar_comentariosJuegos(int id_comentario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add_comentariojuegos(ComentariosJuegos comentariosJuegos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ComentariosJuegos buscar_porid_comentariojuegos(int id_comentario) {
		// TODO Auto-generated method stub
		return null;
	}

}
