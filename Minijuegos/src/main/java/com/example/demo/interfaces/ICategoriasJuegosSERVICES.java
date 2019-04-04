package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.CategoriasJuegos;

public interface ICategoriasJuegosSERVICES {
	public List<CategoriasJuegos> listarcategoriasjuegos();
	public void borrarcategoriajuego(int id_categoria_juego);	
	public void addcategoriajuegos(CategoriasJuegos categoriasjuegos); 
	public CategoriasJuegos buscar_porid_categoria(int id_categoria_juego);
}
