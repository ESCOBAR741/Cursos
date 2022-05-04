/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tests;
import java.util.Scanner;
/**
 *k
 * @author Escobar
 */
public class NumeroParImpar {
Scanner a = new Scanner(System.in);
    
  public static void main(String[] args) {
      Scanner a = new Scanner(System.in);
      NumeroParImpar ejercicios = new NumeroParImpar();
      String opcion = "";

while (!opcion.equalsIgnoreCase("d")){
    System.out.println("\n");
    System.out.println("\033[0;35mBienvenido al Menú");
    System.out.println("Escoje una opción");
    System.out.println("a. Ejecutar el ejercicio 1, Calcular el grado del término algebraico");
    System.out.println("b. Ejecutar el ejercicio 2, Volumen del cono mediante números reales");
    System.out.println("c. Ejecutar el ejercicio 3, Promedio de notas");
    System.out.println("d. Salir");
    System.out.println(" ");
    System.out.println("Su opción es :");
    opcion = a.next();
  
    
    
    if (opcion.equalsIgnoreCase("a")){
    ejercicios.ejercicio1();
    }
       
    if (opcion.equalsIgnoreCase("b")){
    ejercicios.ejercicio2();
}

    if (opcion.equalsIgnoreCase("c")){
    ejercicios.ejercicio3();
    }
   }
  }

 public void ejercicio1(){
     //Opereción aritmética capaz de calcular el grado del término algebraico
     
      int base;
      int exponente; 
      int resultado;
      
      System.out.println("Ingresa la base");
      base = a.nextInt();
      System.out.println("Ingresa el exponente");
      exponente = a.nextInt();
      
      resultado = (int)Math.pow(base, exponente);
      System.out.println(base +"elevado a"+exponente+"es igual a"+ resultado );
      
 }

 
public void ejercicio2(){
     //Volumen del Cono
    
        final double PI = 3.141592654;
        double h;
        double r;
        double v;
        
            System.out.println("Volumen de Cono");
            System.out.println("Introduzca la altura en CM : ");
        h = a.nextDouble();
            System.out.println("Introduzca el radio en CM : ");
        r = a.nextDouble();
        v = ((PI*r*r*h)/3.0);
            System.out.println("El volumen del cono es: "+v+"cm^3"); 
}
   

public void ejercicio3(){
    //Cantidad de pares, Cantidad de impares y Número ganador
  int num;
  int xMenor = 10000;
  int xMayor = 0;
  int numX;
  
  
    System.out.println("Ingresa los dígitos");
    numX = a.nextInt();
    
    for(int i = 1; i<= numX; i++){
        System.out.println("Ingresa un número entero");
        num = a.nextInt();
        
        
        if(num > xMayor){
        xMayor = num;
        }
        
        if(num < xMenor){
        xMenor = num;
        }
    }
    System.out.println("El número mayor fué :" + xMayor);
    System.out.println("El número menor fué :" + xMenor);
    
    
    
    
    int cantP=0;
    int cantI=0;
    int cantT;
    int numY;
    String ganador;
    
    System.out.println("Ingresa los número enteros");
    cantT = a.nextInt();
    
    for(int i=1; i<= cantT; i++){
        System.out.println("Ingresa un dígito");
        numY = a.nextInt();
        
        if (numY % 2 ==0){
        cantP++;
        }
        else {
        cantI++;
    }
    }

ganador = (cantP > cantI?"pares":"impares");
System.out.println("Cantidad de números pares "+ cantP);
System.out.println("Cantidad de números impares " + cantI);
System.out.println("El número ganador es: 1" + ganador);



}
        
}