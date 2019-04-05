package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.beans.Categoria;
import com.example.demo.interfaces.ICategoriaSERVICES;

@Service
public class CategoriaSERVICES  implements ICategoriaSERVICES{

	@Override
	public List<Categoria> listarcategorias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarcategoria(int id_categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addcategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Categoria buscar_porid_categoria(int id_categoria) {
		// TODO Auto-generated method stub
		return null;
	}

}
