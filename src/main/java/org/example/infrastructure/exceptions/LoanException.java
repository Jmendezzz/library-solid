package org.example.infrastructure.exceptions;

public class LoanException extends RuntimeException {
    public LoanException(String message) {
        super(message);
    }
}
