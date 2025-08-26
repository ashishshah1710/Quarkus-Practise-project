package org.agoncal.quarkus.microservices.book;

import jakarta.json.bind.annotation.JsonbDateFormat;
import jakarta.json.bind.annotation.JsonbProperty;
import java.time.Instant;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
@Schema(description = "Book information")
public class Book {

  @JsonbProperty("title")
  @Schema(required = true, description = "Title of the book")
  public String title;

  @JsonbProperty("author")
  @Schema(required = true, description = "Author of the book")
  public String author;

  @JsonbProperty("isbn_13")
  @Schema(required = true, description = "ISBN 13 number")
  public String isbn13;

  @JsonbProperty("year_of_publication")
  @Schema(description = "Year the book was published")
  public Integer publicationYear;

  @JsonbProperty("genre")
  @Schema(description = "Genre of the book")
  public String genre;

  @JsonbProperty("creation_date")
  @JsonbDateFormat("yyyy/MM/dd")
  @Schema(description = "Date when the book record was created")
  public Instant creationDate;

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", isbn13='" + isbn13 + '\'' +
        ", publicationYear=" + publicationYear +
        ", genre='" + genre + '\'' +
        ", creationDate=" + creationDate +
        '}';
  }
}
