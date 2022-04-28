import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner gsh = new Scanner(System.in);
        
    System.out.println("Bienvenido al centro de kinesiología");

    int i=1;
    
    int edad;
    double peso;
    double AcumP=0;
    int AcumE=0;
    double promE;
    double promP;

    while(i<7) { //Optimicé un poco el código para una mayor experiencia de usuario

        System.out.println("Ingrese la edad del " +i+ " paciente");
        edad = gsh.nextInt();
        System.out.println("Ingrese el peso del " +i+ " paciente");
        peso = gsh.nextDouble();
        
        AcumE+=AcumE+edad;
        AcumP+=AcumP+peso;
        i++;
    }

promE= AcumE/6;
promP= AcumP/6;

System.out.println("La suma acumulada de las edades es: " + AcumE);
System.out.println("El peso acumulado es: " + AcumP);
System.out.println("El promedio de las edades es " + promE);
System.out.println("El promedio del peso corporal " + promP);

System.out.println("Gracis por utilizar el sistema");

    }
}