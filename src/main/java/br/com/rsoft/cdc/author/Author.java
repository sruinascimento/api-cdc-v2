package br.com.rsoft.cdc.author;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String email;
    @Column(name = "personal_description", columnDefinition = "TEXT")
    private String personalDescription;
    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Deprecated
    public Author() {
    }

    public Author(String name, String email, String personalDescription) {
        this.name = name;
        this.email = email;
        this.personalDescription = personalDescription;
    }

    public String getCreatedAtBrazilianFormatted() {
        return createdAt.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", personalDescription='" + personalDescription + '\'' +
                ", createdAt=" + getCreatedAtBrazilianFormatted() +
                '}';
    }
}
