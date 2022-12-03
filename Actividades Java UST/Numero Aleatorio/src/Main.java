import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{

    JTextField inputInt, inputNumero;
    JButton calcular = new JButton("Calcular");

    public Main() {
        JFrame calcularFrame = new JFrame();

        JLabel txtNumero = new JLabel("Numero Aleatorio");
        txtNumero.setBounds(10, 20, 120, 30);
        calcularFrame.add(txtNumero);

       /*  inputNumero = new JTextField();
        inputNumero.setBounds(120, 20, 150, 30);
        calcularFrame.add(inputNumero); */

        calcular.setBounds(135, 140, 115, 25);
        calcularFrame.add(calcular);
        calcular.addActionListener(this);

        calcularFrame.setSize(380, 300);
        calcularFrame.setLayout(null);
        calcularFrame.setLocation(600, 300);
        calcularFrame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() ==calcular) {

            NumeroAleatorio ClaseNumeroAleatorio = new NumeroAleatorio();
            ClaseNumeroAleatorio.GenerarNumeroAleatorio();

        }
    }


    public static void main(String[] args) {
        Main ClaseMain = new Main();
        System.out.println("Clase Main");
    }
}