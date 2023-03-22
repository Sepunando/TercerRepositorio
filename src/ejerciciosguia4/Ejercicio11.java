
package ejerciciosguia4;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase a convertir (finalizar con punto):");
        String frase = leer.nextLine();
        String retorno = codificar(frase);
        System.out.println("Frase convertida: " + retorno);
    }

    public static String codificar(String frase) {
    String conversion = "";
    int longitud = frase.length();
    for (int j = 0; j < longitud; j++) {
        String caracter = frase.substring(j, (j+1));
        if(!caracter.equals(".")){
            switch (caracter) {
                case "a":
                    String a = "@";
                    conversion = conversion.concat(a);
                    break;
                case "e":
                    String e = "#";
                    conversion = conversion.concat(e);
                    break;
                case "i":
                    String i = "$";
                    conversion = conversion.concat(i);
                    break;
                case "o":
                    String o = "%";
                    conversion = conversion.concat(o);
                    break;
                case "u":
                    String u = "*";
                    conversion = conversion.concat(u);
                    break;
                default:
                    conversion = conversion.concat(caracter);
                    break;                   
            }
        }
    } return conversion;
}
}
