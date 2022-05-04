package com.mycompany.learningjava;
import java.util.Scanner;
/**
 *
 * @author Escobar
 */
public class VolumenDelCono {
  Scanner a = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);      
        
        
      System.out.println("Ingresa El Área de la base");
      double num   = x.nextDouble();
      
      System.out.println("Ingresa la altura");
      double num2  = x.nextDouble();
      

      
      System.out.println("El volumen del cono es:" + (num * num2)/3 );
        
    }
}