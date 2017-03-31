package com.services.user;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.user.UserDao;
import com.models.user.User;

import dto.UserDTO;

@Service
@Transactional//(readOnly = true)
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public List<UserDTO> findAll() {
		final Iterable<User> users = userDao.findAll();
		final List<UserDTO> usersDTO = new ArrayList<UserDTO>();
		users.forEach(u -> { usersDTO.add(transform(u)); });
		return usersDTO;
	
	}
	
	
	@Override
	public UserDTO transform(User user) {
		final UserDTO userDTO = new UserDTO(user.getId(), user.getName());
		return userDTO;
	}
	@Override
	public User transform(UserDTO userDTO) {
		final User user = new User();
		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		return user;
	}

}
