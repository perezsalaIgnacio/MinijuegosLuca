package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Categoria;
import com.example.demo.beans.Juego;
import com.example.demo.daos.CategoriaRepository;
import com.example.demo.daos.JuegoRepository;
import com.example.demo.dto.CategoriaDTO;
import com.example.demo.dto.JuegoDTO;
import com.example.demo.interfaces.IJuegoSERVICES;
import com.example.demo.util.ConversorBenDto;

@Service
public class JuegoSERVICES  implements IJuegoSERVICES{
	
	ConversorBenDto conversor=new ConversorBenDto();
	
	@Autowired
	JuegoRepository juegoRepository;

	@Override
	public List<JuegoDTO> listarjuegos() {
		List<JuegoDTO> lista = new ArrayList<JuegoDTO>();
		Iterable<Juego> juegoIterable =juegoRepository.findAll();
		
		for (Juego juego : juegoIterable) {
			JuegoDTO juego1=conversor.JuegoBenToDto(juego);
			lista.add(juego1);
		}
		return lista;
	}

	@Override
	public void borrar_Juego(int id_juego) {
		juegoRepository.deleteById(id_juego);
		
	}

	@Override
	public void add_juego(JuegoDTO juego) {
		Juego juego1=conversor.JuegoDtoToBen(juego);
		juegoRepository.save(juego1);
		
	}

	@Override
	public JuegoDTO buscar_porid_juegos(int id_juego) {

		Optional<Juego> juegoOptional = juegoRepository.findById(id_juego);
		if(!juegoOptional.isPresent()) {//No existe, devuelve null
			
			return null;
		}else {
			Juego juego = juegoOptional.get();
			JuegoDTO juego1=conversor.JuegoBenToDto(juego);
			return juego1;
		}
	}

}
