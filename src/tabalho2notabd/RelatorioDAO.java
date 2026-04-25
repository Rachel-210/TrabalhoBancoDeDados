package com.unifsa.tabalho2notabd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RelatorioDAO {
    public void relatorioConsultas() throws SQLException {
        String sql = "SELECT c.data_consulta, p.nome AS paciente, t.nome AS terapeuta, c.valor" +
                     "FROM consultas c " +
                     "INNER JOIN pacientes p ON c.fk_id_paciente = p.id_paciente " +
                     "INNER JOIN terapeutas t ON c.fk_id_terapeuta = t.id_terapeuta";
        
        try (Connection conn = Conexao.getConexao(); 
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while(rs.next()) {
                System.out.println("Data: " + rs.getDate("data_consulta") + 
                                   " | Paciente: " + rs.getString("paciente"));
            }
        }
    }
}