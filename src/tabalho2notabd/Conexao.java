package com.unifsa.tabalho2notabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:postgresql://localhost:5432/HospitalTerapeutico ";
    private static final String USER = "postgres";
    private static final String PASS = "1230";

    public static Connection getConexao() throws SQLException {
       try {
        System.out.println("Tentando conectar ao banco...");
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        System.out.println("Conexão estabelecida com sucesso!");
        return conn;
    } catch (SQLException e) {
        System.out.println("FALHA NA CONEXÃO: " + e.getMessage());
        return null;
    }
    }
}