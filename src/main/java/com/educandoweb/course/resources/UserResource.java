package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

//userResource são os recursos básicos para a aplicação spring boot
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "maria", "maria@gmail.com", "9999999999", "12345"); //criando o usuario com construtor
		return ResponseEntity.ok().body(u); //	responseentity.ok vai retornar com sucesso no http e body(u) para o usuario
		
	}
}
