CREATE TABLE category (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT NOT NULL,
    description TEXT
);

CREATE TABLE product (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT NOT NULL,
    description TEXT,
    price DOUBLE NOT NULL,
    categoryId INTEGER,
    FOREIGN KEY (categoryId) REFERENCES category(id)
);