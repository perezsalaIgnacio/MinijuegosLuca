package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.Puntuaciones;
import com.example.demo.dto.PuntuacionesDTO;

public interface IPuntuacionesSERVICES {
	public List<PuntuacionesDTO> listarpuntuaciones();
	public void borrar_puntuaciones(int id_puntuacion);	
	public void add_puntuacion(PuntuacionesDTO puntuacion);    
	public PuntuacionesDTO buscar_porid_puntuacion(int id_puntuacion);
}
