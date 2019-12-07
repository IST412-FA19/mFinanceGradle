/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.models;
import java.io.Serializable;
import java.util.Date;
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
public class PersonalLoan implements Loan, Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @OneToOne
    private ApplicationUser applicantAccount;
    @Column(nullable = false, unique = false)
    private String firstName;
    private String lastName;
    private String dob;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String employer;
    private String occupation;
    private String employerState;
    private String salary;
    private String years;
    private double amount;
    private String purpose;
    private Double loanAmount;
    

public PersonalLoan(){
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmployerState() {
        return employerState;
    }

    public void setEmployerState(String employerState) {
        this.employerState = employerState;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void setPurpose(String p){
        this.purpose = p;
    }
    
    public String getPurpose(){
        return purpose;
    }

    
    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }  
    
    public Integer getId() {
        return id;
    }
    
    public ApplicationUser getApplicantAccount(){
        return this.applicantAccount;
    }
    
    public void setApplicantAccount(ApplicationUser applicant){
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
    
    @Override
    public String getDetails(){
        return "Full Name: " + this.firstName 
                + " " + this.lastName
                + " \nLoan Amount Requested: $" + this.amount 
                + " \nLoan Purposes: " + this.purpose; 
    }    
    
    @Override
    public String getLoanType(){
        return "Personal Loan";
    }
}



