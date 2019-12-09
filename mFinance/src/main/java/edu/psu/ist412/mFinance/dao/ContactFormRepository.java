/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.dao;

import edu.psu.ist412.mFinance.models.ContactMessage;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author garre
 */
public interface ContactFormRepository extends CrudRepository<ContactMessage, Integer> {
    
}
