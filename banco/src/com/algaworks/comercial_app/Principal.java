package com.algaworks.comercial_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal {
    
    public static void main(String[] args) throws ClassNotFoundException {
        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercial", "root", "")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados");
            e.printStackTrace();
        }
        
    }
}
