package org.example.application.adapters.usecases;

import org.example.application.ports.constraints.BookConstraint;
import org.example.application.ports.usecases.BookService;
import org.example.domain.enums.BookCategory;
import org.example.domain.models.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookServiceAdapter implements BookService {
  private List<Book> books;
  private BookConstraint bookConstraint;
  public BookServiceAdapter(BookConstraint bookConstraint) {
    this.books = new ArrayList<>();
    this.bookConstraint = bookConstraint;
  }
  @Override
  public void create(Book book) {
    bookConstraint.validateNonIsbnRepeated(books, book.getIsbn());
    books.add(book);
  }

  @Override
  public Optional<Book> getBookByTitle(String title) {
    return books.stream()
            .filter(book -> book.getTitle().equals(title))
            .findFirst();
  }

  @Override
  public List<Book> getAllBooks() {
    return books;
  }

  @Override
  public List<Book> getBooksByCategory(BookCategory category) {
    return books.stream()
            .filter(book -> book.getCategory().equals(category))
            .toList();
  }
}
