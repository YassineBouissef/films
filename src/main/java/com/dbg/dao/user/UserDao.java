package com.dbg.dao.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.dbg.model.user.User;

@Repository
public interface UserDao extends PagingAndSortingRepository<User, Integer> {

}
