package com.services.user;

import java.util.List;


import com.models.user.User;

import dto.UserDTO;

public interface UserService {
	
	/**
	 * Busca todos los usuarios
	 * 
	 * @return
	 */
	List<UserDTO> findAll();
	
	/**
	 * Busca un usuario por id
	 * 
	 * @param id
	 * @return
	 * @throws UserNotFoundException 
	 */
	User findUserById(Integer id) throws UserNotFoundException;
	
	/**
	 * Devuelve un usuarioDTO buscado a través de su id	 * 
	 * @param id
	 * @return
	 * @throws UserNotFoundException 
	 */
	UserDTO findUserDTOById(Integer id) throws UserNotFoundException;
	
	/**
	 * Transforma un User en UserDTO 	
	 * 
	 * @param id
	 * @return
	 * @throws UserNotFoundException 
	 */
	UserDTO transform(User user) throws UserNotFoundException;
	
	/** 
	 * Transforma DTO creación de un usuario	 
	 * 
	 * @param user
	 * @return
	 */
	User transform(UserDTO userDTO);
	
	/**	 
	 * Dar de alta un usuario nuevo en el sistema
	 * 
	 * @param id
	 * @return
	 * @throws InvalidDataException 
	 */
	UserDTO create(UserDTO userDTO) throws InvalidDataException;
	
	/**	
	 * Borrar un usuario del sistema
	 * 
	 * @param userDTO
	 * @return
	 */
	void delete(Integer id);
}
