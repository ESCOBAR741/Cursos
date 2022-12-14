/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author denil
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);
        
        System.out.println("Ingresa primer número");
        Integer numero1 = buffer.nextInt();
        System.out.println("Ingresa segundo numero");
        Integer numero2 = buffer.nextInt();
        System.out.println("Ingresa tercer número");
        Integer numero3 = buffer.nextInt();
        
        calcularPromedio(numero1, numero2, numero3);
    }
    
    private static void calcularPromedio (Integer numero1, Integer numero2, Integer numero3) {
        Integer sumaTotal = numero1 + numero2 + numero3;
        Double promedio = Double.valueOf(sumaTotal)/3;
        System.out.println("Resultado " +promedio);
    }
}
