package org.factoriaf5.zootopia.controllers;

import java.util.List;

import org.factoriaf5.zootopia.models.User;

import org.factoriaf5.zootopia.services.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    UserService userService;
    public UserController(UserService service){
        this.userService = service;
    }
    @CrossOrigin(origins ="http://localhost:4200")
    @GetMapping(path = "/users")
    public List<User> index(){
        List<User> users = userService.getAll();
        return users;
    }
    @GetMapping(path = "/users/{id}")
    public User show(@PathVariable("id") Long id){
        User user = userService.findById(id);
        return user;
    }
    public boolean isAuthenticated(String name, String pass){
        User user = userService.findUserByName(name);
        if(user.getPassword().equals(pass)){
            return true;
        }
        return false;
    }
    
}
