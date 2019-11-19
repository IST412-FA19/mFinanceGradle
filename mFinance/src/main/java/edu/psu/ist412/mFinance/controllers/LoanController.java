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
    
    @GetMapping(value = "/carForm")
    public RedirectView loadCarLoanView(){
        return new RedirectView("/carLoan");
    }
       
//        @PostMapping(value = "/carForm")
//    public RedirectView approve(CarLoan carLoan){
//        return new RedirectView("/about");
//    }
//    
//    @PostMapping(value = "/carForm")
//    public RedirectView approve2(@RequestParam(value = "firstName") String firstName,
//            @RequestParam(value = "lastName") String lastName,
//            @RequestParam(value = "inputAddress") String address1, 
//            @RequestParam(value = "inputAddress2") String address2,
//            @RequestParam(value = "inputCity") String city,
//            @RequestParam(value = "inputState") String state,
//            @RequestParam(value = "inputZip") String zip,
//            @RequestParam(value = "make") String make,
//            @RequestParam(value = "model") String model,
//            @RequestParam(value = "year") String year,
//            @RequestParam(value = "mileage") int miles,    
//            @RequestParam(value = "vin") String vin)
//            {
//                
//            CarLoan loan = new CarLoan(firstName, lastName, address1, address2,
//                city, state, zip, make, model, year, miles, vin);
//        return new RedirectView("/output");
//    }
    
        @PostMapping(value = "/carForm")
    public RedirectView outPUtView(@RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "inputAddress") String address1, 
            @RequestParam(value = "inputAddress2") String address2,
            @RequestParam(value = "inputCity") String city,
            @RequestParam(value = "inputState") String state,
            @RequestParam(value = "inputZip") String zip,
            @RequestParam(value = "make") String make,
            @RequestParam(value = "model") String model,
            @RequestParam(value = "year") String year,
            @RequestParam(value = "mileage") int miles,    
            @RequestParam(value = "vin") String vin)
            {
                
            CarLoan loan = new CarLoan(firstName, lastName, address1, address2,
                city, state, zip, make, model, year, miles, vin);
        return new RedirectView("/output");
    }
       
    }

