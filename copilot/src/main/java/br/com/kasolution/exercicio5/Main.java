package br.com.kasolution.exercicio5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=exemplo";
        try (Connection connection = conectarBanco(url)) {
            if (connection != null) {
                System.out.println("Conexão estabelecida com sucesso!");
            } else {
                System.out.println("Falha ao estabelecer conexão.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    public static Connection conectarBanco(String url) {
        try {
            return DriverManager.getConnection(url, "username", "password"); // Substitua "username" e "password" pelas credenciais corretas
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }
}
