package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Categoria;
import com.example.demo.beans.ComentariosJuegos;
import com.example.demo.daos.CategoriaRepository;
import com.example.demo.daos.ComentariosJuegosRepository;
import com.example.demo.dto.CategoriaDTO;
import com.example.demo.dto.ComentariosJuegosDTO;
import com.example.demo.interfaces.IComentariosJuegosSERVICES;
import com.example.demo.util.ConversorBenDto;

@Service
public class ComentariosJuegosSERVICES implements IComentariosJuegosSERVICES {

	ConversorBenDto conversor=new ConversorBenDto();
	
	@Autowired
	ComentariosJuegosRepository comentariosJuegosRepository;
	
	@Override
	public List<ComentariosJuegosDTO> listarcomentariosJuegos() {
		List<ComentariosJuegosDTO> lista = new ArrayList<ComentariosJuegosDTO>();
		Iterable<ComentariosJuegos> comentariosIterable =comentariosJuegosRepository.findAll();
		
		for (ComentariosJuegos comentarios : comentariosIterable) {
			ComentariosJuegosDTO comentarios1=conversor.ComentariosJuegosBenToDto(comentarios);
			lista.add(comentarios1);
		}
		return lista;
	}

	@Override
	public void borrar_comentariosJuegos(int id_comentario) {
		comentariosJuegosRepository.deleteById(id_comentario);

		
	}

	@Override
	public void add_comentariojuegos(ComentariosJuegosDTO comentariosJuegos) {
		ComentariosJuegos comentario=conversor.ComentariosJuegosDtoToBen(comentariosJuegos);
		comentariosJuegosRepository.save(comentario);
		
	}

	@Override
	public ComentariosJuegosDTO buscar_porid_comentariojuegos(int id_comentario) {
		
		Optional<ComentariosJuegos> comentarioOptional = comentariosJuegosRepository.findById(id_comentario);
		if(!comentarioOptional.isPresent()) {//No existe, devuelve null
			
			return null;
		}else {
			ComentariosJuegos comen = comentarioOptional.get();
			ComentariosJuegosDTO comen1=conversor.ComentariosJuegosBenToDto(comen);
			return comen1;
		}
	}

}
