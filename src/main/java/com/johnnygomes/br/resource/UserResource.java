package com.johnnygomes.br.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.johnnygomes.br.domain.User;
import com.johnnygomes.br.workshopmongo.services.UserSerice;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	
	@Autowired
	private UserSerice service;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
	    List<User> list = service.findAll();
	   	    return ResponseEntity.ok().body(list);
	}
	
	
	
	
	
}
