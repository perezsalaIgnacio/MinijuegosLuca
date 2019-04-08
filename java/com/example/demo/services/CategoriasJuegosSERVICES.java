package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Categoria;
import com.example.demo.beans.CategoriasJuegos;
import com.example.demo.daos.CategoriaRepository;
import com.example.demo.daos.CategoriasJuegosRepository;
import com.example.demo.dto.CategoriaDTO;
import com.example.demo.dto.CategoriasJuegosDTO;
import com.example.demo.interfaces.ICategoriaSERVICES;
import com.example.demo.interfaces.ICategoriasJuegosSERVICES;
import com.example.demo.util.ConversorBenDto;

@Service
public class CategoriasJuegosSERVICES implements ICategoriasJuegosSERVICES {
	
	ConversorBenDto conversor=new ConversorBenDto();
	
	@Autowired
	CategoriasJuegosRepository categoriasJuegosRepository;
	
	@Override
	public List<CategoriasJuegosDTO> listarcategoriasjuegos() {
		List<CategoriasJuegosDTO> lista = new ArrayList<CategoriasJuegosDTO>();
		Iterable<CategoriasJuegos> categoriaJuegosIterable =categoriasJuegosRepository.findAll();
		
		for (CategoriasJuegos categoria : categoriaJuegosIterable) {
			CategoriasJuegosDTO categoria1=conversor.CategoriasJuegosBenToDto(categoria);
			lista.add(categoria1);
		}
		return lista;
	}

	@Override
	public void borrarcategoriajuego(int id_categoria_juego) {
		categoriasJuegosRepository.deleteById(id_categoria_juego);
		
	}

	@Override
	public void addcategoriajuegos(CategoriasJuegosDTO categoriasjuegos) {
		CategoriasJuegos cat=conversor.CategoriasJuegosDtoToBen(categoriasjuegos);
		categoriasJuegosRepository.save(cat);
		
		
	}

	@Override
	public CategoriasJuegosDTO buscar_porid_categoria(int id_categoria_juego) {
		Optional<CategoriasJuegos> categoriaOptional = categoriasJuegosRepository.findById(id_categoria_juego);
		if(!categoriaOptional.isPresent()) {//No existe, devuelve null
			
			return null;
		}else {
			CategoriasJuegos cat = categoriaOptional.get();
			CategoriasJuegosDTO cat1=conversor.CategoriasJuegosBenToDto(cat);
			return cat1;
		}
	}



}
