package com.michelspirlandeli.services;

import com.michelspirlandeli.domain.User;
import com.michelspirlandeli.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
