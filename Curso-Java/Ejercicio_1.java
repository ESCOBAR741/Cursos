/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learningjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author denil
 */
public class Ejercicio_1 {
    public static void main(String[] args) throws IOException{

        System.out.println("Ingresa 1 numero ");
        Integer numero1 = cargarNumero();
        
        System.out.println("Ingresa 2 numero ");
        Integer numero2 = cargarNumero();

        System.out.println("Ingresa 3 numero ");
        Integer numero3 = cargarNumero();

        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
//calcularNumeroMayor(70, 30, 10); De esta manera paso valores a la fuerza o variables


    }

    private static Integer cargarNumero() throws IOException  {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }

    /**
     * 
     * @param numero1
     * @param numero2
     * @param numero3
     */
    private static void calcularNumeroMayor(Integer numero1, Integer numero2,Integer numero3) {

        Integer numeroMayor = numero1;
        if (numero2 >= numeroMayor) {
            numeroMayor = numero2;
        } 
        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }
        System.out.println("El numero mayor es " +numeroMayor);
    }

    private static void calcularNumeroMenor(Integer numero1, Integer numero2,Integer numero3) {

        Integer numeroMenor = numero1;
        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
        }
        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        }
        System.out.println("El numero mayor es " +numeroMenor);

    }
}
