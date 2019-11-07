/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.dao;

import edu.psu.ist412.mFinance.models.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author garre
 */
@Service
public class ApplicationUserService {
    private ApplicationUserRepository repository;

    @Autowired
    public void setRepository(ApplicationUserRepository repository) {
        this.repository = repository;
    }
    
    public ApplicationUser findByUsername(String username) {
        return repository.findByUsername(username);
    }
}
