package com.mycompany.learningjava;
import java.util.Scanner;
/**
 *
 * @author Escobar
 */
public class PrubebaFormativa {
  Scanner gsh = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner gsh = new Scanner(System.in);

    System.out.println("Bienvenido al centro de kinesiología");

    //Variables
        int p1;
        int p2;
        int p3;
        int p4;
        int p5;
        int p6;
    
        double ph1;
        double ph2;
        double ph3;
        double ph4;
        double ph5;
        double ph6;
    
    //Operación aritmética
        System.out.println("Ingrese la edad del primer paciente");
            p1 = gsh.nextInt();
            System.out.println("Ingrese el peso del primer paciente");
                ph1 = gsh.nextDouble();
        System.out.println("Ingrese la edad del segundo paciente");
            p2 = gsh.nextInt();
            System.out.println("Ingrese el peso del segundo paciente");
                ph2 = gsh.nextDouble();
        System.out.println("Ingrese la edad del tercer paciente");
            p3= gsh.nextInt();
            System.out.println("Ingrese el peso del tercer paciente");
                ph3 = gsh.nextDouble();
        System.out.println("Ingrese la edad del cuarto paciente");
            p4 = gsh.nextInt();
            System.out.println("Ingrese el peso del cuarto paciente");
                ph4 = gsh.nextDouble();
        System.out.println("Ingrese la edad del quinto paciente");
            p5 = gsh.nextInt();
            System.out.println("Ingrese el peso del quinto paciente");
                ph5 = gsh.nextDouble();
        System.out.println("Ingrese la edad del sexto paciente");
            p6 = gsh.nextInt();
            System.out.println("Ingrese el peso del sexto paciente");
                ph6 = gsh.nextDouble();
    
    //Variables de resultado
        int x= p1+p2+p3+p4+p5+p6;
        Double y=ph1+ph2+ph3+ph4+ph5+ph6;
    
        double prom = x/6;
        double prom2 = y/6;
    
    //Resultados
    System.out.println("Suma acumulada de las edades " + x);
    System.out.println("El peso acumulado " + y);
    System.out.println("El promedio de las edades es " + prom);
    System.out.println("El promedio del peso corporal " + prom2); 

  }
}