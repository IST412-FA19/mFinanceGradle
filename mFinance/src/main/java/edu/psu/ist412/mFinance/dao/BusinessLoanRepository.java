package edu.psu.ist412.mFinance.dao;

import edu.psu.ist412.mFinance.models.BusinessLoan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessLoanRepository extends CrudRepository<BusinessLoan, Integer> {
    List<BusinessLoan> findByApplicantAccountId(Integer id);
}
