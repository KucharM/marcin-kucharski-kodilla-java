package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Book book1 = new Book("author1", "title1", 1970, "sig1");
        Book book2 = new Book("author2", "title2", 1980, "sig2");
        Book book3 = new Book("author3", "title3", 1960, "sig3");
        Book book4 = new Book("author4", "title4", 2000, "sig4");
        Book book5 = new Book("author5", "title5", 2010, "sig5");
        Book book6 = new Book("author6", "title6", 2005, "sig6");
        Book book7 = new Book("author7", "title7", 1985, "sig7");

        Set<Book> set = new HashSet<>();
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);
        set.add(book5);
        set.add(book6);
        set.add(book7);

        //When
        int median = medianAdapter.publicationYearMedian(set);
        System.out.println(median);

        //Then
        Assert.assertEquals(1985, median);
    }
}
