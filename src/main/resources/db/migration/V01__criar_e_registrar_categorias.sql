CREATE TABLE condominio (
	id integer PRIMARY KEY AUTO_INCREMENT,
	email varchar(255),
	bairro varchar(255),
	cep varchar(255),
	cidade varchar(255),
	estado varchar(255),
	logradouro varchar(255),
	numero varchar(255),
	nome varchar(255),
	numero_de_apt integer,
	telefone varchar(255)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
    
    
INSERT INTO condominio (email, bairro, cep, cidade, estado, logradouro, numero, nome, numero_de_apt, telefone) 
VALUES ('condominio_montreal@gmail.com', 'Boa Viagem','51030510', 'Recife', 'Pernambuco', 'Rua Viriato Correia', '71', 'Edf Montreal', 76, '33225-5252');


CREATE TABLE proprietario (
	id integer PRIMARY KEY AUTO_INCREMENT,
    cpf varchar(255),
    email varchar(255),
    bairro varchar(255),
    cep varchar(255),
    cidade varchar(255),
    estado varchar(255),
    logradouro varchar(255),
    numero varchar(255),
    apto varchar(255),
    nome varchar(255),
    telefone varchar(255)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
    
    
INSERT INTO proprietario (cpf, email, bairro, cep, cidade, estado, logradouro, numero, apto, nome, telefone) 
VALUES ('04044364478','zero.barros@gmail.com', 'Boa Viagem','51030510', 'Recife', 'Pernambuco', 'Rua Viriato Correia', '71', '803', 'Edf Montreal', '96759966');

INSERT INTO proprietario (cpf, email, bairro, cep, cidade, estado, logradouro, numero, apto, nome, telefone) 
VALUES ('04641859477','analu@gmail.com', 'Boa Viagem','51030510', 'Recife', 'Pernambuco', 'Rua Viriato Correia', '71', '303', 'Edf Montreal', '99498-5566');

CREATE TABLE apartamento (
   	id integer PRIMARY KEY AUTO_INCREMENT,
    numero varchar(255),
    condominio_id integer,
    proprietario_id integer,
    FOREIGN KEY (condominio_id) REFERENCES condominio(id),
    FOREIGN KEY (proprietario_id) REFERENCES proprietario(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
    
    
INSERT INTO apartamento (numero, condominio_id, proprietario_id) VALUES ('803', 1, 1);
INSERT INTO apartamento (numero, condominio_id, proprietario_id) VALUES ('303', 1, 2);
    

CREATE TABLE despesa (
   	id integer PRIMARY KEY AUTO_INCREMENT,
    data timestamp,
    nome_despesa varchar(255),
    valor_despesa double not null,
    condominio_id integer,
	FOREIGN KEY (condominio_id) REFERENCES condominio(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
       
       
INSERT INTO despesa (data, nome_despesa, valor_despesa, condominio_id) VALUES ('2020-02-19', 'Gás de Cozinha', 12000.0, 1);
INSERT INTO despesa (data, nome_despesa, valor_despesa, condominio_id) VALUES ('2020-02-19', 'Emfibra Internet', 1152.0, 1);