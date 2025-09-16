package com.bookapp.main;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        IBookService bookService = new BookServiceImpl();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter author keyword: ");
        String author = sc.nextLine();

        try {
            List<Book> books = bookService.getByAuthorContains(author);
            printBooks(books);
        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void printBooks(List<Book> books) {
        books.forEach(System.out::println);
    }
}

