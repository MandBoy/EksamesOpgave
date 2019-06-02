DROP DATABASE IF EXISTS Borrowddb;

CREATE DATABASE Borrowdbb;
Use Borrowdbb;

CREATE TABLE Bruger(
brugerId INT NOT NULL PRIMARY KEY auto_increment,
navn varchar(45) NOT NULL,
cpr INT NOT NULL, 
sms INT NOT NULL,
email varchar(45) NOT NULL,
niveau INT NOT NULL,
rykker TIMESTAMP
);

CREATE TABLE Item(
itemId INT NOT NULL PRIMARY KEY auto_increment,
navn varchar(45) NOT NULL,
pris int NOT NULL,
opløsning VARCHAR(45) NOT NULL,
vægt VARCHAR(45) NOT NULL,
udgivelse VARCHAR(45) NOT NULL, 
Model VARCHAR(45) NOT NULL
);

CREATE TABLE BorrowList(
borrowListId INT NOT NULL PRIMARY KEY auto_increment, 
bruger int,
item int,
tidspunkt TIMESTAMP,
Afleverer DATETIME,
FOREIGN KEY(bruger) REFERENCES Bruger(brugerId),
FOREIGN KEY(item) REFERENCES Item(itemId)
 );
 
 CREATE TABLE GrayList(
 grayListId INT,
 bruger VARCHAR(45), 
 FOREIGN KEY (GrayListId) REFERENCES Bruger(brugerId)
 );