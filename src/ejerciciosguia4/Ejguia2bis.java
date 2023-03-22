
package ejerciciosguia4;

import java.util.Scanner;

public class Ejguia2bis {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean respuesta;
        System.out.println("Ingrese numero:");
        int numero = leer.nextInt();
        respuesta = dirimir(numero);
        if (respuesta == true) {
            System.out.println("El numero " + numero + " es primo");
        } else {
            System.out.println("El numero " + numero + " NO es primo");
        }
    }

public static boolean dirimir(int numero) {
boolean respuesta;
int contador = 0;
    for (int i = 1; i <= numero; i++) {
        if (numero % i == 0) {
        contador++;
        } 
    }
if (contador == 2) {
    respuesta = true;
    } else {
    respuesta = false;
    }

return respuesta;
}
}

