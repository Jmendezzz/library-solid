package org.example.application.ports.usecases;

import org.example.domain.enums.BookStatus;
import org.example.domain.models.Book;

public interface BookStatusService {
  void updateBookStatus(Book book, BookStatus status);
}
