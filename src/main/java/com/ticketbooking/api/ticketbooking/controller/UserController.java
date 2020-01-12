package com.ticketbooking.api.ticketbooking.controller;

import com.ticketbooking.api.ticketbooking.exceptions.UserNotFoundException;
import com.ticketbooking.api.ticketbooking.models.User;
import com.ticketbooking.api.ticketbooking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("create/user")
    public ResponseEntity<User> createUser(@RequestBody  User user)
    {
        if(user == null){
            throw new UserNotFoundException("Please enter valid value");
        }

        User u = new User();
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(u).toUri();
      return new ResponseEntity<User>(HttpStatus.OK);
    }

    @PutMapping("update/user")
    public ResponseEntity<User> updateUser(@PathVariable  User user){
        return new ResponseEntity<User>(HttpStatus.OK);
    }

    @DeleteMapping("delete/user/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable  int id){
        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

    @GetMapping("user/detail/{id}")
    public ResponseEntity<User> getUserDetail(@PathVariable int id ){
     return new ResponseEntity<>(HttpStatus.OK);
    }
}
