package com.heyhelps.usermicroservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.heyhelps.usermicroservice.dao.UserRepository;
import com.heyhelps.usermicroservice.entity.User;


@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/{id}")
	public Optional<User> findById(@PathVariable Long id) {
		Optional<User> findOne = this.userRepository.findById(id);
		return findOne;
	}

}