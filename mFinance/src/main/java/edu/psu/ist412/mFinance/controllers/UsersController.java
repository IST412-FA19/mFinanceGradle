/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.controllers;

import edu.psu.ist412.mFinance.dao.ApplicationUserRepository;
import edu.psu.ist412.mFinance.models.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Randi Semera
 */
@RestController
public class UsersController {
    @Autowired
    private ApplicationUserRepository userRepository;
    
    @PostMapping(value = "/users")
    public RedirectView addUser(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        ApplicationUser newUser = new ApplicationUser();
        
        newUser.setPassword(password);
        newUser.setUsername(username);
        
        userRepository.save(newUser);
        
        return new RedirectView("/login");
    }
}
