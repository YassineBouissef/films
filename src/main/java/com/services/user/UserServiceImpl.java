package com.services.user;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
//import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.user.UserDao;
import com.models.user.User;

import dto.UserDTO;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDao userDao;
	
	/********************BUSCAR(Todos)**************************/

	public List<UserDTO> findAll() {
		final Iterable<User> users = userDao.findAll();
		final List<UserDTO> usersDTO = new ArrayList<UserDTO>();
		users.forEach(u -> { usersDTO.add(transform(u)); });
		return usersDTO;
	}
	
	/********************BUSCAR(Id)**************************/
	@Override
	public UserDTO findUserDTOById(Integer id) {
		return transform(findUserById(id));
	}
	
	
	public User findUserById(Integer id) {
		final User user = userDao.findOne(id);
		return user;
	}
	
	/********************CREAR**************************/

	@Override
	public UserDTO create(UserDTO userDTO) {
		final User user = transform(userDTO);
		return transform(userDao.save(user));
	}
	
	/********************BORRAR**************************/
	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}
	
	/********************TRASNFORMAR**************************/
	@Override
	public UserDTO transform(User user) {
		final UserDTO userDTO = new UserDTO(user.getId(),user.getName());
		return userDTO;
	}
	
	@Override
	public User transform(UserDTO u) {
		final User user = new User();
		user.setId(u.getId());
		user.setName(u.getName());
		return user;
	}

}
