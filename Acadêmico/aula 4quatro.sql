-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Aluno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Aluno` (
  `Matricula` INT NOT NULL,
  `Nome` VARCHAR(45) NULL,
  `Idade` INT NULL,
  `Periodo` VARCHAR(45) NULL,
  PRIMARY KEY (`Matricula`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Professor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Professor` (
  `idProfessor` INT NOT NULL,
  `Nome` VARCHAR(45) NULL,
  `Materia` VARCHAR(45) NULL,
  PRIMARY KEY (`idProfessor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Aluno_has_Professor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Aluno_has_Professor` (
  `Aluno_Matricula` INT NOT NULL,
  `Professor_idProfessor` INT NOT NULL,
  PRIMARY KEY (`Aluno_Matricula`, `Professor_idProfessor`),
  INDEX `fk_Aluno_has_Professor_Professor1_idx` (`Professor_idProfessor` ASC) VISIBLE,
  INDEX `fk_Aluno_has_Professor_Aluno_idx` (`Aluno_Matricula` ASC) VISIBLE,
  CONSTRAINT `fk_Aluno_has_Professor_Aluno`
    FOREIGN KEY (`Aluno_Matricula`)
    REFERENCES `mydb`.`Aluno` (`Matricula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Aluno_has_Professor_Professor1`
    FOREIGN KEY (`Professor_idProfessor`)
    REFERENCES `mydb`.`Professor` (`idProfessor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Jogador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Jogador` (
  `idJogador` INT NOT NULL,
  `Nome` VARCHAR(45) NULL,
  `Posicao` VARCHAR(45) NULL,
  PRIMARY KEY (`idJogador`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Treinador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Treinador` (
  `idTreinador` INT NOT NULL,
  `Nome` VARCHAR(45) NULL,
  `Time` VARCHAR(45) NULL,
  `Jogador_idJogador` INT NOT NULL,
  PRIMARY KEY (`idTreinador`),
  INDEX `fk_Treinador_Jogador1_idx` (`Jogador_idJogador` ASC) VISIBLE,
  CONSTRAINT `fk_Treinador_Jogador1`
    FOREIGN KEY (`Jogador_idJogador`)
    REFERENCES `mydb`.`Jogador` (`idJogador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
