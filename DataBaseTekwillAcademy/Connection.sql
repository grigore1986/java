CREATE TABLE person (
id INT AUTO_INCREMENT,
nume  VARCHAR(45) NOT NULL,
nume_familie VARCHAR(45) NOT NULL,
age INT,
birth DATE,
PRIMARY KEY (id)
);
INSERT INTO person(nume,nume_familie,age,birth)
VALUES('Tatiana', 'Borta', 39, '1984-05-08');
INSERT INTO person(nume,nume_familie,age,birth)
VALUES('Grigore', 'Borta', 37, '1986-08-16');
INSERT INTO person(nume,nume_familie,age,birth)
VALUES('Timofei', 'Borta', 9, '2013-12-07');


CREATE TABLE automobil(
id INT NOT NULL AUTO_INCREMENT,
marca VARCHAR(45) NOT NULL,
model VARCHAR(45) NOT NULL,
anul INT CHECK (anul > 1990),
PRIMARY KEY (id)
);
INSERT INTO automobil(marca, model, anul)
VALUES ('Toyota', 'Prius', 2009);
INSERT INTO automobil(marca, model, anul)
VALUES ('Lexus', 'IS220', 2010);
INSERT INTO automobil(marca, model, anul)
VALUES ('Mitsubishi', 'Eclips Cross', 2018);

CREATE TABLE km_automobil(
id INT,
km_fals INT CHECK(km_fals >999999),
km_true INT CHECK(km_true > 999999),
PRIMARY KEY(id)
);
INSERT INTO km_automobil(id, km_fals, km_true)
VALUES(1, 148630, 248630);
INSERT INTO km_automobil(id, km_fals, km_true)
VALUES(2, 127222, 340000);
INSERT INTO km_automobil(id, km_fals, km_true)
VALUES(3, 65000, 201000);

-- DROP TABLE km_automobil;
-- Adaugam o columna cu numele vin in tabela automobil 
ALTER TABLE automobil ADD vin VARCHAR (20);
-- Stergem o columna cu numele vin din tabela automobil
ALTER TABLE automobil DROP COLUMN vin;
-- Schimbam ca columna cu numele birth nu poate sa fie null
ALTER TABLE person CHANGE birth birth DATE NOT NULL;
-- Schimbarea numelui lui Grigore in tabelul person
UPDATE person SET name = 'Vasile' WHERE id = 2;
-- varianta 2 
UPDATE person SET name = 'Vasile' WHERE name = 'Grigore';
-- Stergem toate datele din tabela km_automobil
-- TRUNCATE km_automobil ;

-- Afisarea datelor din tabelele de care avem nevoie
SELECT p.id, p.nume, p.nume_familie, a.marca, a.model, a.anul, k.km_fals
FROM person p JOIN automobil a ON p.id = a.id
JOIN km_automibil k ON p.id = k.id