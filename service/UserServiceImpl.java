package com.vastika.userinfosystem.service;

import com.vastika.userinfosystem.model.User;
import com.vastika.userinfosystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user)
    {
    userRepository.save(user);
    }

    @Override
    public void updateUser(User user)
    {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int id)
    {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(int id)
    {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
}
