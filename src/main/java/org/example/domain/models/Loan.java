package org.example.domain.models;

import java.time.LocalDateTime;

public class Loan {
  private Book book;
  private User user;
  private LocalDateTime loanDate;
  private LocalDateTime returnDate;

    public Loan(Book book, User user, LocalDateTime loanDate, LocalDateTime returnDate) {
      this.book = book;
      this.user = user;
      this.loanDate = loanDate;
      this.returnDate = returnDate;
    }

    public Book getBook() {
      return book;
    }

    public void setBook(Book book) {
      this.book = book;
    }

    public User getUser() {
      return user;
    }

    public void setUser(User user) {
      this.user = user;
    }

    public LocalDateTime getLoanDate() {
      return loanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
      this.loanDate = loanDate;
    }

    public LocalDateTime getReturnDate() {
      return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
      this.returnDate = returnDate;
    }
}
