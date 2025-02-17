/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.dao;

import edu.psu.ist412.mFinance.models.LoanStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author garre
 */
@Repository
public interface LoanStatusRepository extends CrudRepository<LoanStatus, Integer>{
    public LoanStatus findByStatusName(String statusName);
}
