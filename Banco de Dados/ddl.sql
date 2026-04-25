CREATE TABLE pacientes(
id_paciente SERIAL PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
cpf VARCHAR(50) UNIQUE NOT NULL,
telefone VARCHAR(50) NOT NULL,
data_nascimento DATE
);

CREATE TABLE terapeutas(
id_terapeuta SERIAL PRIMARY KEY,
nome VARCHAR(100),
especialidade VARCHAR(50) DEFAULT 'Psicologia',
email VARCHAR(100) UNIQUE NOT NULL,
status VARCHAR(100) DEFAULT 'Ativo'
);

CREATE TABLE consultas(
id_consulta SERIAL PRIMARY KEY,
fk_id_terapeuta INT REFERENCES terapeutas(id_terapeuta),
fk_id_paciente INT REFERENCES pacientes(id_paciente),
data_consulta DATE NOT NULL,
status_consulta VARCHAR(50) DEFAULT 'Agendada',
valor DECIMAL NOT NULL
);