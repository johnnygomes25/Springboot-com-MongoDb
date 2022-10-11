package com.johnnygomes.br.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnnygomes.br.domain.User;
import com.johnnygomes.br.repository.UserRepository;

@Service
public class UserSerice {
	
	@Autowired
	private UserRepository repo;
	

	public List<User>findAll() {
		return repo.findAll();
	}

}


