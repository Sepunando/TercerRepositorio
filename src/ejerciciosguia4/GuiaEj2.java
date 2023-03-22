
package ejerciciosguia4;

import java.util.Scanner;

public class GuiaEj2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta = "SI";
        do {
            String resultado = funcion();
            System.out.println("Los datos ingresados corresponden a un " + resultado + " de edad");
            do {
                System.out.println("Desea continuar ingresando datos?");
                respuesta = leer.next();
            } while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO"));
            
        } while (respuesta.equalsIgnoreCase("SI"));
    }
    
    public static String funcion() {
        Scanner leer = new Scanner(System.in);
        String resultado;
        System.out.println("Ingrese nombre:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese edad:");
        byte edad = leer.nextByte();
        if (edad >= 18) {
            resultado = "mayor";
        } else {
            resultado = "menor";
        }
        return resultado;
    }
}
