/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.controllers;

import edu.psu.ist412.mFinance.dao.ContactFormRepository;
import edu.psu.ist412.mFinance.models.ContactMessage;
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
public class ContactFormController {
    
    @Autowired
    private ContactFormRepository contactRepository;
    
    @GetMapping(value = "/contact")
    public RedirectView loadContactView(){
        return new RedirectView("/contactUs");
    }
    
    @PostMapping(value = "/contact")
    public RedirectView contactForm(@RequestParam(value = "name") String name,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "subject") String subject,
            @RequestParam(value = "entry") String entry){
        
        ContactMessage message = new ContactMessage(name, email, subject, entry);
        
        contactRepository.save(message);
        
        return new RedirectView("/home");
    }
    
    
}


