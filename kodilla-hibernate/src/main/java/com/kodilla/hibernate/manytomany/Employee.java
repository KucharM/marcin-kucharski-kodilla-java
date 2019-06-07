package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "Employee.findEmployeeByLastname",
        query = "FROM Employee WHERE lastname = :LASTNAME"
)

@NamedNativeQuery(
        name = "Employee.findEmployeeByPartOfFirstnameOrLastname",
        query = "SELECT * FROM Employees WHERE FIRST_NAME OR LAST_NAME LIKE CONCAT('%', :PARAM, '%')",
        resultClass = Employee.class
)

@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public Employee() {

    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "EMPLOYEE_ID", unique = true)
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @Column(name = "FIRST_NAME")
    @NotNull
    public String getFirstname() {
        return firstname;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "LAST_NAME")
    @NotNull
    public String getLastname() {
        return lastname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "JOIN_COMPANY_EMPLOYEES",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")})
    public List<Company> getCompanies() {
        return companies;
    }

    private void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
