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
public interface Loan {
    void setDetails(String first, String last, Double am);
    public String getLoanType();
    public Double getLoanAmount();
    public LoanStatus getLoanStatus();
    public String getDetails();
}