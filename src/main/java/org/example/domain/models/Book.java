package org.example.domain.models;

import org.example.domain.enums.BookCategory;
import org.example.domain.enums.BookStatus;

public class Book {
  private String title;
  private String author;
  private BookCategory category;
  private BookStatus status;
  private String isbn;


  public Book(String title, String author, String isbn, BookCategory category, BookStatus status) {
    this.title = title;
    this.author = author;
    this.category = category;
    this.isbn = isbn;
    this.status = status;
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

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public BookCategory getCategory() {
    return category;
  }

  public void setCategory(BookCategory category) {
    this.category = category;
  }

  public BookStatus getStatus() {
    return status;
  }

  public void setStatus(BookStatus status) {
    this.status = status;
  }
}
