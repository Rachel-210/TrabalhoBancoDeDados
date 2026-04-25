package com.unifsa.tabalho2notabd;

import java.sql.*;
import java.util.ArrayList;

public class ConsultasDAO {
    public void cadastrar(int id_consulta, int fk_id_terapeuta, int fk_id_paciente, Date data_consulta, double valor, String status_consulta) throws SQLException {
        String sql = "INSERT INTO consultas(fk_id_terapeuta, fk_id_paciente, data_consulta, status_consulta, valor) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexao.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, fk_id_terapeuta);
            stmt.setInt(2, fk_id_paciente);
            stmt.setDate(3, data_consulta);
            stmt.setString(4, status_consulta);
            stmt.setDouble(5, valor);
            stmt.setInt(6, id_consulta);
            stmt.execute();
        }
    }

    public ResultSet listarComFiltro(String nomeFiltro) throws SQLException {
        String sql = "SELECT * FROM consultas WHERE nome ILIKE ? ORDER BY nome ASC";
        Connection conn = Conexao.getConexao();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + nomeFiltro + "%");
        return stmt.executeQuery();
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM consultas WHERE id_consulta = ?";
        try (Connection conn = Conexao.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.execute();
        }
    }
}
