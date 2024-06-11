package org.example.application.adapters.constraints;

import org.example.application.ports.constraints.LoanConstraint;
import org.example.domain.enums.BookStatus;
import org.example.domain.models.Book;
import org.example.infrastructure.exceptions.LoanException;

public class LoanConstraintAdapter implements LoanConstraint {
  @Override
  public void validateBookAvailability(Book book) throws LoanException {
    if(book.getStatus() == BookStatus.LOANED){
      throw new LoanException("Book is already loaned");
    }
    if(book.getStatus() == BookStatus.LOST){
      throw new LoanException("Book is lost");
    }
  }
}
