package com.unifsa.tabalho2notabd;

import java.sql.*;
import java.util.ArrayList;

public class PacienteDAO {
    public void cadastrar(String nome, String cpf, String tel, Date dataNasc) throws SQLException {
        String sql = "INSERT INTO pacientes (nome, cpf, telefone, data_nascimento) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, tel);
            stmt.setDate(4, dataNasc);
            stmt.execute();
        }
    }

    public ResultSet listarComFiltro(String nomeFiltro) throws SQLException {
        String sql = "SELECT * FROM pacientes WHERE nome ILIKE ? ORDER BY nome ASC";
        Connection conn = Conexao.getConexao();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + nomeFiltro + "%");
        return stmt.executeQuery();
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM pacientes WHERE id_paciente = ?";
        try (Connection conn = Conexao.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.execute();
        }
    }
}
