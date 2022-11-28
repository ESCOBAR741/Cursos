import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioRegistrar extends JFrame implements ActionListener {
    JTextField newUsuario;
    JPasswordField newPassword;
    JPasswordField newRepeatPassword;
    JButton SaveNewUser = new JButton("Guardar");


    public UsuarioRegistrar() {
        JFrame example = new JFrame("Create Account");

        JLabel textUsuario = new JLabel("Input Usser: ");
        textUsuario.setBounds(10, 20, 80, 30);
        example.add(textUsuario);

        newUsuario = new JTextField();
        newUsuario.setBounds(120, 20, 200, 30);
        example.add(newUsuario);

        JLabel textPassword = new JLabel("Input Password");
        textPassword.setBounds(10, 60, 100, 30);
        example.add(textPassword);

        newPassword = new JPasswordField();
        newPassword.setBounds(120, 60, 200, 30);
        example.add(newPassword);

        JLabel textRepeatPassword = new JLabel("Repeat Password");
        textRepeatPassword.setBounds(10, 100, 110, 30);
        example.add(textRepeatPassword);

        newRepeatPassword = new JPasswordField();
        newRepeatPassword.setBounds(120,100,200,30);
        example.add(newRepeatPassword);

        SaveNewUser.setBounds(135, 180, 120, 30);
        example.add(SaveNewUser);
        SaveNewUser.addActionListener(this);
        example.setSize(380, 300);
        example.setLayout(null);
        example.setLocation(600, 300);
        example.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == SaveNewUser) {
            String datosUsuario = newUsuario.getText();
            char[] datosPassword = newPassword.getPassword();
            String usuario = newUsuario.getText();
            String password = new String(datosPassword);
            String repeatPassword = newRepeatPassword.getText();

            Usuario ClaseUsuario = new Usuario();
            ClaseUsuario.CrearUsuario(usuario,password,repeatPassword);

        }
    }

}
