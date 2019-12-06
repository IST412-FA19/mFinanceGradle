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
import javax.persistence.OneToOne;

/**
 *
 * @author Randi Semera
 */
@Entity
public class CarLoan implements Loan, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @OneToOne
    private ApplicationUser applicantAccount;
    @Column(nullable = false, unique = false)
    private String firstName;
    private String lastName;
    private double amount;
    private String make;
    private String model;
    private String year;
    private int mileage;
    private String vin;
    
    public CarLoan() {}
    
    public Integer getId() {
        return id;
    }
    
    public ApplicationUser getApplicantAccount() {
        return this.applicantAccount;
    }
    
    public void setApplicantAccount(ApplicationUser applicant) {
        this.applicantAccount = applicant;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
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

