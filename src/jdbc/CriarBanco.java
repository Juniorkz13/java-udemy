package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost?useTimezone=true&serverTimezone=America/Sao_Paulo";
        final String usuario = "root";
        final String senha = "123456";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        Statement stmt = conexao.createStatement(); // criando o banco de dados no SQL
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java"); // criando o banco de dados no SQL

        System.out.println("Banco curso_java criado com sucesso");
        conexao.close();
    }
}
