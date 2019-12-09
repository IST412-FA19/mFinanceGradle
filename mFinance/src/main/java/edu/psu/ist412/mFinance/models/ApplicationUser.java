/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.mFinance.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author Randi Semera
 */
@Entity
public class ApplicationUser implements Serializable {

    @Id
    @GeneratedValue(generator = "application-user-generator")
    @GenericGenerator(name = "application-user-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                @Parameter(name = "sequence_name", value = "user_sequence"),
                @Parameter(name = "initial_value", value = "2"),
                @Parameter(name = "increment_size", value = "1")
            })
    private Integer id;
    
    @Column(nullable = false, unique = true)
    private String username;
    private String password;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "SECURITY_PRINCIPAL_ASSIGNMENTS", 
            joinColumns = { @JoinColumn(referencedColumnName = "ID") },
            inverseJoinColumns = { @JoinColumn(referencedColumnName = "ID") })
    private Set<ApplicationUserSecurityPrincipal> securityPrincipals;
    
    @Column(nullable = false, unique = false)
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String userPass) {
        this.password = userPass;
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

    public Set<ApplicationUserSecurityPrincipal> getSecurityPrincipals() {
        return securityPrincipals;
    }

    public void setSecurityPrincipals(Set<ApplicationUserSecurityPrincipal> securityPrincipals) {
        this.securityPrincipals = securityPrincipals;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}