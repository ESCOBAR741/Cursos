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
public class Ejercicio_2 {
    public static void main(String[] args) throws IOException{

        System.out.println("Ingresa 1 numero ");
        Integer numero1 = cargarNumero();
        
        System.out.println("Ingresa 2 numero ");
        Integer numero2 = cargarNumero();

        System.out.println("Ingresa 3 numero ");
        Integer numero3 = cargarNumero();

        Integer sumatoria = numero1 + numero2 + numero3;
        Double numeroPromedio = Double.valueOf(sumatoria) /3;
        System.out.println("El número promedio es " +numeroPromedio);
    }


    private static Integer cargarNumero() throws IOException  {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }

}