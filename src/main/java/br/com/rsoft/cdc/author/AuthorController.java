package br.com.rsoft.cdc.author;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    @PersistenceContext
    private final EntityManager entityManager;

    public AuthorController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @PostMapping("/authors")
    @Transactional
    public ResponseEntity<String> addAuthor(@RequestBody @Valid NewAuthorRequest newAuthorRequest) {
        Author author = newAuthorRequest.toModel();
        entityManager.persist(author);

        return ResponseEntity.ok(author.toString());
    }
}
