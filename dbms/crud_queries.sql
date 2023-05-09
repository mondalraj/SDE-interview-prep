CREATE DATABASE record_company;

USE record_company;

CREATE TABLE bands (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE albums(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    band_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (band_id) REFERENCES bands(id)
);

ALTER TABLE albums ADD release_year INT;

INSERT INTO bands (name) VALUES ('The Beatles');

INSERT INTO bands (name) VALUES ('The Rolling Stones'), ('The Who'), ('The Kinks'), ('The Animals');

SELECT * FROM bands;

SELECT * FROM bands LIMIT 2;

SELECt name FROM bands;

SELECT id AS 'Band ID', name AS 'Band Name' FROM bands;

SELECT * FROM bands ORDER BY name;

SELECT * FROM bands ORDER BY name DESC;

INSERT INTO albums (name, release_year, band_id) VALUES 
    ('Please Please Me', 1963, 1), 
    ('With The Beatles', 1963, 1), 
    ('A Hard Day''s Night', 1964, 2), 
    ('Beatles For Sale', 1964, 2), 
    ('Revolver', 1965, 3), 
    ('Rubber Soul', 1965, 3), 
    ('Revolver', 1966, 3), 
    ('Sgt. Pepper''s Lonely Hearts Club Band', 1967, 4), 
    ('Magical Mystery Tour', 1967, 5), 
    ('Rubber Soul', NULL, 5);

SELECT * FROM albums;

-- Printing unique names of albums
SELECT DISTINCT name FROM albums;

UPDATE albums SET release_year = 1965 WHERE name = 'With The Beatles';

SELECT * FROM albums WHERE release_year < 1966;

SELECT * FROM albums WHERE release_year < 1966 AND band_id = 1;

SELECT * FROM albums WHERE name LIKE '%er%' OR band_id = 1;

SELECT * FROM albums WHERE release_year BETWEEN 1965 AND 1967;

SELECT * FROM albums WHERE release_year IS NULL;

DELETE FROM albums WHERE release_year IS NULL;

DROP TABLE albums;

DROP DATABASE record_company;