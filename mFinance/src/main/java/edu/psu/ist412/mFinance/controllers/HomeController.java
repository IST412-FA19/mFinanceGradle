/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.controllers;

import edu.psu.ist412.mFinance.dao.ApplicationUserRepository;
import edu.psu.ist412.mFinance.dao.CarLoanRepository;
import edu.psu.ist412.mFinance.models.CarLoan;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author garre
 */
@Controller
public class HomeController {
    @Autowired
    ApplicationUserRepository userRepository;
    @Autowired
    CarLoanRepository carLoanRepository;
    
    @GetMapping("/home")
    public ModelAndView index() {
        ModelAndView response = new ModelAndView("home");
        
        String user = ((UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
        int userId = userRepository.findByUsername(user).getId();
        List<CarLoan> loans = carLoanRepository.findByApplicantAccountId(userId);
        
        response.addObject("loans", loans);
        
        return response;
    }
}
