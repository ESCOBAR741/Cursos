import javax.swing.*;
import java.sql.*;
import java.util.Arrays;

public class LoginModelo {

    public String[] Validar(String usuario)throws Exception {
        Connection Connector = null;
        String sql = null;

        try {
            Connector = Prueba.conexion();
            Connector.setAutoCommit(false);
            sql = "SELECT usuario, password FROM usuarios WHERE usuario = '"+usuario+"'";

            ResultSet resultSetValidar = null;
            Statement statementSetNull = null;
            statementSetNull = Connector.createStatement();
            resultSetValidar = statementSetNull.executeQuery(sql);

            if (resultSetValidar.next()) {

                String usuarioValidarLogin = resultSetValidar.getString("usuario");
                String passwordValidarLogin = resultSetValidar.getString("password");
                        String [] resultadoValidarDb = new String[]{usuarioValidarLogin, passwordValidarLogin};
                System.out.println("Resultado Validar " +Arrays.toString(resultadoValidarDb));

                LoginUsuario ClaseLoginUsuarioResultado = new LoginUsuario();
                ClaseLoginUsuarioResultado(resultadoValidarDb, usuarioValidarLogin, passwordValidarLogin);
                return resultadoValidarDb;

            }

        } catch (Exception e) {
            try {
                Connector.rollback();
            } catch (SQLException ex) {
                throw e;
            }
        }
        return new String[]{};
    }


    private int ClaseLoginUsuarioResultado(String[] resultadoValidarDb, String usuarioValidarLogin, String passwordValidarLogin) {
        if (usuarioValidarLogin.equals(resultadoValidarDb[0]) && passwordValidarLogin.equals(resultadoValidarDb[1])) {
                JOptionPane.showMessageDialog(null, "Ok");

            return 1;
            } else {
                JOptionPane.showMessageDialog(null,"User or/and password are wrong");
                return 0;
            }

        }


}
