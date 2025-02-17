/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.models;

import java.text.DecimalFormat;

/**
 *
 * @author Randi Semera
 */
public interface Loan {
    void setDetails(String first, String last, Double am);
    String getLoanType();
    Double getLoanAmount();
    LoanStatus getLoanStatus();
    String getDetails();

    default String getFormattedLoanAmount() {
        String pattern = "###,##0.0#";
        DecimalFormat formatter = new DecimalFormat(pattern);

        return "$" + formatter.format(getLoanAmount());
    }
}