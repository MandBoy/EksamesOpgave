DROP DATABASE IF EXISTS LåneSystem;
CREATE DATABASE LåneSystem;

Use LåneSystem;

CREATE TABLE genstande(
genstande_id int NOT NULL PRIMARY KEY auto_increment,
navn varchar(255),
pris int NOT NULL,
opløsning VARCHAR(45) NOT NULL,
vægt VARCHAR(45) NOT NULL,
udgivelse VARCHAR(45) NOT NULL, 
Model VARCHAR(45) NOT NULL,
lån_tid VARCHAR(45)
);


CREATE TABLE studerende(
id int NOT NULL PRIMARY KEY auto_increment,
navn VARCHAR(45),
cpr INT NOT NULL,
email VARCHAR(45),
lånt VARCHAR(45)
);

CREATE TABLE studerende_info(
studerende_id INT, 
tech_genstande_id INT,
FOREIGN KEY (tech_genstande_id) REFERENCES genstande(genstande_id),
FOREIGN KEY (studerende_id) REFERENCES studerende(id),
lånt DATETIME
);

CREATE TABLE låne_tid(
id INT,
studerende_id INT, 
tech_genstande_id INT,
FOREIGN KEY (tech_genstande_id) REFERENCES genstande(genstande_id),
FOREIGN KEY (studerende_id) REFERENCES studerende(id),
lånt DATETIME,
returner DATETIME,
rykker TIMESTAMP
);
