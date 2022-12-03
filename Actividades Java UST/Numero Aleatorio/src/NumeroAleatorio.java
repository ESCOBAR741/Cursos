import javax.swing.*;
import java.util.Random;
import java.util.stream.IntStream;

public class NumeroAleatorio extends JFrame {



    public int GenerarNumeroAleatorio() {
        int min_val = 1;
        int max_val = 49;

        Random rand = new Random();
        IntStream stream = rand.ints(8, min_val, max_val);
        stream.forEach(System.out::println);
        String resultado = stream.toString();


        JOptionPane.showMessageDialog(null, resultado);

    for (int i=0; i<8; i++) {
        
    }

    return 1;
    }
public static void main(String[] args) {
    System.out.println("CLase Numero Aleatorio");
    }
}