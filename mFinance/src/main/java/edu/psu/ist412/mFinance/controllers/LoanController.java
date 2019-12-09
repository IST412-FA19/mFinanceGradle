/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.controllers;

import edu.psu.ist412.mFinance.dao.ApplicationUserRepository;
import edu.psu.ist412.mFinance.models.ApplicationUser;
import edu.psu.ist412.mFinance.models.CarLoan;
import edu.psu.ist412.mFinance.models.PersonalLoan;
import edu.psu.ist412.mFinance.dao.CarLoanRepository;
import edu.psu.ist412.mFinance.dao.LoanStatusRepository;
import edu.psu.ist412.mFinance.dao.PersonalLoanRepository;
import org.springframework.security.core.context.SecurityContextHolder; 
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Randi Semera
 */
@RestController
public class LoanController {
    @Autowired
    private ApplicationUserRepository userRepository; 
    @Autowired
    private CarLoanRepository carLoanRepository;
    @Autowired
    private PersonalLoanRepository personalLoanRepository;
    @Autowired
    private LoanStatusRepository loanStatusRepository;
    
    @GetMapping(value = "/loans")
    public RedirectView loadTypesView(){
        return new RedirectView("/loanTypes");
    }
    

    @GetMapping(value = "/carForm")
    public RedirectView loadCarLoanView(){
        return new RedirectView("/carLoan");
    }
    
    @GetMapping(value = "/personalForm")
    public RedirectView loadPersonalLoanView(){
        return new RedirectView("/personalLoan");
    }
    
    @GetMapping(value = "/businessForm")
    public RedirectView loadBusinessLoanView(){
        return new RedirectView("/businessLoan");
    }
    
    @PostMapping(value = "/personalForm")
    public RedirectView personalForm(@RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "dob") String dob,
            @RequestParam(value = "inputAddress") String address1, 
            @RequestParam(value = "inputAddress2") String address2,
            @RequestParam(value = "inputCity") String city,
            @RequestParam(value = "inputState") String state,
            @RequestParam(value = "inputZip") String zip,
            @RequestParam(value = "employer") String employer,
            @RequestParam(value = "occupation") String occupation,
            @RequestParam(value = "inputEmpState") String inputEmpState,
            @RequestParam(value = "salary") String salary,
            @RequestParam(value = "purpose") String purpose)
        {
            PersonalLoan loan = new PersonalLoan();
            
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal(); 

            if (principal != null) { 
                String username = ((UserDetails)principal).getUsername(); 
                ApplicationUser user = userRepository.findByUsername(username);
                loan.setApplicantAccount(user);
            }
            
            loan.setFirstName(firstName);
            loan.setLastName(lastName);
            loan.setDob(dob);
            loan.setAddress(address1);
            loan.setAddress2(address2);
            loan.setCity(city);
            loan.setState(state);
            loan.setZip(zip);
            loan.setEmployer(employer);
            loan.setOccupation(occupation);
            loan.setEmployerState(inputEmpState);
            loan.setSalary(salary);
            loan.setPurpose(purpose);
            loan.setStatus(loanStatusRepository.findByStatusName("INITIATED"));
            
            // TODO: Replace with request parameter
            loan.setLoanAmount(12312414.0);
            
            personalLoanRepository.save(loan);
                
            return new RedirectView("/loanApproval");
    }
    
    @PostMapping(value = "/carForm")
    public RedirectView carLoanForm(@RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "dob") String dob,
            @RequestParam(value = "inputAddress") String address1, 
            @RequestParam(value = "inputAddress2") String address2,
            @RequestParam(value = "inputCity") String city,
            @RequestParam(value = "inputState") String state,
            @RequestParam(value = "inputZip") String zip,
            @RequestParam(value = "employer") String employer,
            @RequestParam(value = "occupation") String occupation,
            @RequestParam(value = "inputEmpState") String inputEmpState,
            @RequestParam(value = "salary") String salary,
            @RequestParam(value = "years") String years,
            @RequestParam(value = "make") String make,
            @RequestParam(value = "model") String model,
            @RequestParam(value = "year") String year,
            @RequestParam(value = "mileage") String miles,    
            @RequestParam(value = "vin") String vin)
            {
            CarLoan loan = new CarLoan();
            
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal(); 

            if (principal != null) { 
                String username = ((UserDetails)principal).getUsername(); 
                ApplicationUser user = userRepository.findByUsername(username);
                loan.setApplicantAccount(user);
            }
            
            loan.setFirstName(firstName);
            loan.setLastName(lastName);
            loan.setDob(dob);
            loan.setAddress(address1);
            loan.setAddress2(address2);
            loan.setCity(city);
            loan.setState(state);
            loan.setZip(zip);
            loan.setEmployer(employer);
            loan.setOccupation(occupation);
            loan.setEmployerState(inputEmpState);
            loan.setSalary(salary);
            loan.setMake(make);
            loan.setModel(model);
            loan.setYear(year);
            loan.setMileage(miles);
            loan.setVin(vin);
            loan.setStatus(loanStatusRepository.findByStatusName("INITIATED"));
            
            // TODO: Replace with request parameter
            loan.setLoanAmount(12312412431.0);
            
            carLoanRepository.save(loan);
                System.out.println("Loan: " + loan.getId() + " " + loan.getLoanType() + " " + loan.getFirstName());
            
            return new RedirectView("/loanApproval");
    }
    

}

