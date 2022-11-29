import javax.swing.*;

public class Usuario {
    private String usuario;
    private String password;

    public Usuario() {

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int CrearUsuario(String usuario, String password, String repeatPassword) {
        System.out.println(usuario);
        System.out.println(password);
        //System.out.println(repeatPassword);
        if (password.equals(repeatPassword) ) {
            System.out.println("Great");
            JOptionPane.showMessageDialog(null, "Successfully Created");
            UsuarioModelo ClaseUsuarioModelo = new UsuarioModelo();
            ClaseUsuarioModelo.Insertar(usuario, password);

            return 1;
        } else {
            JOptionPane.showMessageDialog(null, "Passwords are diferent");
            return 0;
        }

    }
}
