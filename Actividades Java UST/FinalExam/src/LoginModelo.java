import java.sql.*;
import java.util.Arrays;

public class LoginModelo {
    private String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String Usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String[] Validar(String usuario)throws Exception {
        System.out.println(usuario);
        Connection Connector = null;
        PreparedStatement preparedStatementEjecutarSQL = null;
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
                return resultadoValidarDb;

            }

            Connector.commit();
            preparedStatementEjecutarSQL.close();

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
            System.out.println("funciona");
            String [] arrayPrueba = LoginClase.Validar("admin");
            System.out.println(Arrays.toString(arrayPrueba));
        } catch (Exception e) {

        }
    }
}
