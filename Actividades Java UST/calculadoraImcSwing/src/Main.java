import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField altura, peso, imc;

    public void IndiceImc() {
        JLabel btnAltura = new JLabel("Altura en metros");
        JLabel btnPeso = new JLabel("Peso Kg");
        JLabel btnIMC = new JLabel("IMC");
        JButton calcular = new JButton("Calcular IMC");
        altura = new JTextField();
        peso = new JTextField();
        imc = new JTextField();
        imc.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(btnAltura);
        panel.add(btnPeso);
        panel.add(btnIMC);
        add(panel);

        calcular.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Double peso = Double.parseDouble(btnPeso.getText());
                        Double altura = Double.parseDouble(btnAltura.getText());
                        Double imc = peso / (altura * altura);
                        String arrayImc = String.format("Unkwnow" + imc);
                        btnIMC.setText(arrayImc);
                    }
                }
        ); //adActionlistener

        setTitle("IMC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500 ,600);
    } //Constructor

    public static void main(String[] args) {


    }
}