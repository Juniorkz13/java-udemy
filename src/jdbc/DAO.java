package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    private Connection conexao;

    public int incluir(String sql, Object... atributos) { // Método que recebe um SQL e uma lista de atributos
        try {
            PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS); // É
                                                                                                                  // criado
                                                                                                                  // um
                                                                                                                  // preparedStatement
                                                                                                                  // que
                                                                                                                  // retorna
                                                                                                                  // a
                                                                                                                  // chave
                                                                                                                  // gerada
            adcionarAtributos(stmt, atributos); // Os atributos são adicionados, o STMT é enviado para o método privado
                                                // abaixo (ADCIONAR ATRIBUTOS)

            if (stmt.executeUpdate() > 0) { // Parte de inserção, verifica se foi realizado o update
                ResultSet resultado = stmt.getGeneratedKeys();

                if (resultado.next()) {
                    return resultado.getInt(1);
                }
            }

            return -1; // Caso algum problema tenha ocorrido e não foi realizada a inserção
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            getConexao().close();
        } catch (SQLException e) {
        } finally {
            conexao = null;
        }
    }

    private void adcionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException { // método está
                                                                                                     // adicionando a
                                                                                                     // lista de
                                                                                                     // atributos dentro
                                                                                                     // do statement

        int indice = 1;
        for (Object atributo : atributos) { // percorre cada atributo para saber o seu tipo e adiciona no local correto
            if (atributo instanceof String) {
                stmt.setString(indice, (String) atributo);
            } else if (atributo instanceof Integer) {
                stmt.setInt(indice, (Integer) atributo);
            }

            indice++;
        }
    }

    private Connection getConexao() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                return conexao;
            }
        } catch (SQLException e) {

        }

        conexao = FabricaConexao.getConexao();
        return conexao;
    }
}
