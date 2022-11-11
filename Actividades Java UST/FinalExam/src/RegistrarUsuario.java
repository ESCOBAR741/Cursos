import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarUsuario extends JFrame implements ActionListener {
    JTextField newUsuario;
    JPasswordField newPassword;
    JPasswordField newRepeatPassword;
    JButton SaveNewUser = new JButton("Guardar");


    public RegistrarUsuario() {
        JFrame example = new JFrame("Create Account");

        JLabel textUsuario = new JLabel("Input Usser: ");
        textUsuario.setBounds(10, 20, 80, 30);
        example.add(textUsuario);

        newUsuario = new JTextField();
        newUsuario.setBounds(70, 20, 200, 30);
        example.add(newUsuario);

        JLabel textPassword = new JLabel("Input Password");
        textPassword.setBounds(10, 60, 80, 30);
        example.add(textPassword);

        newPassword = new JPasswordField();
        newPassword.setBounds(70, 60, 200, 30);
        example.add(newPassword);

        JLabel textRepeatPassword = new JLabel("Repeat Password");
        textRepeatPassword.setBounds(10, 120, 80, 30);
        example.add(textRepeatPassword);

        newRepeatPassword = new JPasswordField();
        newRepeatPassword.setBounds(10,120,80,30);
        example.add(newRepeatPassword);

        SaveNewUser.setBounds(135, 100, 120, 30);
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
            String datosNuevoUsuario = newUsuario.getText();
            char [] datosNuevoPassword = newPassword.getPassword();
            String NewPassword = new String(datosNuevoPassword);
            System.out.println(NewPassword);

            System.out.println(newPassword);
        }

        /*if (event.getSource() == save) {
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
            } */

    }
}
