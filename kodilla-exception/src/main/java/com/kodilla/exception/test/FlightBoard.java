package com.kodilla.exception.test;

public class FlightBoard {
    public static void main(String[] args) {

        Flight toWarsaw = new Flight("Pyrzowice", "Okecie");
        Flight toKatowice = new Flight("Modlin", "Pyrzowice");
        Flight toKrakow = new Flight("Gdansk", "Balice");

        try {
            FlightSearchLogic.findFlight(toKatowice);
        }catch (RouteNotFoundException e) {
            System.out.println("Route not found " + e);
        }
    }
}
