package com.marwa.films.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.marwa.films.entities.Role;

@RepositoryRestResource(path = "rest")
public interface RoleRepo extends JpaRepository<Role, Long> {

}
