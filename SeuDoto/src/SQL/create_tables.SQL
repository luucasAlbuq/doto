CREATE TABLE Profissional(crm VARCHAR(11), nome VARCHAR(45), tipo VARCHAR(20), PRIMARY KEY(crm));
CREATE TABLE ConvenioProf(crm VARCHAR(11), nome_conv VARCHAR(30), PRIMARY KEY(crm, nome_conv), FOREIGN KEY (crm) REFERENCES Profissional(crm));
CREATE TABLE Usuario(id_usuario VARCHAR(20), nome_usuario VARCHAR(45), PRIMARY KEY(id_usuario));
CREATE TABLE Avaliacao(crm VARCHAR(11), id_usuario VARCHAR(30), PRIMARY KEY(crm, id_usuario), FOREIGN KEY (crm) REFERENCES Profissional(crm), FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario));


