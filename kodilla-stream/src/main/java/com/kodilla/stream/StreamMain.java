package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("example text", s -> s.toUpperCase());
//        poemBeautifier.beautify("example text", s -> ">>>" + s + "<<<");
//        poemBeautifier.beautify("example text", s -> s.concat("lalala"));
//        poemBeautifier.beautify("example text", s -> "\u2794" + s);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
