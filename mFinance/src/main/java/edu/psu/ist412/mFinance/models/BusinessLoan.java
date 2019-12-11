package edu.psu.ist412.mFinance.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class BusinessLoan implements Loan, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double loanAmount;
    @OneToOne
    private LoanStatus status;
    @OneToOne
    private ApplicationUser applicantAccount;

    public BusinessLoan() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setStatus(LoanStatus loanStatus) {
        this.status = loanStatus;
    }

    public ApplicationUser getApplicantAccount() {
        return applicantAccount;
    }

    public void setApplicantAccount(ApplicationUser applicantAccount) {
        this.applicantAccount = applicantAccount;
    }

    @Override
    public void setDetails(String first, String last, Double am) {
        return;
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

    @Override
    public String getDetails() {
        return "Details for business loans are not available at this time.";
    }
}
