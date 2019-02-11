package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String movieStoreString = movieStore.getMovies().entrySet().stream()
                .map(m -> m.getKey() + " - " + String.join(", ", m.getValue()))
                .collect(Collectors.joining("! "));

        System.out.println(movieStoreString);
    }
}
