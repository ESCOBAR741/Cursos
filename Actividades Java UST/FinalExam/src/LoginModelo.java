import java.sql.*;
import java.util.Arrays;

public class LoginModelo {

    public String[] Validar(String usuario)throws Exception {
        System.out.println(usuario);
        Connection Connector = null;
        //PreparedStatement preparedStatementEjecutarSQL = null;
        String sql = null;



        try {
            Connector = Prueba.conexion();
            Connector.setAutoCommit(false);
            sql = "SELECT usuario, password FROM usuarios WHERE usuario = '"+usuario+"'";
            /*preparedStatementEjecutarSQL = Connector.prepareStatement(sql);
            preparedStatementEjecutarSQL.setString(1, usuario.getUsuario());
            preparedStatementEjecutarSQL.setString(2, usuario.getPassword());
            preparedStatementEjecutarSQL.executeUpdate();*/

            ResultSet resultSetValidar = null;
            Statement statementSetNull = null;
            statementSetNull = Connector.createStatement();
            resultSetValidar = statementSetNull.executeQuery(sql);

            if (resultSetValidar.next()) {

                String usuarioValidarLogin = resultSetValidar.getString("usuario");
                String passwordValidarLogin = resultSetValidar.getString("password");
                System.out.println("Deberia de estar funcionando");
                        String [] resultadoValidarDb = new String[]{usuarioValidarLogin, passwordValidarLogin};
                System.out.println("Resultado Validar " +Arrays.toString(resultadoValidarDb));
                return resultadoValidarDb;

            }

            //Connector.commit();
            //preparedStatementEjecutarSQL.close();

        } catch (Exception e) {
            try {
                Connector.rollback();
            } catch (SQLException ex) {
                throw e;
            }
        }
        return new String[]{};
    }

    public static void main(String[] args) {
        LoginModelo LoginClase = new LoginModelo();

        LoginModelo ClaseModeloLogin = new LoginModelo();
        try {
            String [] arrayPrueba = LoginClase.Validar("admin");
            System.out.println(Arrays.toString(arrayPrueba));
            LoginUsuario ClaseLoginUsuario = new LoginUsuario();
            ClaseLoginUsuario(arrayPrueba);
        } catch (Exception e) {

        }
    }

    private static void ClaseLoginUsuario(String[] arrayPrueba) {
    }
}
