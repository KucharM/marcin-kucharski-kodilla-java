package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private Facade facade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindCompany() throws SearchingExceptions{
        //Given
        Company company1 = new Company("Microsoft");
        Company company2 = new Company("Google");
        Company company3 = new Company("Apple");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List<Company> companyList = facade.findCompanyNameByPartOfName("cros");
        int size = companyList.size();
        Company testCompany = companyList.get(0);
        String testCompanyName = testCompany.getName();

        //Then
        Assert.assertEquals(1, size);
        Assert.assertEquals("Microsoft", testCompanyName);

        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    public void testFindEmployee() throws SearchingExceptions{
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        //When
        List<Employee> employeeList = facade.findEmployeeByPartOfFirstnameOrLastname("son");
        int size = employeeList.size();
        Employee testEmployee = employeeList.get(0);
        String testEmployeeLastname = testEmployee.getLastname();

        //Then
        Assert.assertEquals(1, size);
        Assert.assertEquals("Clarckson", testEmployeeLastname);
    }
}
