import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioModelo {
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

    public void Insertar(Usuario usuario)throws Exception { //Todas las conexiones DB pide Exception
        System.out.println(usuario);
        Connection Connector = null;
        PreparedStatement preparedStatementEjecutarSQL = null;
        String sql = null;
        try {
            Connector = Prueba.conexion();
            Connector.setAutoCommit(false);
            sql = "INSERT INTO usuarios (usuario, password) VALUES (?,?)";
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
        Usuario UsuarioClase = new Usuario();
        UsuarioClase.setUsuario("user1");
        UsuarioClase.setPassword("1234");
        UsuarioModelo ClaseModeloUsaruio = new UsuarioModelo();
        try {
            ClaseModeloUsaruio.Insertar(UsuarioClase);
        } catch (Exception e) {

        }
    }
}
