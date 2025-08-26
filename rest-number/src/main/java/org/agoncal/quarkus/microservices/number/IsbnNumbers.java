package org.agoncal.quarkus.microservices.number;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import java.time.Instant;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(description = "Several ISBN numbers for Books")
public class IsbnNumbers {

    @JsonbProperty("isbn_13")
    @Schema(required = true)
    public String isbn13;
    @JsonbProperty("isbn_10")
    @Schema(required = true)
    public String isbn10;
    @JsonbTransient //not showing in response
    public Instant generationDate;

    @Override
    public String toString() {
        return "IsbnNumbers{" +
            "isbn13='" + isbn13 + '\'' +
            ", isbn10='" + isbn10 + '\'' +
            ", generationDate=" + generationDate +
            '}';
    }
}
