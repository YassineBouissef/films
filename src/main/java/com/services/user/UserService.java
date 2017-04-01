package com.services.user;

import java.util.List;


import com.models.user.User;

import dto.UserDTO;

public interface UserService {
	
	List<UserDTO> findAll();

	User findUserById(Integer id);
	
	UserDTO findUserDTOById(Integer id);

	UserDTO transform(User user);

	User transform(UserDTO userDTO);

	UserDTO create(UserDTO userDTO);

	void delete(Integer id);
}
