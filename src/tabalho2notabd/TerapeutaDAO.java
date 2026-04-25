package com.unifsa.tabalho2notabd;

import java.sql.*;
import java.util.ArrayList;

public class TerapeutaDAO {
    public void cadastrar(String nome, String especialidade, String email, String status) throws SQLException {
        String sql = "INSERT INTO terapeutas(nome, especialidade, email, status) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, especialidade);
            stmt.setString(3, email);
            stmt.setString(4, status);
            stmt.execute();
        }
    }

    public ResultSet listarComFiltro(String nomeFiltro) throws SQLException {
        String sql = "SELECT * FROM terapeutas WHERE nome ILIKE ? ORDER BY nome ASC";
        Connection conn = Conexao.getConexao();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + nomeFiltro + "%");
        return stmt.executeQuery();
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM terapeutas WHERE id_terapeuta = ?";
        try (Connection conn = Conexao.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.execute();
        }
    }
}
