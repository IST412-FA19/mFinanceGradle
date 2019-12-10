
package edu.psu.ist412.mFinance.models;

/**
 *
 * @author swhealon
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 import javax.persistence.OneToOne;

@Entity
public class BusinessLoan implements Loan, Serializable{
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
    private String company;
    private String loanUse;
    private String years;
    private Double loanAmount;
    @OneToOne
    private LoanStatus status;

//    public CarLoan(String first, String last, String dob, String add, String add2, String city, 
//            String st, String z, String employer, String occupation, String inputEmpState, 
//            String salary, String years, String m, String mo, String y, String mile, String vin){
//
//        setCarMake(m);
//        setCarModel(mo);
//        setCarYear(y);
//    }
    
    public BusinessLoan(){
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

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }
    
    @Override
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
    }   

    public void setStatus(LoanStatus status) {
        this.status = status;
    }
    
    @Override
    public String getLoanType(){
        return "Auto";
    }

    @Override
    public LoanStatus getLoanStatus() {
        return this.status;
    }

    @Override
    public String getDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
