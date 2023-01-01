/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author denil
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner buffer = new Scanner (System.in);
        
        System.out.println("Ingresa el número");
        Integer numero1 = buffer.nextInt();
                
        if(numero1 %2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        
    }
}
