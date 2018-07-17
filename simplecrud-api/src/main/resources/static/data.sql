CREATE TABLE category (
    id serial PRIMARY KEY,
    name varchar(255)
);

CREATE TABLE product (
    id serial PRIMARY KEY,
    name varchar (255),
    description varchar (255),
    id_category integer REFERENCES category(id)
);
