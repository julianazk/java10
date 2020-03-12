package com.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.entity.User;
import com.challenge.repository.UserRepository;
import com.challenge.service.interfaces.UserServiceInterface;

public class UserService implements UserServiceInterface{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User save(User object) {
		// TODO Auto-generated method stub
		return userRepository.save(object);
	}

	@Override
	public Optional<User> findById(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId);
	}

	@Override
	public List<User> findByAccelerationName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		return null;
	}

}
