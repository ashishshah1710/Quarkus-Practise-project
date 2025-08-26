package org.agoncal.quarkus.microservices.book;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.time.Instant;

@Path("/api/books")
public class BookResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createABook(@FormParam("title") String title,
        @FormParam("author") String author,
        @FormParam("year") int yearOfPublication,
        @FormParam("genre") String genre) {
        Book book = new Book();
        book.title=title;
        book.author=author;
        book.isbn13="We will get";
        book.genre=genre;
        book.publicationYear=yearOfPublication;
        book.creationDate= Instant.now();
        return Response.status(201).entity(book).build();
    }
}
