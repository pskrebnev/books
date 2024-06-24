package com.library.books.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BookISBNMismatchException {

  public BookISBNMismatchException(String message) {
    super(message);
  }
}
