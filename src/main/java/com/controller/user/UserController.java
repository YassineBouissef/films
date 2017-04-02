package com.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.services.user.InvalidDataException;
import com.services.user.UserNotFoundException;
import com.services.user.UserService;

import dto.UserDTO;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<UserDTO> findAll() {
		return userService.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserDTO findById(@PathVariable("id") Integer id) throws UserNotFoundException{
		return userService.findUserDTOById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public UserDTO create(@RequestBody UserDTO userDTO) throws InvalidDataException{
		return userService.create(userDTO);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id){
		userService.delete(id);
	}
}

