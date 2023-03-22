
package ejerciciosguia4;

import java.util.Scanner;

public class GuiaEj4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();
        String resultado = verificar(num);
        System.out.println("El numero " + num + resultado);
    }
    
    public static String verificar(int num) {
        String resultado;
        int contador = 0;
        for (int i = 1; i<= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            resultado = " es primo";
        } else {
            resultado = " no es primo";
        }
        return resultado;
    }
}