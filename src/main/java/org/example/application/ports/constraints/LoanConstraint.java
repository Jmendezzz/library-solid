package org.example.application.ports.constraints;

import org.example.domain.models.Book;
import org.example.infrastructure.exceptions.LoanException;

public interface LoanConstraint {
  void validateBookAvailability(Book book) throws LoanException;
}
