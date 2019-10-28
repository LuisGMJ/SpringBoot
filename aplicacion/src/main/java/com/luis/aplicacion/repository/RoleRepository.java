package com.luis.aplicacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luis.aplicacion.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {


}
