package org.example.application.adapters.usecases;

import org.example.application.ports.usecases.BookStatusService;
import org.example.domain.enums.BookStatus;
import org.example.domain.models.Book;

public class BookStatusServiceAdapter implements BookStatusService {
  @Override
  public void updateBookStatus(Book book, BookStatus status) {
    book.setStatus(status);
    System.out.println("Book status updated to " + status);
  }
}
