import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginButton extends JFrame implements ActionListener {
    JTextField usuario;
    JPasswordField password;
    JButton save = new JButton("Guardar");

    public LoginButton() {
        JFrame example = new JFrame("Ejemplo");

        JLabel textUsuario = new JLabel("Usuario: ");
        textUsuario.setBounds(10, 20, 80, 30);
        example.add(textUsuario);

        usuario = new JTextField();
        usuario.setBounds(70, 20, 200, 30);
        example.add(usuario);

        JLabel textPassword = new JLabel("Password");
        textPassword.setBounds(10, 60, 80, 30);
        example.add(textPassword);

        password = new JPasswordField();
        password.setBounds(70, 60, 200, 30);
        example.add(password);

        save.setBounds(150, 100, 85, 20);
        example.add(save);
        save.addActionListener(this);
        example.setSize(380, 300);
        example.setLayout(null);
        example.setLocation(600, 300);
        example.setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == save) {
        String datosUsuario = usuario.getText();
        char [] datosPassword = password.getPassword();
        String password = new String(datosPassword);
        System.out.println(password);
        Usuario getUsuario = new Usuario();
        System.out.println(getUsuario.ValidarUsuario(datosUsuario,password));
        if (getUsuario.ValidarUsuario(datosUsuario,password) == 1) {
            JOptionPane.showMessageDialog(null, "Ok");
        } else {
            JOptionPane.showMessageDialog(null,"User or/and password are wrong");
        }

        }

    }
}
