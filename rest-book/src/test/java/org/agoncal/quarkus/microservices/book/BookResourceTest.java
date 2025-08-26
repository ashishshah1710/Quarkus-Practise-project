package org.agoncal.quarkus.microservices.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class BookResourceTest {
    @Test
    void shouldCreateABook() {
        given()
            .formParam("title", "The Catcher in the Rye")
            .formParam("author", "J.D. Salinger")
            .formParam("year",2020)
            .formParam("genre", "Fiction")
          .when().post("/api/books")
          .then()
             .statusCode(201)
            .body("title", is("The Catcher in the Rye"))
            .body("author", is("J.D. Salinger"))
            .body("year_of_publication", is(2020))
            .body("genre", is("Fiction"));
    }

}