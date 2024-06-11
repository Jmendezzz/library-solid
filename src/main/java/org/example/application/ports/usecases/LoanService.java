  package org.example.application.ports.usecases;

  import org.example.domain.models.Loan;
  import org.example.infrastructure.exceptions.LoanException;

  public interface LoanService {
    void createLoan(Loan loan) throws LoanException;
    void returnLoan(Loan loan);
  }
