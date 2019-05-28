package com.kodilla.patterns2.facade.api;

public class OrderProcessingException extends Exception {
    public static String ERR_NOT_AUTHORIZED = "User not authorized";
    public static String ERR_PAYMENT_REJECTED = "Payment rejected";
    public static String ERR_VERIFICATION_ERROR = "Verification error";
    public static String ERR_SUMBITING_ERROR= "Cannot submit order";

    public OrderProcessingException(String message) {
        super(message);
    }
}
