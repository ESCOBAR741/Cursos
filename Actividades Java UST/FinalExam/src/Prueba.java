import java.sql.*;

public class Prueba {
    private static final String driver  = "com.mysql.cj.jdbc.Driver";
    private static final String db      = "jdbc:mysql://localhost:3306/usuarios"; //Nuestra tabla
    private static final String usuario = "root";
    private static final String clave   = "";


    public static Connection conexion() {
        Connection conex = null;
        try {
            Class.forName(driver);
            conex = DriverManager.getConnection(db, usuario, clave);
        } catch (Exception e) {
            System.out.println("Error 4062" +e.getMessage().toString());
        }
        return conex;
    }

    public static void main(String[] args) {
        Prueba run = new Prueba();
        Connection conect = Prueba.conexion();
        if (conect != null) {
            System.out.println("Funciona");
        }
        String consultaSQL = "SELECT nombre FROM usuario WHERE id = '1'";
        Statement statementNULL = null;
        ResultSet resultSetNull = null;
        if (conect != null) {
            try {
                statementNULL = conect.createStatement(); //Crea una conexion
                resultSetNull = statementNULL.executeQuery(consultaSQL);
                if (resultSetNull.next()) {
                    System.out.println(resultSetNull.getString("nombre"));
                }
            } catch (Exception e) {
                
            }
        }

    }
}
