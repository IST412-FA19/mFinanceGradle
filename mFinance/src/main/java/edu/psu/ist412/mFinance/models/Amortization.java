/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.models;
import java.io.PrintStream;
import java.math.*;
/**
 *
 * @author GRamos
 */
public class Amortization {
    double paidInt; 
    double paidPrinc;
    double princ;
    double balance;
    double mIR;
    double aIR;
    int month;
    int months;
    mnthlyPymntCalc mnthlyPymnt;
        
    
    public Amortization(double princ, double aIR, int months) {
        this.princ = princ;
        this.months = months;
        this.aIR = aIR;
    
        mIR = aIR / 12;
        mnthlyPymnt = new mnthlyPymntCalc(princ, mIR, months);
        
//        System.out.format("Monthly Payment: " + mnthlyPymnt.getMMP());
        mmptoString();
        
//        System.out.format("\nTotal Payment: " + mnthlyPymnt.getMMP() * months);
        totalPymntstoString();

        Header();
        
        
//        for (month = 1; month <= months; month++) {
//            paidInt  = princ*(mIR/100);
//            paidPrinc = mnthlyPymnt.getMMP() - paidInt;
//            balance  = princ - paidPrinc;
//
//            Schedule(month, paidInt, paidPrinc, balance);
//            princ = balance;
//        }
        monthlyIterate();
        
        
    }
    
    public void monthlyIterate(){
        for (month = 1; month <= months; month++) {
            paidInt  = princ*(mIR/100);
            paidPrinc = mnthlyPymnt.getMMP() - paidInt;
            balance  = princ - paidPrinc;

            Schedule(month, paidInt, paidPrinc, balance);
            princ = balance;
        }
        
    }

    private void Schedule(int month, double intpaid, double princpaid, double balance) {
        System.out.format("%8d%10.2f%10.2f%12.2f\n", month, intpaid, princpaid, balance);
    }

    private void Header() {
        System.out.println();
        for(int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.format("\n%8s%10s%10s%12s\n", "Payment|", "Interest|", "Principal|", "Balance");
        System.out.format("%8s%10s%10s%12s\n\n", "", "paid", "paid", "");
    }
    
    public PrintStream mmptoString(){   
        return System.out.format("Monthly Payment: " + mnthlyPymnt.getMMP());       
    }
    
    public PrintStream totalPymntstoString(){
        return System.out.format("\nTotal Payment: " + mnthlyPymnt.getMMP() * months);
    }
}
