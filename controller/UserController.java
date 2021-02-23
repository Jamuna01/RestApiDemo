package com.vastika.userinfosystem.controller;

import com.vastika.userinfosystem.model.User;
import com.vastika.userinfosystem.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserController
{
    private final UserService userService;


    public UserController(UserService userService)
    {
        this.userService = userService;
    }
    @PostMapping
    public ResponseEntity saveUser(@RequestBody User user)
    {
        userService.saveUser(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateUser(@RequestBody User user)
    {
        userService.updateUser(user);
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUser()
    {
        List<User> users = userService.getAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping(value ="/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id)
    {
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteUser(@PathVariable int id)
    {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}


