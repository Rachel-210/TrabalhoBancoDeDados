SELECT * FROM pacientes;

SELECT * FROM terapeutas;

SELECT * FROM consultas;

SELECT t.nome, c.data_consulta
FROM terapeutas t
LEFT JOIN consultas c ON t.id_terapeuta = c.fk_id_terapeuta;

SELECT
    c.id_consulta,
    p.nome AS nome_paciente,
    t.nome AS nome_terapeuta,
    c.data_consulta,
    c.status_consulta,
    c.valor
FROM consultas c
INNER JOIN pacientes p ON c.fk_id_paciente = p.id_paciente
INNER JOIN terapeutas t ON c.fk_id_terapeuta = t.id_terapeuta;

SELECT nome AS terapeuta,
        especialidade,
        email,
        status FROM terapeutas;

SELECT nome AS paciente,
        cpf,
        telefone,
        data_nascimento FROM pacientes;