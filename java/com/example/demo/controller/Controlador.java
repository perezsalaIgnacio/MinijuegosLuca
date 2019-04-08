package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.interfaces.ICategoriaSERVICES;
import com.example.demo.interfaces.IUsuarioSERVICES;

@Controller
public class Controlador {

	@Autowired
	IUsuarioSERVICES usuarioSERVICES;
	

	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		HttpSession session=request.getSession(true);//abro sesion
		
		String name=request.getParameter("usuario");
		String pass=request.getParameter("password");
		
		UsuarioDTO user=new UsuarioDTO();
			
		boolean resultado=confirmaLogin(name,pass,user);
	
		session.setAttribute("user", user);
		
		if(resultado) return "index";
		
		else return "login";
	}
	

	@RequestMapping("/register")
	public String register(HttpServletRequest request) 
	{
		HttpSession session=request.getSession(true);//abro sesion
		
		String nick=request.getParameter("nick");
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		String repass=request.getParameter("repassword");
		
		if(pass.equals(repass)) 
		{
			UsuarioDTO user=new UsuarioDTO();
			user.setNick(nick);
			user.setEmail(email);
			user.setPassword(pass);
			if (usuarioSERVICES.buscarUsuarioPorNick(user.getNick())==null) 
			{
			usuarioSERVICES.add_usuarios(user);
			session.setAttribute("nick", nick);
			request.setAttribute("mensaje", "Cuenta creada");
			}else {
				
				request.setAttribute("mensaje", "El nick indicado ya existe");
				return "registro";
			}
			
		}else {
				request.setAttribute("mensaje", "las contraseñas no coinciden");
				return "registro";
		}
	
		return "index";
	}
	
	
	public boolean confirmaLogin(String name, String password,UsuarioDTO user) {
		
		boolean resultado=false;
		resultado=comprubaCampo(name);
		resultado=comprubaCampo(password);
		user=dameUser(name);
		
		if(user!=null) resultado=comparaPass(user,password);
		
		return resultado;
	}
	
	private boolean comprubaCampo(String parm1) {
		if(parm1.isEmpty()) return false;
		else return true;
	}
	
	private UsuarioDTO dameUser(String name) {
		UsuarioDTO user=usuarioSERVICES.buscarUsuarioPorNick(name);
		
		if(user!=null) {
			return user;
		}
		return null;
	}
	
	private boolean comparaPass(UsuarioDTO usuario,String pass) {
		
		if(usuario.equals(pass)) {
			return true;
		}
		return false;
	}
	
}
