package com.luis.aplicacion.service;

import javax.validation.Valid;

import com.luis.aplicacion.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser( User user) throws Exception;
	
}
