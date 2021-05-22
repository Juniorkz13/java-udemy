package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        String cod = JOptionPane.showInputDialog("Código: ");
        int codigo = Integer.parseInt(cod);

        String delete = "DELETE FROM pessoas WHERE codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(delete);
        stmt.setInt(1, codigo);

        if (stmt.executeUpdate() > 0) { // retorna o numero de linhas afetadas, como exclui 1, o retorno deve ser 1, se
                                        // for 0, não efetuou a exclusão.
            System.out.println("Exclusão com sucesso");

        } else {
            System.out.println("Processo falhou");
        }

        stmt.close();
        conexao.close();

    }
}
