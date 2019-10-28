package com.luis.aplicacion.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luis.aplicacion.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//	public Optional findByUsername(String username);
//	
//	public Optional findByIdAndPassword(Long id, String password);

}
