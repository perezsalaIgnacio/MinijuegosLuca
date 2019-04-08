package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="usuarios")

public class Usuario {
	
		@Id
		@Column(name="id_usuario")
		private int id_usuario;
		@Column(name="pass")
		private String password;
		@Column(name="email")
		private String email;
		@Column(name="rol")
		private String rol;
		@Column(name="nick")
		private String nick;
		
		
		public Usuario() {}
		
		public Usuario(int id_usuario, String paassword, String email, String rol,String nick) {
			
			this.id_usuario = id_usuario;
			this.password = paassword;
			this.email = email;
			this.rol = rol;
			this.nick = nick;
		}
		

		@Override
		public String toString() {
			return "Juego [id_usuario=" + id_usuario + ", password=" + password + ", email=" + email + ", rol=" + rol+ ", nick=" + nick
					+ "]";
		}

		public int getId_usuario() {
			return id_usuario;
		}

		public void setId_usuario(int id_usuario) {
			this.id_usuario = id_usuario;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String paassword) {
			this.password = paassword;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getRol() {
			return rol;
		}

		public void setRol(String rol) {
			this.rol = rol;
		}

		public String getNick() {
			return nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}
	
	
	
}
