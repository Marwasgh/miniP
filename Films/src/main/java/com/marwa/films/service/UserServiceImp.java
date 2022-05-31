package com.marwa.films.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.marwa.films.entities.Role;
import com.marwa.films.entities.User;
import com.marwa.films.repos.RoleRepo;
import com.marwa.films.repos.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Override
	public List<User> findAll() {
	
		return userRepository.findAll();
		
	}
	
	@Autowired
	UserRepository userRepository ;
	

	@Autowired
	RoleRepo roleRepo ;
	
	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public Page<User> getAllUsersParPage(int page, int size) {
		
		return userRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public User getUsers(Long id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public User updateUsers(User g) {
		
		return userRepository.save(g);
	}
	

	@Override
	public List <Role> getRoles(){
		return roleRepo.findAll();
	}

}
