package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUsername();
//
//        if (result.equals("theForumUser")) {
//            System.out.println("test OK");
//        } else {
//            System.out.println("Error");
//        }

        Calculator calculator = new Calculator();

        int addingResult = calculator.add(456, 987);
        int subtractingResult = calculator.subtract(3456, 1234);

        // testing add method
        if (addingResult == 1443)
            System.out.println("add method test passed");
        else
            System.out.println("add method test failed");

        // testing subtract method
        if (subtractingResult == 2222)
            System.out.println("subtract method test passed");
        else
            System.out.println("subtract method test failed");
    }
}
