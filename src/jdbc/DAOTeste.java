package jdbc;

public class DAOTeste {
    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        System.out.println(dao.incluir(sql, "Mellzinea"));
        System.out.println(dao.incluir(sql, "Shogum"));
        System.out.println(dao.incluir(sql, "Luhman"));

        dao.close();

    }
}
