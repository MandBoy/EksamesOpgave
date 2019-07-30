-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema BorrowDatabase
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema BorrowDatabase
-- -----------------------------------------------------
DROP DATABASE IF EXISTS BorrowDatabase;
CREATE SCHEMA IF NOT EXISTS `BorrowDatabase` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `BorrowDatabase` ;

-- -----------------------------------------------------
-- Table `BorrowDatabase`.`BorrowList`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BorrowDatabase`.`BorrowList` (
  `borrowListId` INT(11) NOT NULL AUTO_INCREMENT,
  `bruger` INT(11) NULL DEFAULT NULL,
  `item` INT(11) NULL DEFAULT NULL,
  `tidspunkt` TIMESTAMP NULL DEFAULT NULL,
  `Afleverer` DATETIME NULL DEFAULT NULL,
  `Bruger_brugerId` INT(11) NOT NULL,
  PRIMARY KEY (`borrowListId`),
  INDEX `fk_BorrowList_Bruger_idx` (`Bruger_brugerId` ASC) VISIBLE,
  CONSTRAINT `fk_BorrowList_Bruger`
    FOREIGN KEY (`Bruger_brugerId`)
    REFERENCES `BorrowDatabase`.`bruger` (`brugerId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `BorrowDatabase`.`Bruger`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BorrowDatabase`.`Bruger` (
  `brugerId` INT(11) NOT NULL AUTO_INCREMENT,
  `navn` VARCHAR(45) NOT NULL,
  `cpr` INT(11) NOT NULL,
  `sms` INT(11) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `niveau` INT(11) NOT NULL,
  PRIMARY KEY (`brugerId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `BorrowDatabase`.`GrayList`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BorrowDatabase`.`GrayList` (
  `grayListId` INT(11) NOT NULL,
  `bruger` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`grayListId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `BorrowDatabase`.`Item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BorrowDatabase`.`Item` (
  `itemId` INT(11) NOT NULL AUTO_INCREMENT,
  `navn` VARCHAR(45) NOT NULL,
  `pris` INT(11) NOT NULL,
  `opløsning` VARCHAR(45) NOT NULL,
  `vægt` VARCHAR(45) NOT NULL,
  `udgivelse` VARCHAR(45) NOT NULL,
  `Model` VARCHAR(45) NOT NULL,
  `BorrowList_borrowListId` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`itemId`),
  INDEX `fk_Item_BorrowList1_idx` (`BorrowList_borrowListId` ASC) VISIBLE,
  CONSTRAINT `fk_Item_BorrowList1`
    FOREIGN KEY (`BorrowList_borrowListId`)
    REFERENCES `BorrowDatabase`.`borrowlist` (`borrowListId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
