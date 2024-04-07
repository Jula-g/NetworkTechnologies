package edu.ib.networktechnologies.controllers.dto.books;

public class GetBookDetailsDto {

    private String isbn;

    private String title;

    private String author;

    private String publisher;

    private int yearPublished;

    private int availableCopies;

    private BookDetailsDto bookDetails;

    public GetBookDetailsDto(String isbn, String title, String author, String publisher, int yearPublished, int availableCopies, BookDetailsDto bookDetails) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.availableCopies = availableCopies;
        this.bookDetails = bookDetails;
    }

    public GetBookDetailsDto() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public BookDetailsDto getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(BookDetailsDto bookDetails) {
        this.bookDetails = bookDetails;
    }
}

