package com.kodilla.good.patterns.challenges.airlines;

import java.util.Set;

public class App {
    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        Set<Flight> flightSet = flightSearch.findFlightThrough("Katowice", "Gdansk");

        System.out.println(flightSet);
    }
}
