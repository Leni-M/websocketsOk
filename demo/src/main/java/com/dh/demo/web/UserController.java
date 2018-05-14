package com.dh.demo.web;

import com.dh.demo.domain.User;
import com.dh.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jhonny on 6/17/17.
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody UserRequestDTO user){
        userService.addUser(user);
    }

    public static class UserRequestDTO{

        private String firstName;
        private String lastName;
        private String email;
        private String userName;
        private String password;
        private String status;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }

        public String getStatus() {
            return status;
        }
    }
}
