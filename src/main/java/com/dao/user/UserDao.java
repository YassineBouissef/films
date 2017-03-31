package com.dao.user;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.models.user.User;


@Repository
public interface UserDao extends PagingAndSortingRepository<User, Integer> {

	public List<User> findByNameContaining(String name);

}