package com.bookapp.util;

import com.bookapp.model.Book;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class BookDetails {
    public static List<Book> getBooks() {
        return Arrays.asList(
            new Book("Java in Action", 1, 450.0, "David", "Tech", LocalDate.of(2020, 1, 15)),
            new Book("Spring Boot", 2, 550.0, "John", "Tech", LocalDate.of(2019, 5, 20)),
            new Book("Python Basics", 3, 300.0, "Alice", "Programming", LocalDate.of(2021, 8, 10)),
            new Book("Cloud Essentials", 4, 600.0, "Bob", "Cloud", LocalDate.of(2018, 3, 12)),
            new Book("Machine Learning", 5, 800.0, "Alice", "AI", LocalDate.of(2022, 6, 25)),
            new Book("Clean Code", 6, 400.0, "Robert", "Programming", LocalDate.of(2015, 11, 5))
        );
    }
}

