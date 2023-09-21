CREATE TABLE HOTEIS(
ID INT AUTO_INCREMENT PRIMARY KEY,
HOSPEDE VARCHAR(100) NOT NULL,
HOTEL VARCHAR(200) NOT NULL,
NUM_QUARTO VARCHAR(50) NOT NULL,
CIDADE VARCHAR(200) NOT NULL,
ESTADO VARCHAR(20)
);

INSERT INTO HOTEIS(ID, HOSPEDE, HOTEL, NUM_QUARTO,CIDADE, ESTADO) VALUES
(1, 'Matheus Gomes', 'Hotel Plaza', '2A', 'Sao Paulo', 'SP'),
(2, 'Henrique Silva', 'Hotel Ibiza', '3B', 'Belo Horizonte', 'MG'),
(3, 'Maria Eduarda', 'Hotel La Terraza', '4A', 'Sao Paulo', 'SP');