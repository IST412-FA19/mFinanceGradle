/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Randi Semera
 */
@Entity
public class CarLoan implements Loan{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(nullable = false, unique = false)
    private String firstName;
    private String lastName;
    private double amount;
    private String make;
    private String model;
    private String year;
    private int mileage;
    private String vin;

    public CarLoan(String first, String last, String add, String add2, String city, 
            String st, String z, String m, String mo, String y, int mile, String vin){

        setCarMake(m);
        setCarModel(mo);
        setCarYear(y);
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Override
    public void setDetails(String first, String last, Double am){
        this.firstName = first;
        this.lastName = last;
        this.amount = am;
    }
    
    public void setCarMake(String m){
        this.make =m;
    }
    
    public void setCarModel(String mo){
        this.model=mo;
    }
    
    public void setCarYear(String y){
        this.year=y;
    }
    @Override
    public String getDetails(){
        return "Full Name: " + this.firstName 
                + " " + this.lastName
                + " \nLoan Amount Requested: $" + this.amount 
                + " \nCar Make: " + this.make 
                + " \nCar Model: " + this.model 
                + " \nYear: " + this.year;
    }    
    
    @Override
    public String getLoanType(){
        return "Car Loan";
    }

}
