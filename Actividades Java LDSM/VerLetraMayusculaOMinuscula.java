package com.mycompany.learningjava;
import java.util.Scanner;
/**
 *
 * @author Escobar
 */
public class VerLetraMayusculaOMinuscula {
  Scanner a = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner gsh = new Scanner(System.in);

    char letra;

    System.out.println("Ingresa una letra ");
    letra = gsh.next().charAt(0);

    if(Character.isUpperCase(letra)){
        System.out.println("Es una letra mayúscula");
    }

    else{
        System.out.println("No es una letra mayúscula");
    }
  }
}