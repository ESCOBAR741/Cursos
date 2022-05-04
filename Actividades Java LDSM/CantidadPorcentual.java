package com.mycompany.learningjava;
import java.util.Scanner;
/**
 *
 * @author Escobar
 */
public class CantidadPorcentual {

  public static void main(String[] args) {
    Scanner gsh = new Scanner(System.in);

    int cantM;
    int cantH;
    int canTotal;
    double porcentajeM;
    double porcentajeH;

    System.out.println("Ingrese la cantidad de hombres");
    cantH = gsh.nextInt();
    System.out.println("INgrese la cantidad de mujeres");
    cantM = gsh.nextInt();

    //Fómula
    canTotal = cantH+cantM;
    porcentajeH = ((cantH*100)/canTotal);
    porcentajeM = ((cantM*100)/canTotal);

    System.out.println("El porcentaje de hombres es" +porcentajeH);
    System.out.println("El porcentaje de mujeres es" +porcentajeM);

  }
}