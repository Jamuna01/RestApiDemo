package com.vastika.userinfosystem.service;

import com.vastika.userinfosystem.model.User;

import java.util.List;

public interface UserService
{
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    User getUserById(int id);
    List<User> getAllUser();
}
