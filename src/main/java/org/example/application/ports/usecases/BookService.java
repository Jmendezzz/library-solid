package org.example.application.ports.usecases;

import org.example.domain.enums.BookCategory;
import org.example.domain.models.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
  void create(Book book);
  Optional<Book> getBookByTitle(String title);
  List<Book> getAllBooks();
  List<Book> getBooksByCategory(BookCategory category);
}
