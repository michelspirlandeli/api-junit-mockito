package com.michelspirlandeli.services;

import com.michelspirlandeli.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
}
