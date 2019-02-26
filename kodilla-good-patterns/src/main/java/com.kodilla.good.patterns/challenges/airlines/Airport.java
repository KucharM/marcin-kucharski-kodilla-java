package com.kodilla.good.patterns.challenges.airlines;


public class Airport {
    private String airportName;

    public Airport(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportName() {
        return airportName;
    }

    @Override
    public String toString() {
        return airportName;
    }

    @Override
    public boolean equals(Object o) {
        Airport airport = (Airport) o;
        return this.airportName.equals(airport.getAirportName());
    }

    @Override
    public int hashCode() {
        return airportName.hashCode();
    }
}
