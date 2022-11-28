import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioModelo {


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


    public void Insertar(String usuario, String password) {
        Usuario UsuarioClase = new Usuario();
        UsuarioClase.setUsuario(usuario);
        UsuarioClase.setPassword(password);

        UsuarioModelo ClaseModeloUsaruio = new UsuarioModelo();
        try {
            ClaseModeloUsaruio.Insertar(UsuarioClase);
        } catch (Exception e) {

        }
    }

}
