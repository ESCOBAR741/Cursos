package com.mycompany.learningjava;
import java.util.Scanner;
/**
 *
 * @author Escobar
 */
public class CalcularLaRaiz {
  Scanner gsh = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner gsh = new Scanner(System.in);

    double num = 0;
    double resultado =0;

    System.out.println("Ingresa un número :");
    num = gsh.nextDouble();

    resultado = (double) Math.sqrt(num);
    System.out.println("La raíz de : "  +num+ "es" +resultado);

  }
}