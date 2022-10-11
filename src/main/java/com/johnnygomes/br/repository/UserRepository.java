package com.johnnygomes.br.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.johnnygomes.br.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
