package org.example.application.ports.constraints;

import org.example.domain.models.Book;

import java.util.List;

public interface BookConstraint {
  void validateNonIsbnRepeated(List<Book> books, String isbn);
}
