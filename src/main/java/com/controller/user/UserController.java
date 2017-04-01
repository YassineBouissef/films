package com.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.models.user.User;
import com.services.user.UserService;

import dto.UserDTO;

@RestController
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserService userService;
		
	/*
	@RequestMapping(method = RequestMethod.GET)
	public User findAll(){
		return new User();
	}*/
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserDTO findById(@PathVariable("id") Integer id){
		return userService.findUserDTOById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<UserDTO> findAll(@RequestParam(value = "name", required = false) String name) {
		return userService.findAll();
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public UserDTO create(@RequestBody UserDTO userDTO){
		return userService.create(userDTO);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id){
		userService.delete(id);
	}
	
}

