
package ejerciciosguia4;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese segundo numero:");
        int num2 = leer.nextInt();
        esmultiplo(num1, num2);
    }
    public static void esmultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El primer numero es multiplo del segundo");
        } else {
            System.out.println("El primer numero NO es multiplo del segundo");
        }
    }
}
