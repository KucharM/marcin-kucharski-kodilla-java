package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookBorrowingTestSuite {
    @Test
    public void testCase0BooksListBooksInHandsOf() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("Kamil", "Stoch", "87052522333");

        List<Book> listOfBorrowedBooks = new ArrayList<>();

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(listOfBorrowedBooks);

        //When
        List<Book> bookList = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(0, bookList.size());
    }

    @Test
    public void testCase1BookListBooksInHandsOf() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("Kamil", "Stoch", "87052522333");

        List<Book> listOfBorrowedBooks = new ArrayList<>();
        Book book = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        listOfBorrowedBooks.add(book);

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(listOfBorrowedBooks);

        //When
        List<Book> bookList = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(1, bookList.size());
    }

    @Test
    public void testCase5BooksListBooksInHandsOf() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("Kamil", "Stoch", "87052522333");

        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        Book book5 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        resultListOfBooks.add(book5);

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultListOfBooks);

        //When
        List<Book> bookList = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(5, bookList.size());
    }
}
