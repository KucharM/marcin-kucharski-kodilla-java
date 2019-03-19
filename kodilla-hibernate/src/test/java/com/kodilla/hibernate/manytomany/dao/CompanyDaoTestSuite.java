package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softMachId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMattId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softMachId);
        Assert.assertNotEquals(0, dataMaestId);
        Assert.assertNotEquals(0, greyMattId);

        //Clean Up
//        try {
//            companyDao.deleteById(softMachId);
//            companyDao.deleteById(dataMaestId);
//            companyDao.deleteById(greyMattId);
//        } catch (Exception e) {
//            //nothing
//        }
    }

    @Test
    public void testFindEmployeeByLastname() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        //When
        List<Employee> employees = employeeDao.findEmployeeByLastname("Smith");
        int employeeSize = employees.size();

        //Then
        Assert.assertEquals(1, employeeSize);

        //CleanUp
        employeeDao.deleteAll();
    }

    @Test
    public void testFindCompanyNameStartsWith() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Company> companyList = companyDao.findCompanyNameBeginWith("Dat");
        int listSize = companyList.size();

        //Then
        Assert.assertEquals(1, listSize);

        //CleanUp
        companyDao.deleteAll();
    }
}
