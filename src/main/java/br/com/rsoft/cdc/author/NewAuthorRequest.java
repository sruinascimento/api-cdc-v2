package br.com.rsoft.cdc.author;

import br.com.rsoft.cdc.validator.UniqueValue;
import jakarta.validation.constraints.*;

public record NewAuthorRequest(
        @NotBlank
        String name,
        @Email
        @NotNull
        @UniqueValue(domainClass = Author.class, fieldName = "email")
        String email,
        @NotBlank
        @Size(max = 400)
        String personalDescription
) {

        public Author toModel() {
                return new Author(name, email, personalDescription);
        }
}
