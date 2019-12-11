/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 

package edu.psu.ist412.mFinance.controllers; 

import edu.psu.ist412.mFinance.dao.ApplicationUserRepository; 
import edu.psu.ist412.mFinance.dao.CarLoanRepository; 
import edu.psu.ist412.mFinance.dao.PersonalLoanRepository;
import edu.psu.ist412.mFinance.models.CarLoan; 
import edu.psu.ist412.mFinance.models.Loan;
import edu.psu.ist412.mFinance.models.PersonalLoan;
import java.util.ArrayList;
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
    
    @Autowired
    PersonalLoanRepository personalLoanRepository;

    @GetMapping("/home") 
    public String index() {
        return "home";
    } 
    
    @GetMapping("/loanSummary")
    public ModelAndView summary() {
        
        ModelAndView response = new ModelAndView("loanSummary");
        
        String user = ((UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername(); 
        int userId = userRepository.findByUsername(user).getId();
        
        List<CarLoan> autoLoans = carLoanRepository.findByApplicantAccountId(userId);
        List<PersonalLoan> personalLoans = personalLoanRepository.findByApplicantAccountId(userId);
        
        List<Loan> loans = new ArrayList<>();
        
        autoLoans.stream().forEach((loan) -> loans.add(loan));
        personalLoans.stream().forEach((loan) -> loans.add(loan));
        
        response.addObject("loans", loans);
        
        return response;
    }
}