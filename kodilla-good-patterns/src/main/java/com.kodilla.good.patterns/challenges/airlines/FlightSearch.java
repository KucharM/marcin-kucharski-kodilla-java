package com.kodilla.good.patterns.challenges.airlines;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {
    public Set<Flight> findFlightFrom(String departure) {
        Set<Flight> flightList = new ListOfFlights().getListOfFlights().stream()
                .filter(flight -> flight.getDepartureAirport().getAirportName().equals(departure))
                .collect(Collectors.toSet());
        return flightList;
    }

    public Set<Flight> fingFlightTo(String arrival) {
        Set<Flight> flightList = new ListOfFlights().getListOfFlights().stream()
                .filter(flight -> flight.getArrivalAirport().getAirportName().equals(arrival))
                .collect(Collectors.toSet());
        return flightList;
    }

    public Set<Flight> findFlightThrough(String departure, String arrival) {
        Set<Flight> flightSet = new LinkedHashSet<>();
        Set<Flight> flightsFrom = findFlightFrom(departure);
        Set<Flight> flightsTo = fingFlightTo(arrival);

        for (Flight flight: flightsFrom) {
            for (Flight flight1: flightsTo) {
                if (flight.getArrivalAirport().equals(flight1.getDepartureAirport())) {
                    flightSet.add(flight);
                    flightSet.add(flight1);
                }
            }
        }
        return flightSet;
    }
}
