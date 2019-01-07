package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchLogic {

    public static void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Okecie", true);
        flightMap.put("Pyrzowice", false);
        flightMap.put("Gdansk", true);
        flightMap.put("Balice", false);
        flightMap.put("Radom", true);
        flightMap.put("Wroclaw", true);

        if (flightMap.get(flight.getArrivalAirport()))
            System.out.println("Route found");
        else
            throw new RouteNotFoundException("I'm sorry this route was not found, look for another one");
    }
}
