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
//         return new CarLoan(String first, String last, String add, String add2, String city, 
//            String st, String z, String m, String mo, String y, int mile, String vin);
      }      
      
      return null;
   }
}

