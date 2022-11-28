import java.sql.*;

public class Prueba {
    private static final String driver  = "com.mysql.cj.jdbc.Driver";
    private static final String db      = "jdbc:mysql://localhost:3306/ordenes"; //nuestra db
    //Datos xampp
    private static final String usuario = "root";
    private static final String clave   = "";

    public static Connection conexion () {
        Connection conex = null;

        try {
            Class.forName(driver);
            conex= DriverManager.getConnection(db, usuario, clave);
        } catch (Exception e) {
            System.out.println("Error de BD"+ e.getMessage().toString());
        } finally {
            if (conex == null) {
                try {
                    conex.close();
                } catch (SQLException e) {

                }
            }
        }
        return conex;
    }


    public static void main(String[] args) {
        Prueba run = new Prueba();
        Connection conect = Prueba.conexion();
        if (conect != null) {
            System.out.println("Funciona");
        }

        String sql = "SELECT usuario FROM usuarios WHERE id = '2'";
        Statement statementNULL = null;
        ResultSet ResultSetNULL  = null;
        if (conect != null) {
            try {
                statementNULL = conect.createStatement(); //Crea una conexion
                ResultSetNULL  = statementNULL.executeQuery(sql);
                if (ResultSetNULL.next()) {
                    System.out.println(ResultSetNULL.getString("usuario"));
                }
            } catch (Exception e) {

            }
        }
    }
}
