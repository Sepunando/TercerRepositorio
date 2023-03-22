
package ejerciciosguia4;

import java.util.Scanner;

public class GuiaEj1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese segundo numero:");
        int num2 = leer.nextInt();
        System.out.println("*** MENU ***");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        int opcion;
        do {
        System.out.println("Elija opcion:");
        opcion = leer.nextByte();
        switch(opcion) {
            case 1:
                int suma = sumar(num1, num2);
                System.out.println("La suma de ambos numeros es: " + suma);
                break;
            case 2:
                int resta = restar(num1, num2);
                System.out.println("La resta de ambos numeros es: " + resta);
                break;
            case 3:
                int multiplicacion = multiplicar(num1, num2);
                System.out.println("La multiplicacion de ambos numeros es: " + multiplicacion);
                break;
            case 4:
                int division = dividir(num1, num2);
                System.out.println("La division de ambos numeros es: " + division);
                break;                
            default:
                System.out.println("Opcion incorrecta!");
                break;
        }    
    } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);  
    }
    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma; 
    }
     public static int restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta; 
    }   
    public static int multiplicar(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion; 
    }
     public static int dividir(int num1, int num2) {
        int division = num1 / num2;
        return division; 
    }     
}
