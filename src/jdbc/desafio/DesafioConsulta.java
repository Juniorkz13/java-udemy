package jdbc.desafio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import jdbc.FabricaConexao;
import jdbc.Pessoa;

public class DesafioConsulta {
    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        String nome = JOptionPane.showInputDialog("Nome: ");

        String sql = "SELECT * FROM pessoas WHERE nome like '" + nome + "%'";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nomeTabela = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nomeTabela));
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getCodigo() + "-->" + pessoa.getNome());
        }

        stmt.close();
        conexao.close();
    }
}
