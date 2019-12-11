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
public class BusinessLoan implements Loan, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private ApplicationUser applicantAccount;
    @Column(nullable = false, unique = false)
    private String firstName;
    private String lastName;
    private String dob;
    private Double loanAmount;
    private String businessName;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String industry;
    private int loanLength;
    private String revenue;
    private String businessID;

    @OneToOne
    private LoanStatus status;

    public BusinessLoan() {
    }

    @Override
    public String getDetails() {
        return "Business Name" + this.businessName
                + " \nLoan Amount Requested: $" + this.loanAmount
                + " \nLength of Loan: " + this.loanLength + "years"
                + " \nIndustry: " + this.industry;
    }

    @Override
    public void setDetails(String first, String last, Double am) {
        this.firstName = first;
        this.lastName = last;
    }

    @Override
    public String getLoanType() {
        return "Business";
    }

    @Override
    public Double getLoanAmount() {
        return this.loanAmount;
    }

    @Override
    public LoanStatus getLoanStatus() {
        return this.status;
    }
    public void setLoanAmount(Double loan){
        this.loanAmount = loan;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ApplicationUser getApplicantAccount() {
        return applicantAccount;
    }

    public void setApplicantAccount(ApplicationUser applicantAccount) {
        this.applicantAccount = applicantAccount;
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

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getLoanLength() {
        return loanLength;
    }

    public void setLoanLength(int loanLength) {
        this.loanLength = loanLength;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getBusinessID() {
        return businessID;
    }

    public void setBusinessID(String businessID) {
        this.businessID = businessID;
    }

    public LoanStatus getStatus() {
        return status;
    }
}
