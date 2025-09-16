package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		return BookDetails.getBooks();
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = BookDetails.getBooks().stream()
                .filter(b -> b.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());
        if (books.isEmpty()) throw new BookNotFoundException("No books found with author: " + author);
        return books;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = BookDetails.getBooks().stream()
                .filter(b -> b.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
        if (books.isEmpty()) throw new BookNotFoundException("No books found in category: " + category);
        return books;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = BookDetails.getBooks().stream()
                .filter(b -> b.getPrice() < price)
                .collect(Collectors.toList());
        if (books.isEmpty()) throw new BookNotFoundException("No books found with price less than " + price);
        return books;
	}

	@Override
	public List<Book> getByDatePublished(int year) throws BookNotFoundException {
		List<Book> books = BookDetails.getBooks().stream()
                .filter(b -> b.getDatePublished().getYear() == year)
                .collect(Collectors.toList());
        if (books.isEmpty()) throw new BookNotFoundException("No books found published in year: " + year);
        return books;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = BookDetails.getBooks().stream()
                .filter(b -> b.getAuthor().toLowerCase().contains(author.toLowerCase())
                        && b.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
        if (books.isEmpty()) throw new BookNotFoundException("No books found with author: " + author + " and category: " + category);
        return books;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		return BookDetails.getBooks().stream()
                .filter(b -> b.getBookId().equals(bookId))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book with ID " + bookId + " not found"));
    }

}
