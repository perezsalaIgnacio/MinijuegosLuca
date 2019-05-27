package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class Controlador {

	@RequestMapping("/registro")
	public String registro() {
		return "registro";
	}

}
