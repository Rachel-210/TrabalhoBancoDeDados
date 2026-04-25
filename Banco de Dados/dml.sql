INSERT INTO pacientes(nome, cpf, telefone, data_nascimento) VALUES
('Ana Beatriz Oliveira', '123.456.789-00', '(11) 98765-4321', '1990-05-15'),
('Carlos Eduardo Santos', '234.567.890-11', '(21) 97654-3210', '1985-11-20'),
('Mariana Costa Lima', '345.678.901-22', '(31) 96543-2109', '2000-02-10'),
('Ricardo Pereira Gomes', '456.789.012-33', '(41) 95432-1098', '1978-08-30'),
('Juliana Alves Souza', '567.890.123-44', '(51) 94321-0987', '1995-12-05'),
('Fernando Henrique Silva', '678.901.234-55', '(61) 93210-9876', '1982-03-25'),
('Camila Rodrigues Vale', '789.012.345-66', '(71) 92109-8765', '2003-07-12'),
('Lucas Martins Ferreira', '890.123.456-77', '(81) 91098-7654', '1992-01-18'),
('Beatriz Soares Rocha', '901.234.567-88', '(91) 90987-6543', '1988-09-09'),
('Gabriel Mendes Paiva', '012.345.678-99', '(48) 99876-5432', '1975-06-22');

INSERT INTO terapeutas(nome, especialidade, email, status) VALUES
('Dra. Helena Vitório', 'Psicologia Infantil', 'helena.vitorio@email.com', 'Ativo'),
('Dr. Marcos Schimdt', 'Terapia Ocupacional', 'marcos.terapeuta@email.com', 'Ativo'),
('Juliana Bezerra', 'Psicologia Cognitivo-Comportamental', 'juliana.psico@email.com', 'Ativo'),
('Roberto Alencar', 'Psicologia', 'roberto.alencar@email.com', 'Em Licença'),
('Ana Clara Matos', 'Neuropsicologia', 'ana.clara@email.com', 'Ativo');

INSERT INTO consultas(fk_id_terapeuta, fk_id_paciente, data_consulta, status_consulta, valor) VALUES
(1, 1, '2026-04-22', 'Agendada', 150.00),
(2, 3, '2026-04-22', 'Agendada', 200.00),
(1, 5, '2026-04-23', 'Realizada', 150.00),
(3, 2, '2026-04-24', 'Cancelada', 180.00),
(5, 8, '2026-04-25', 'Agendada', 220.00);

-- As linhas de comando a seguir não foram digitadas e selecionadas diretamente no banco de dados --
-- Elas foram utilizadas no código de interface do Java ---
-- A interface terapeutas e consultas seguem o mesmos padrão --
INSERT INTO pacientes (nome, cpf, telefone, data_nascimento) VALUES (?, ?, ?, ?)
UPDATE pacientes SET nome = ?, telefone = ?, data_nascimento = ? WHERE cpf = ?
DELETE FROM pacientes WHERE cpf = ?