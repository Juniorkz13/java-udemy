package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {

        String nome = JOptionPane.showInputDialog("Informe o nome: ");

        Connection conexao = FabricaConexao.getConexao();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();

        System.out.println("Pessoa incluida com sucesso");
    }
}
