package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.Categoria;
import com.example.demo.dto.CategoriaDTO;

public interface ICategoriaSERVICES {

	public List<CategoriaDTO> listarcategorias();
	public void borrarcategoria(int id_categoria);	
	public void addcategoria(CategoriaDTO categoria);    
	public CategoriaDTO buscar_porid_categoria(int id_categoria); 
	
}
