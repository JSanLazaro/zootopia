package org.factoriaf5.zootopia.services;

import java.util.List;

import org.factoriaf5.zootopia.models.User;
import org.factoriaf5.zootopia.repositories.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;
    public UserService(UserRepository repo){
        this.userRepository = repo;
    }
    public List<User> getAll(){
        List<User> users = userRepository.findAll();
        return users;
    }
    public User findById(Long id){
        User user = userRepository.findById(id).orElseThrow();
        return user;
    }
    public User findUserByName(String name){
        return userRepository.findByName(name);
    }
}
