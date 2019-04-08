package com.example.demo.daos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.beans.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario,Integer>{
	
	public Usuario findUsuarioByNick(String nick);

}
