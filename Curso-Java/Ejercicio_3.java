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
public class Ejercicio_3 {
 
    public static void main(String[] args) throws IOException{

        System.out.println("Ingresa 1 numero ");
        Double numero = Double.valueOf(cargarNumero());

        //Boolean esPar = numero %2 == 0;
        Boolean esPar = (numero /2) == Math.round(numero /2);

        if (esPar) {
            System.out.println("El número es par");

        } else; {
            System.out.println("El número impar");
        }

    }
    
    private static Integer cargarNumero() throws IOException  {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }

}
