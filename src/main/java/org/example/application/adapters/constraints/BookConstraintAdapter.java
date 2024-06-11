package org.example.application.adapters.constraints;

import org.example.application.ports.constraints.BookConstraint;
import org.example.domain.models.Book;
import org.example.infrastructure.exceptions.BookException;

import java.util.List;

public class BookConstraintAdapter implements BookConstraint {

  @Override
  public void validateNonIsbnRepeated(List<Book> books, String isbn) {
    if (books.stream().anyMatch(book -> book.getIsbn().equals(isbn))) {
      throw new BookException("ISBN already exists");
    }

  }
}
