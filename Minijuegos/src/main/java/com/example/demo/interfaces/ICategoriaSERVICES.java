package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.Categoria;

public interface ICategoriaSERVICES {

	public List<Categoria> listarcategorias();
	public void borrarcategoria(int id_categoria);	
	public void addcategoria(Categoria categoria);    
	public Categoria buscar_porid_categoria(int id_categoria); 
	
}
