/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.dao;

import edu.psu.ist412.mFinance.models.ApplicationUser;
import edu.psu.ist412.mFinance.models.ApplicationUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author garre
 */
@Service("applicationUserDetailsService")
public class ApplicationUserDetailsService implements UserDetailsService {
    
    @Autowired
    private AuthenticationRepository repository;
    
    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        ApplicationUser user = repository.findByUsername(string);
        
        System.err.println("User: " + string + " attempted access!");
        
        if (user == null) {
            throw new UsernameNotFoundException("User does not exist.");
        }
        
        return new ApplicationUserDetails(user);
    }
    
}
