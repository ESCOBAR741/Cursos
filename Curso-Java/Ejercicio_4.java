/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learningjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

/**
 *
 * @author denil
 */
public class Ejercicio_4 {
    public static void main(String[] args) throws IOException{

        String resultado = "";
        int contador = 0;
        int numero = 1;

        while (contador < 100) {
            if (esPrimo(numero)) {
                resultado += numero + ", ";
                contador ++;
            }
            numero ++;
        }
        System.out.println("Los primeros 100 numeros primos son: " +resultado);
  }
  private static Boolean esPrimo(Integer numero) {
    Boolean esUnNumeroPrimo = true;

    for (int i=2 ; i < numero; i++) {

        //asi recorremos los multiplos de un número   Boolean esPar = numero % i ==0;
        if (numero % i ==0) {
            esUnNumeroPrimo = false;
        }
    }
    return esUnNumeroPrimo;
  }
}