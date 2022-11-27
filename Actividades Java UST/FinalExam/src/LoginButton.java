import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginButton extends JFrame implements ActionListener {
    JTextField usuario;
    JPasswordField password;
    JButton logearse = new JButton("Iniciar Sesion");

    JButton newUser = new JButton("Crear cuenta");

    public LoginButton() {
        JFrame logIn = new JFrame("Login");
        //JFrame NewUSer = new JFrame("Test");

        JLabel textUsuario = new JLabel("Usuario: ");
        textUsuario.setBounds(10, 20, 80, 30);
        logIn.add(textUsuario);

        usuario = new JTextField();
        usuario.setBounds(70, 20, 200, 30);
        logIn.add(usuario);

        JLabel textPassword = new JLabel("Password");
        textPassword.setBounds(10, 60, 80, 30);
        logIn.add(textPassword);

        password = new JPasswordField();
        password.setBounds(70, 60, 200, 30);
        logIn.add(password);

        newUser.setBounds(135, 140, 115, 25);
        logIn.add(newUser);
        newUser.addActionListener(this);

        logearse.setBounds(135, 100, 120, 20);
        logIn.add(logearse);
        logearse.addActionListener(this);
        logIn.setSize(380, 300);
        logIn.setLayout(null);
        logIn.setLocation(600, 300);
        logIn.setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == logearse) {
            String datosUsuario = usuario.getText();
            char [] datosPassword = password.getPassword();
            String password = new String(datosPassword);
            String usuario = datosUsuario;
            LoginUsuario ClaseLoginUsuario = new LoginUsuario();
            ClaseLoginUsuario.ValidarUsuario(usuario,password);
           /* System.out.println(getUsuario.ValidarUsuario(datosUsuario,password));
            if (getUsuario.ValidarUsuario(datosUsuario,password) == 1) {
                JOptionPane.showMessageDialog(null, "Ok");
            } else {
                JOptionPane.showMessageDialog(null,"User or/and password are wrong");
            } */

        }
        if (event.getSource() == newUser) {

           new UsuarioRegistrar();
        }

    }
}
