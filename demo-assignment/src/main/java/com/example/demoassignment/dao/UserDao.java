package com.example.demoassignment.dao;

import com.example.demoassignment.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {

}
