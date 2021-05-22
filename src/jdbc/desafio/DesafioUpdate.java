package jdbc.desafio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import jdbc.FabricaConexao;
import jdbc.Pessoa;

public class DesafioUpdate {
    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        String codigo = JOptionPane.showInputDialog("Codigo: ");
        int codigoInt = Integer.parseInt(codigo);

        String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigoInt);
        ResultSet resultado = stmt.executeQuery();

        if (resultado.next()) {
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
            System.out.println("Nome atual: " + p.getNome());
            String nomeNovo = JOptionPane.showInputDialog("Novo nome: ");
            stmt.close();
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, nomeNovo);
            stmt.setInt(2, codigoInt);
            stmt.execute();
            System.out.println("Update com sucesso");
        } else {
            System.out.println("Pessoa não encontrada");
        }

        stmt.close();
        conexao.close();
    }
}
