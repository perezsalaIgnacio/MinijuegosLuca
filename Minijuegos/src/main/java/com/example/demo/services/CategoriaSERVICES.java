package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Categoria;
import com.example.demo.beans.Usuario;
import com.example.demo.daos.CategoriaRepository;
import com.example.demo.daos.UsuarioRepository;
import com.example.demo.dto.CategoriaDTO;
import com.example.demo.dto.UsuarioDTO;
import com.example.demo.interfaces.ICategoriaSERVICES;
import com.example.demo.util.ConversorBenDto;

@Service
public class CategoriaSERVICES  implements ICategoriaSERVICES{
	
	ConversorBenDto conversor=new ConversorBenDto();
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Override
	public List<CategoriaDTO> listarcategorias() {
		List<CategoriaDTO> lista = new ArrayList<CategoriaDTO>();
		Iterable<Categoria> categoriaIterable =categoriaRepository.findAll();
		
		for (Categoria categoria : categoriaIterable) {
			CategoriaDTO categoria1=conversor.CategoriaBenToDto(categoria);
			lista.add(categoria1);
		}
		return lista;
	}
	
	

	@Override
	public void borrarcategoria(int id_categoria) {
		categoriaRepository.deleteById(id_categoria);
		
	}

	@Override
	public void addcategoria(CategoriaDTO categoria) {
		Categoria cat=conversor.CategoriaDtoToBen(categoria);
		categoriaRepository.save(cat);
		
	}

	@Override
	public CategoriaDTO buscar_porid_categoria(int id_categoria) {
		
		Optional<Categoria> categoriaOptional = categoriaRepository.findById(id_categoria);
		if(!categoriaOptional.isPresent()) {//No existe, devuelve null
			
			return null;
		}else {
			Categoria cat = categoriaOptional.get();
			CategoriaDTO cat1=conversor.CategoriaBenToDto(cat);
			return cat1;
		}
		
	}

}
