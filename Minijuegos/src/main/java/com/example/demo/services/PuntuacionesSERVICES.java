package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.beans.Puntuaciones;
import com.example.demo.interfaces.IPuntuacionesSERVICES;

@Service
public class PuntuacionesSERVICES  implements IPuntuacionesSERVICES{

	@Override
	public List<Puntuaciones> listarpuntuaciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar_puntuaciones(int id_puntuacion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add_puntuacion(Puntuaciones puntuacion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Puntuaciones buscar_porid_puntuacion(int id_puntuacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
