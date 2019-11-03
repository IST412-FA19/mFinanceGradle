/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.dao;

import edu.psu.ist412.mFinance.models.ApplicationUser;
import edu.psu.ist412.mFinance.models.ApplicationUserDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author garre
 */
@Component
public class UserToUserDetailsConverter implements Converter<ApplicationUser, ApplicationUserDetails> {
    @Override
    public ApplicationUserDetails convert(ApplicationUser user) {
        ApplicationUserDetails userDetails = new ApplicationUserDetails();
        
        if (user != null) {
            userDetails.setPassword(user.getPassword());
            userDetails.setUsername(user.getUsername());
        }
        
        return userDetails;
    }
}
