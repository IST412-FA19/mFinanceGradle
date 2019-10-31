/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.controllers;

import edu.psu.ist412.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author garre
 */
@RestController
public class AuthenticationController {
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        if (user.getUserName().equals("test") && user.getUserPass().equals("password")) {
            return new ResponseEntity<>("Authorized!", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Please use the following credentials: test password", HttpStatus.FORBIDDEN);
        }
    }
}
