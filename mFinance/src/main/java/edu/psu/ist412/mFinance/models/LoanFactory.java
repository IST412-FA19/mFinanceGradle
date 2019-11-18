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
public class LoanFactory {

   public Loan getLoanType(String loanType){
      if(loanType == null){
         return null;
      }		
      if(loanType.equalsIgnoreCase("CAR")){
         return new CarLoan();
      }      
      return null;
   }
}
