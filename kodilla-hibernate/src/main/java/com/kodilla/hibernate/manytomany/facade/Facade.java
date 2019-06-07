package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Employee> findEmployeeByPartOfFirstnameOrLastname(String string) throws SearchingExceptions{
            List<Employee> employees = employeeDao.findEmployeeByPartOfFirstnameOrLastname(string);
            if (employees.isEmpty()) {
                throw new SearchingExceptions(SearchingExceptions.EMPLOYEE_NOT_FOUND);
            }
            return employees;
    }

    public List<Company> findCompanyNameByPartOfName(String string) throws SearchingExceptions{
        List<Company> companies = companyDao.findCompanyNameByPartOfName(string);
        if (companies.isEmpty()) {
            throw new SearchingExceptions(SearchingExceptions.COMPANY_NOT_FOUND);
        }
        return companies;
    }
}
