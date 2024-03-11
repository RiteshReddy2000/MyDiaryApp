package com.example.mydiary.services;

import java.util.List;

import com.example.mydiary.entity.User;

public interface UserService {
  
	public User saveUser(User user);
	public User updateUser(User user);
	public User findById(Long id);
	public void deleteUser(User user);
	public List<User> findAll();
	public User findByUsername(String username);
}
