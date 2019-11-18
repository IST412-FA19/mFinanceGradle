/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.controllers;

import edu.psu.ist412.mFinance.models.ApplicationUser;
import edu.psu.ist412.mFinance.models.CarLoan;
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
    
    @GetMapping(value = "/loans")
    public RedirectView loadTypesView(){
        return new RedirectView("/loanTypes");
    }
    
    @PostMapping(value = "/carInput")
    public RedirectView addUser(@RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "address") String address,
            @RequestParam(value = "address2") String address2,
            @RequestParam(value = "city") String city,
            @RequestParam(value = "state") String state,
            @RequestParam(value = "zip") String zip,
            @RequestParam(value= "make") String make,
            @RequestParam(value = "model") String model,
            @RequestParam(value = "Year") String year,
            @RequestParam(value = "mileage") int miles,
            @RequestParam(value = "vin") String vin) {
       
        CarLoan newLoan = new CarLoan();
        
//        newLoan.setFirstName(firstName);
//        newLoan.setLastName(lastName);
//        newLoan.setAddress(address);
//        newLoan.setAddress2(address2);
//        newLoan.setCity(city);
//        newLoan.setState(state);
//        newLoan.setZip(zip);
//        newLoan.set

        return new RedirectView("/home");
    }

    
    }

