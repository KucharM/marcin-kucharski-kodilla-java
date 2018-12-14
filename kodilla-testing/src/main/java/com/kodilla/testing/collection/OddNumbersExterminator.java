package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbersList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) % 2 == 0) {
                int even = numbers.get(i);
                evenNumbersList.add(even);
            }
        }

        return evenNumbersList;
    }
}
