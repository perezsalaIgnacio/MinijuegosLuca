package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.Puntuaciones;
import com.example.demo.beans.Usuario;
import com.example.demo.dto.PuntuacionesDTO;
import com.example.demo.dto.UsuarioDTO;

public interface IUsuarioSERVICES {

	public List<UsuarioDTO> listarusuarios();
	public void borrar_usuarios(int id_usuario);	
	public void add_usuarios(UsuarioDTO usuario);    
	public UsuarioDTO buscar_porid_usuario(int id_usuario);
	public UsuarioDTO buscarUsuarioPorNick(String nick);

}
