package com.example.demoassignment.service;

import com.example.demoassignment.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    String saveUsers(List<User> users);

    List<User> getUsers();

    Optional<User> getUser(Integer userId);
    String updateUser(User user);

    String deleteUser(Integer id);
}
