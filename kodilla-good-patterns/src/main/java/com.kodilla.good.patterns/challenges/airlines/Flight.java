package com.kodilla.good.patterns.challenges.airlines;

public class Flight {
    private Airport departureAirport;
    private Airport arrivalAirport;


    public Flight(Airport departureAirport, Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return departureAirport + " -> " + arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return departureAirport.equals(flight.departureAirport) &&
                arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return departureAirport.hashCode() + arrivalAirport.hashCode();
    }
}
