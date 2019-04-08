package com.example.demo.util;

import java.util.Date;

import com.example.demo.beans.Categoria;
import com.example.demo.beans.CategoriasJuegos;
import com.example.demo.beans.ComentariosJuegos;
import com.example.demo.beans.Juego;
import com.example.demo.beans.Puntuaciones;
import com.example.demo.beans.Usuario;
import com.example.demo.dto.CategoriaDTO;
import com.example.demo.dto.CategoriasJuegosDTO;
import com.example.demo.dto.ComentariosJuegosDTO;
import com.example.demo.dto.JuegoDTO;
import com.example.demo.dto.PuntuacionesDTO;
import com.example.demo.dto.UsuarioDTO;

public class ConversorBenDto {
	
	public ConversorBenDto () {
		
	}
	
	public UsuarioDTO UserBenToDto(Usuario user) {
		UsuarioDTO user1=new UsuarioDTO(user.getId_usuario(),user.getPassword(),user.getEmail(),user.getRol(),user.getNick());
		return user1;
	}
	
	public Usuario UserDtoToBen(UsuarioDTO user) {
		Usuario user1=new Usuario(user.getId_usuario(),user.getPassword(),user.getEmail(),user.getRol(),user.getNick());
		return user1;
	}
	

	public JuegoDTO JuegoBenToDto(Juego juego) {
		JuegoDTO game=new JuegoDTO(juego.getId_juegos(),juego.getValoracion(),juego.getDescripcion(),juego.getMejorUsuario(),juego.getFecha());
		return game;
	}
	
	public Juego JuegoDtoToBen(JuegoDTO juego) {
		Juego game=new Juego(juego.getId_juegos(),juego.getValoracion(),juego.getDescripcion(),juego.getMejorUsuario(),juego.getFecha());
		return game;
	}
	
	

	public CategoriaDTO CategoriaBenToDto(Categoria cat) {
		
		CategoriaDTO cat1= new CategoriaDTO(cat.getId_categoria(),cat.getDescripcion());
		
		return cat1;
	}
	
	public Categoria CategoriaDtoToBen(CategoriaDTO cat) {
		
		Categoria cat1= new Categoria(cat.getId_categoria(),cat.getDescripcion());
		
		return cat1;
	}
	

	
	public CategoriasJuegosDTO CategoriasJuegosBenToDto(CategoriasJuegos catju) {
		
		CategoriasJuegosDTO cat=new CategoriasJuegosDTO(catju.getId_juego(),catju.getId_categoria(),catju.getId_categoria_juego());
		
		return cat;
	}
	
	public CategoriasJuegos CategoriasJuegosDtoToBen(CategoriasJuegosDTO catju) {
		
		CategoriasJuegos cat=new CategoriasJuegos(catju.getId_juego(),catju.getId_categoria(),catju.getId_categoria_juego());
		
		return cat;
	}
	
		
	public PuntuacionesDTO PuntuacionesBenToDto(Puntuaciones puntuacion) {
		PuntuacionesDTO puntuacion2=new PuntuacionesDTO(puntuacion.getPuntuacion(),puntuacion.getId_usuario(),puntuacion.getId_juego(),puntuacion.getId_puntuacion());
		
		return puntuacion2;
	}

	public Puntuaciones PuntuacionesDtoToBen(PuntuacionesDTO puntuacion) {
		Puntuaciones puntuacion2=new Puntuaciones(puntuacion.getPuntuacion(),puntuacion.getId_usuario(),puntuacion.getId_juego(),puntuacion.getId_puntuacion());
	
		return puntuacion2;
	}

	public ComentariosJuegosDTO ComentariosJuegosBenToDto(ComentariosJuegos comen) {
		ComentariosJuegosDTO coment=new ComentariosJuegosDTO(comen.getId_usuario(),comen.getId_juego(),comen.getId_comentario(),comen.getComentario());
		return coment;
	}
	
	public ComentariosJuegos ComentariosJuegosDtoToBen(ComentariosJuegosDTO comen) {
		ComentariosJuegos coment=new ComentariosJuegos(comen.getId_usuario(),comen.getId_juego(),comen.getId_comentario(),comen.getComentario());
		return coment;
	}
	
}
