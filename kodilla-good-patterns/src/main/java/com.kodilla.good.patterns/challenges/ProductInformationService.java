package com.kodilla.good.patterns.challenges;

public class ProductInformationService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Information service for: " + user.getUserName());
    }
}
