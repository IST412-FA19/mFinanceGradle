/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.controllers;

import edu.psu.ist412.mFinance.dao.ApplicationUserRepository;
import edu.psu.ist412.mFinance.dao.ApplicationUserSecurityPrincipalRepository;
import edu.psu.ist412.mFinance.models.ApplicationUser;
import edu.psu.ist412.mFinance.models.ApplicationUserSecurityPrincipal;
import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    @Autowired
    private ApplicationUserSecurityPrincipalRepository userSecurityPrincipalRepository;
    
    @GetMapping(value = "/aboutPage")
    public RedirectView loadaboutView(){
        return new RedirectView("/about");
    } 
    
   
    @PostMapping(value = "/users")
    public RedirectView addUser(@RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "username") String username, 
            @RequestParam(value = "password") String password,
            @RequestParam(value = "address") String address,
            @RequestParam(value = "address2") String address2,
            @RequestParam(value = "city") String city,
            @RequestParam(value = "state") String state,
            @RequestParam(value = "zip") String zip) {
        
        ApplicationUser newUser = new ApplicationUser();
        HashSet<ApplicationUserSecurityPrincipal> principals = new HashSet();
        
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setAddress(address);
        newUser.setAddress2(address2);
        newUser.setCity(city);
        newUser.setState(state);
        newUser.setZip(zip);
        newUser.setPassword(password);
        newUser.setUsername(username);
        newUser.setEmail(email);
        
        principals.add(userSecurityPrincipalRepository.findByPrincipalName("ROLE_USER"));
        newUser.setSecurityPrincipals(principals);
        
        userRepository.save(newUser);
        
        return new RedirectView("/login");
    }
}
