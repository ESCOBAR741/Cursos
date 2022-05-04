package com.mycompany.learningjava;
import java.util.Scanner;
/**
 *
 * @author Escobar
 */
public class MultiplosDe10 {
  Scanner a = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner gsh = new Scanner(System.in);

    int num;

    System.out.println("Ingrese un número");
    num = gsh.nextInt();
    
    if(num%10  ==0) {
        System.out.println("El  "+num+"número es múltiplo de 10");
}

    else{ System.out.println("El "+num+"no es múltiplo de 10");

  }
 }
}