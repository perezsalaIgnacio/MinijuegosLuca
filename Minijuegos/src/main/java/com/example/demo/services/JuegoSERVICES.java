package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.beans.Juego;
import com.example.demo.interfaces.IJuegoSERVICES;

@Service
public class JuegoSERVICES  implements IJuegoSERVICES{

	@Override
	public List<Juego> listarjuegos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar_Juego(int id_juego) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add_juego(Juego juego) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Juego buscar_porid_juegos(int id_juego) {
		// TODO Auto-generated method stub
		return null;
	}

}
