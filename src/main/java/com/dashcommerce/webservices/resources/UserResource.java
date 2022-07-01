package com.dashcommerce.webservices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashcommerce.webservices.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User (1L, "Mateus", "mateus.brandeburski92@gmail.com", "51985578386", "12345");
		return ResponseEntity.ok().body(u);
		
	}

}
