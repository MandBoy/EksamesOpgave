DROP DATABASE IF EXISTS BorrowDatabase;
CREATE DATABASE BorrowDatabase;
Use BorrowDatabase;

CREATE TABLE bruger(
id INT NOT NULL PRIMARY KEY auto_increment,
navn varchar(45) NOT NULL,
cpr INT NOT NULL, 
sms INT NOT NULL,
email varchar(45) NOT NULL,
niveau INT NOT NULL,
rykker DATETIME
);

CREATE TABLE item(
id INT NOT NULL PRIMARY KEY,
navn varchar(45) NOT NULL,
pris int NOT NULL,
opløsning VARCHAR(45) NOT NULL,
vægt VARCHAR(45) NOT NULL,
udgivelse VARCHAR(45) NOT NULL, 
Model VARCHAR(45) NOT NULL
);

CREATE TABLE borrowList(
id INT NOT NULL, 
bruger VARCHAR(45),
item VARCHAR(45),
time TIMESTAMP,
Afleverer DATETIME
 );
 
 CREATE TABLE grayList(
 id INT,
 bruger VARCHAR(45), 
 FOREIGN KEY (id) REFERENCES bruger(id)
 );
 






