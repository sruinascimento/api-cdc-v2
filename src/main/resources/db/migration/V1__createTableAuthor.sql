CREATE TABLE authors
(
    id                   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name                 VARCHAR(255)        NOT NULL,
    email                VARCHAR(255) UNIQUE NOT NULL,
    personal_description VARCHAR(400)        NOT NULL,
    created_at           TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP
);