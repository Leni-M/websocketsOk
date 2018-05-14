package com.dh.demo.service;

import com.dh.demo.domain.User;
import com.dh.demo.repository.UserRepository;
import com.dh.demo.web.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jhonny on 6/17/17.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void addUser(UserController.UserRequestDTO newUserDTO){
        User newUser = new User();
        newUser.setEmail(newUserDTO.getEmail());
        newUser.setFirstName(newUserDTO.getFirstName());
        newUser.setLastName(newUserDTO.getLastName());
        newUser.setStatus(newUserDTO.getStatus());
        newUser.setUserName(newUserDTO.getUserName());

        userRepository.save(newUser);
    }

}
