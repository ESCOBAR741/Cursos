package com.mycompany.learningjava;
import java.util.Scanner;
/**
 *
 * @author Escobar
 */
public class PruebaSumativa {
    Scanner a = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    PruebaSumativa ejercicios = new PruebaSumativa();
    String opcion = "";

    while(!opcion.equalsIgnoreCase("d")) {
      System.out.println("\n");
      System.out.println("\033[0;35mBienvenidos Al Menú");
      System.out.println("Escoja una de las opciones");
      System.out.println("a. Ejecutar el ejercicio 1 ");
      System.out.println("b. Ejecutar el ejercicio 2");
      System.out.println("c. Ejecutar el ejercicio 3");
      System.out.println("d. Salir");
      System.out.println(" ");
      System.out.println("Su opción será :");

      opcion = a.next();
      if(opcion.equalsIgnoreCase("a")) {
        ejercicios.ejercicio1();
      }
      if(opcion.equalsIgnoreCase("b")) {
        ejercicios.ejercicio2();
      }
      if(opcion.equalsIgnoreCase("c")) {
        ejercicios.ejercicio3();
      }
    }

  }
  public void ejercicio1() {
        int area;
        int base;
        int altura;
        
        System.out.println("Área de un rectágulo");
        System.out.println("Introduzca la longitud de la base en cm: ");
        base = a.nextInt();
        System.out.println("Introuduzca la altura en cm: ");
        altura = a.nextInt();
        
        area = base*altura;
        System.out.println("El área del rectángulo es : "+area+"cm^2");

  }
  public void ejercicio2() {
        int x;
        int y;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        
        System.out.println("Introduzca el primer número: ");
        x = a.nextInt();
        System.out.println("Introduzca el segundo número: ");
        y = a.nextInt();
        
        suma = x+y;
        resta = x-y;
        multiplicacion = x*y;
        division = (double) x/y;
        
        System.out.println("x + y = "+(suma));
        System.out.println("x - y = "+(resta));
        System.out.println("x * y = "+(multiplicacion));
        System.out.println("x / y = "+(division));

  }
  public void ejercicio3() {
        int x;
        int y;
        int z;
        int prom=0;
        
        System.out.println("Ingrese nota n°1 :");
        x = a.nextInt();
        System.out.println("Ingrese nota n°2 :");
        y = a.nextInt();
        System.out.println("Ingrese nota n°3 :");
        z = a.nextInt();
        
        prom = ((x+y+z)/3);
        
        System.out.println("Nota n°1 es :"+x);
        System.out.println("Nota n°2 es :"+y);
        System.out.println("Nota n°3 es :"+z);
        System.out.println("El promedio es :"+prom); 

  }
}