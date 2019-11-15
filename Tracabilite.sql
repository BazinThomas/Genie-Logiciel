DROP TABLE InfoCereale;
DROP TABLE Reception;
DROP TABLE Expedition;
DROP TABLE Cellule;

CREATE TABLE InfoCereale (
    catégorie VARCHAR(50), /* Blé, orge, pois, proteagineux, colza */
    poids number(2), /* moyenne en grammes */
    qualité VARCHAR(50),  /* Mauvais, Bon, Excellent*/
    NoLot number(5), /* Numero du lot sur 5 chiffres max */
    PRIMARY KEY (NoLot) 
);

CREATE TABLE Reception (
    acheminement VARCHAR(50), /* Train, Routier, Bateau, Aérien */
    NoCellule number(2), /* Numéro de la cellule dans laquelle il va être stocké */
    NoRecepLot number(5),
    NoRecep number(5),
    FOREIGN KEY (NoRecepLot) REFERENCES InfoCereale(NoLot),
    PRIMARY KEY (NoRecep) 
);

CREATE TABLE Cellule (
    Nettoyage DATE,
    Ventilation DATE,
    Traitement DATE,
    NoCell number(2),
    NoCellLot number(5),
    FOREIGN KEY (NoCellLot) REFERENCES InfoCereale(NoLot),
    PRIMARY KEY (NoCell)
);

/*
CREATE TABLE Silo (
    NoSilo number(2),
    PRIMARY KEY (NoSilo)
);
*/

CREATE TABLE Expedition (
    SocieteTransport VARCHAR(50), 
    TempsExpeditionPrevu number(2), /* en heure */
    Destination VARCHAR(50), /* Ville */
    NoExpeLot number(5),
    NoExpe number(5),
    FOREIGN KEY (NoExpeLot) REFERENCES InfoCereale(NoLot),
    PRIMARY KEY (NoExpe)
);

/* petit test d'intégration */
INSERT INTO InfoCereale VALUES('Blé', 10, 'Bon', 225);
INSERT INTO Reception VALUES('Routier',2,225,1);

INSERT INTO InfoCereale VALUES('Blé', 20, 'Mauvais', 226);
INSERT INTO Cellule VALUES(current DATE,current DATE,current DATE, 2, 226, 3);
/*
INSERT INTO Silo VALUES(3);
*/

INSERT INTO InfoCereale VALUES('Blé', 5, 'Bon', 227);
INSERT INTO Reception VALUES('BazinMobile',35,'TonnerreCity',227,4);
