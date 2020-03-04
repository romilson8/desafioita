CREATE TABLE pedido (
	id integer PRIMARY KEY AUTO_INCREMENT,
	price double,
	quantity integer(255)
	
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

insert into pedido(price, quantity) values (33.20, 255);