package com.kodilla.hibernate.manytomany.facade;

public class SearchingExceptions extends Exception {
    public static String COMPANY_NOT_FOUND = "Company with this name not found";
    public static String EMPLOYEE_NOT_FOUND = "Employee with this firstname or lastname not found";

    public SearchingExceptions(String message) {
        super(message);
    }
}
