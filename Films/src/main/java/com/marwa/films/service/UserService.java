package com.marwa.films.service;

import java.util.List;
import org.springframework.data.domain.Page;

import com.marwa.films.entities.Role;
import com.marwa.films.entities.User;

public interface UserService {
	List <User> findAll();
	List<User> getAllUsers();
	User saveUser(User user);
	Page<User> getAllUsersParPage(int i, int j);
	void deleteUserById(Long id);
	User getUsers(Long id);
	User updateUsers(User g);
	List <Role> getRoles();
}
