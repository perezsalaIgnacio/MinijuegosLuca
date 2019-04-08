package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.CategoriasJuegos;
import com.example.demo.dto.CategoriasJuegosDTO;

public interface ICategoriasJuegosSERVICES {
	public List<CategoriasJuegosDTO> listarcategoriasjuegos();
	public void borrarcategoriajuego(int id_categoria_juego);	
	public void addcategoriajuegos(CategoriasJuegosDTO categoriasjuegos); 
	public CategoriasJuegosDTO buscar_porid_categoria(int id_categoria_juego);
}
