package org.example.application.adapters.usecases;

import org.example.application.ports.constraints.LoanConstraint;
import org.example.application.ports.usecases.BookStatusService;
import org.example.application.ports.usecases.LoanService;
import org.example.domain.enums.BookStatus;
import org.example.domain.models.Book;
import org.example.domain.models.Loan;
import org.example.infrastructure.exceptions.LoanException;

import java.util.ArrayList;
import java.util.List;

public class LoanServiceAdapter implements LoanService {
  private List<Loan> loans;
  private LoanConstraint loanConstraint;

  private BookStatusService bookStatusService;

  public LoanServiceAdapter(LoanConstraint loanConstraint, BookStatusService bookStatusService) {
    this.loans = new ArrayList<>();
    this.bookStatusService = bookStatusService;
    this.loanConstraint = loanConstraint;
  }
  @Override
  public void createLoan(Loan loan) throws LoanException {
    Book book = loan.getBook();
    loanConstraint.validateBookAvailability(book);
    bookStatusService.updateBookStatus(book, BookStatus.LOANED);
    loans.add(loan);
  }

  @Override
  public void returnLoan(Loan loan) {
    Book book = loan.getBook();
    bookStatusService.updateBookStatus(book, BookStatus.AVAILABLE);
    loans.remove(loan);
  }
}
