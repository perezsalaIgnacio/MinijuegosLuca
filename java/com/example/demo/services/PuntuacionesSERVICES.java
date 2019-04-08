package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Puntuaciones;
import com.example.demo.beans.Usuario;
import com.example.demo.daos.PuntuacionesRepository;
import com.example.demo.daos.UsuarioRepository;
import com.example.demo.dto.PuntuacionesDTO;
import com.example.demo.dto.UsuarioDTO;
import com.example.demo.interfaces.IPuntuacionesSERVICES;
import com.example.demo.util.ConversorBenDto;

@Service
public class PuntuacionesSERVICES  implements IPuntuacionesSERVICES{
	ConversorBenDto conversor=new ConversorBenDto();

	@Autowired
	PuntuacionesRepository puntuacionesRepository;
	
	@Override
	public List<PuntuacionesDTO> listarpuntuaciones() {
		
		List<PuntuacionesDTO> lista = new ArrayList<PuntuacionesDTO>();
		Iterable<Puntuaciones> puntuacionIterable =puntuacionesRepository.findAll();
		
		for (Puntuaciones puntuacion : puntuacionIterable) {
			PuntuacionesDTO user=conversor.PuntuacionesBenToDto(puntuacion);
			lista.add(user);
		}
		return lista;
	}

	@Override
	public void borrar_puntuaciones(int id_puntuacion) {
		puntuacionesRepository.deleteById(id_puntuacion);
		
	}

	@Override
	public void add_puntuacion(PuntuacionesDTO puntuacion) {
		Puntuaciones puntos=conversor.PuntuacionesDtoToBen(puntuacion);
		puntuacionesRepository.save(puntos);
	}

	@Override
	public PuntuacionesDTO buscar_porid_puntuacion(int id_puntuacion) {
	
		Optional<Puntuaciones> puntoOptional =puntuacionesRepository.findById(id_puntuacion);;
		if(!puntoOptional.isPresent()) {//No existe, devuelve null
			
			return null;
		}else {
			Puntuaciones puntos = puntoOptional.get();
			PuntuacionesDTO puntosdto=conversor.PuntuacionesBenToDto(puntos);
			return puntosdto;
		}
	}

}
