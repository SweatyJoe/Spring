CREATE TABLE IF NOT EXISTS `emploes`.`Emploe`
(
    `idEmp`   INT         NOT NULL AUTO_INCREMENT,
    `FIO`     VARCHAR(50) NOT NULL,
    `DayWork` INT         NOT NULL,
    `Rate`    DOUBLE      NOT NULL,
    PRIMARY KEY
        (
         `idEmp`
            ),
    UNIQUE INDEX `FIO_UNIQUE`
        (
         `FIO` ASC
            ) VISIBLE
)
    ENGINE = InnoDB;

ALTER table emploe add `Selary` double as (DayWork*8*Rate);
insert into EMPLOYE values (1, 'Telenchenko A.F.', 22, 1.22, default)