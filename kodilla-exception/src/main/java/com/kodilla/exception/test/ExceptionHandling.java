package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2.2, 3.3);
        } catch (Exception e) {
            System.out.println("exception was being served " + e);
        } finally {
            System.out.println("code from the finally block");
        }
    }


}
