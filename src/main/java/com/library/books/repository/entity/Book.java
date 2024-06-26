package com.library.books.repository.entity;

// JPQL = Jakarta Persistence Query Language

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity // jakarta
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor // lombok
public class Book {

  @Id // jakarta
  @GeneratedValue(strategy = GenerationType.IDENTITY) // jakarta - use a db id column
  private Long id;

  // @Column required if the member != the db column name i.e. book_title != bookTitle
  @Column(name = "book_title") // jakarta
  private String bookTitle;
  private String authors;
  private String publisher;
  private String isbn;

  @Column(name = "year_published")
  private int yearPublished;
  private int price;

}
