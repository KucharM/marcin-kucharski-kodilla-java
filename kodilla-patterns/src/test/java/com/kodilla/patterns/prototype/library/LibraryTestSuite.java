package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("My Library");
        Book book1 = new Book("title1", "author1", LocalDate.of(1990, 12, 22));
        Book book2 = new Book("title2", "author2", LocalDate.of(2002, 4, 3));
        Book book3 = new Book("title3", "author3", LocalDate.of(1978, 9, 14));
        Book book4 = new Book("title4", "author4", LocalDate.of(2012, 11, 11));
        Book book5 = new Book("title5", "author5", LocalDate.of(1988, 7, 8));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //library shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("clonedLib");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //library deep copy
        Library deepClonedLib = null;
        try {
            deepClonedLib = library.deepCopy();
            deepClonedLib.setName("deep cloned Lib");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLib);
        //When
        int librarySize = library.getBooks().size();
        int clonedLibrarySize = clonedLibrary.getBooks().size();
        int deepClonedLibSize = deepClonedLib.getBooks().size();
        //Then
        Assert.assertEquals(5, librarySize);
        Assert.assertEquals(5, clonedLibrarySize);
        Assert.assertEquals(5, deepClonedLibSize);
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLib.getBooks(), library.getBooks());
    }
}
