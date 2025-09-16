package com.bookapp.model;

import java.time.LocalDate;

public class Book {
	private String title;
	private Integer bookId;
	private double price;
	private String author;
	private String category;
	private LocalDate datePublished;
	
	public Book(String title, Integer bookId, double price, String author, String category, LocalDate datePublished) {
		super();
		this.title = title;
		this.bookId = bookId;
		this.price = price;
		this.author = author;
		this.category = category;
		this.datePublished = datePublished;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public Integer getBookId() {
		return bookId;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public LocalDate getDatePublished() {
		return datePublished;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", bookId=" + bookId + ", price=" + price + ", author=" + author + ", category="
				+ category + ", datePublished=" + datePublished + "]";
	}

}
