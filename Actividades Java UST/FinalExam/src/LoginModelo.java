import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

    public void Validar(LoginModelo usuario)throws Exception {
        System.out.println(usuario);
        Connection Connector = null;
        PreparedStatement preparedStatementEjecutarSQL = null;
        String sql = null;
        try {
            Connector = Prueba.conexion();
            Connector.setAutoCommit(false);
            sql = "SELECT usuario, password FROM usuarios WHERE usuario = ?";
            preparedStatementEjecutarSQL = Connector.prepareStatement(sql);
            preparedStatementEjecutarSQL.setString(1, usuario.getUsuario());
            preparedStatementEjecutarSQL.setString(2, usuario.getPassword());
            preparedStatementEjecutarSQL.executeUpdate();
            Connector.commit();
            preparedStatementEjecutarSQL.close();


        } catch (Exception e) {
            try {
                Connector.rollback();
            } catch (SQLException ex) {
                throw e;
            }
        }
    }

    public static void main(String[] args) {
        LoginModelo LoginClase = new LoginModelo();
        /* LoginClase.setUsuario("Arturo");
        LoginClase.setPassword("1234"); */
        LoginModelo ClaseModeloLogin = new LoginModelo();
        try {
            ClaseModeloLogin.Validar(LoginClase);
        } catch (Exception e) {

        }
    }
}
