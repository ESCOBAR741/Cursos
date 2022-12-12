/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author denil
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);

        System.out.println("Ingresa el primer número ");
        Integer numero1 = buffer.nextInt();
        System.out.println("Ingresa el segundo número ");
        Integer numero2 = buffer.nextInt();
        System.out.println("Ingresa el tercer número ");
        Integer numero3 = buffer.nextInt();

        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);

        /* List arrayNumero = new ArrayList();  
        for (int i=0; i<3; i++ ) {
            System.out.println("Ingresa el número" +i);
            Integer intNumero = buffer.nextInt();
            System.out.println("Prueba Numero" +intNumero);
            arrayNumero.add(intNumero);
            System.out.println("Prueba Lista " +Arrays.toString(arrayNumero));
        }
            */
    }
    private static void calcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3) {
        Integer numeroMayor = numero1;

        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }
        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }

        System.out.println("El número mayor es: " + numeroMayor);
    }

    private static void calcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3) {
        Integer numeroMenor = numero1;

        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
        }
        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        }

        System.out.println("El número menor es: " + numeroMenor);
    }
    
}