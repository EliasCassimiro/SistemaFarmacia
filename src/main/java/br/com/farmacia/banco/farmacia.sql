-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema farmacia
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema farmacia
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `farmacia` DEFAULT CHARACTER SET utf8 ;
USE `farmacia` ;

-- -----------------------------------------------------
-- Table `farmacia`.`fornecedores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`fornecedores` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`produtos` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  `quantidade` INT NOT NULL,
  `preco` DECIMAL(6,2) NULL,
  `fornecedores_codigo` INT NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_produtos_fornecedores_idx` (`fornecedores_codigo` ASC) VISIBLE,
  CONSTRAINT `fk_produtos_fornecedores`
    FOREIGN KEY (`fornecedores_codigo`)
    REFERENCES `farmacia`.`fornecedores` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
