package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Usuario;
import com.example.demo.daos.UsuarioRepository;
import com.example.demo.dto.UsuarioDTO;
import com.example.demo.interfaces.IUsuarioSERVICES;
import com.example.demo.util.ConversorBenDto;


@Service
public class UsuarioSERVICES implements IUsuarioSERVICES {
	ConversorBenDto conversor=new ConversorBenDto();
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public List<UsuarioDTO> listarusuarios() {
		List<UsuarioDTO> lista = new ArrayList<UsuarioDTO>();
		Iterable<Usuario> usuarioIterable =usuarioRepository.findAll();
		
		for (Usuario usuario : usuarioIterable) {
			UsuarioDTO user=conversor.UserBenToDto(usuario);
			lista.add(user);
		}
		return lista;
	}

	@Override
	public void borrar_usuarios(int id_usuario) {
		usuarioRepository.deleteById(id_usuario);
		
	}

	@Override
	public void add_usuarios(UsuarioDTO usuario) {
		Usuario user=conversor.UserDtoToBen(usuario);
		usuarioRepository.save(user);
	}
	

	@Override
	public UsuarioDTO buscar_porid_usuario(int id_usuario) {
		// TODO Auto-generated method stub
		Optional<Usuario> userOptional = usuarioRepository.findById(id_usuario);
		if(!userOptional.isPresent()) {//No existe, devuelve null
			
			return null;
		}else {
			Usuario usuario = userOptional.get();
			UsuarioDTO user=conversor.UserBenToDto(usuario);
			return user;
		}
		
	}

	@Override
	public UsuarioDTO buscarUsuarioPorNick(String nick) {
		Usuario usuario=usuarioRepository.findUsuarioByNick(nick);
		UsuarioDTO user=conversor.UserBenToDto(usuario);
		return user;
	}

	
	

}
