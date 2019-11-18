/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.models;

/**
 *
 * @author Randi Semera
 */
public class CarLoan implements Loan{
    private String firstName;
    private String lastName;
    private double amount;
    private String make, model, year;
    
    public void CarLoan(String first, String last, String add, String add2, String city, 
            String st, String z, String m, String mo, String y, int mile, String vin){

        setCarMake(m);
        setCarModel(mo);
        setCarYear(y);
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
