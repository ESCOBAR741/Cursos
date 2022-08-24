import javax.swing.*;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        char d = 'z';

        System.out.println("Ingresa un numero");

        try {
            Integer numero =  read.nextInt();

        }catch(Exception e) {
            System.out.println("Ingrese un número por favor");
            main(args);
            System.exit(0);
        }
    }
}
