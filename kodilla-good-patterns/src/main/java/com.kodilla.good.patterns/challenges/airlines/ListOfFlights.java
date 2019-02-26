package com.kodilla.good.patterns.challenges.airlines;

import java.util.ArrayList;
import java.util.List;

public class ListOfFlights {
    private List<Flight> listOfFlights = new ArrayList<>();

    public List<Flight> getListOfFlights() {
        listOfFlights.add(new Flight(new Airport("Katowice"), new Airport("Krakow")));
        listOfFlights.add(new Flight(new Airport("Katowice"), new Airport("Warszawa")));
        listOfFlights.add(new Flight(new Airport("Wroclaw"), new Airport("Krakow")));
        listOfFlights.add(new Flight(new Airport("Krakow"), new Airport("Gdansk")));
        listOfFlights.add(new Flight(new Airport("Warszawa"), new Airport("Gdansk")));
        listOfFlights.add(new Flight(new Airport("Katowice"), new Airport("Wroclaw")));
        return listOfFlights;
    }
}
