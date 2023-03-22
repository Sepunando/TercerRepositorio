
package ejerciciosguia4;

import java.util.Scanner;

public class GuiaEj3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese importe en euros:");
        int euros = leer.nextInt();
        String divisa;
        do {
        System.out.println("Ingrese moneda a convertir:(dolares, yenes o libras):");
        divisa = leer.next();
        } while (!divisa.equalsIgnoreCase("dolares") && !divisa.equalsIgnoreCase("yenes") && !divisa.equalsIgnoreCase("libras"));
        convertir(euros, divisa);
    }
    
    public static void convertir(int euros, String divisa) {
    if (divisa.equalsIgnoreCase("dolares")) {
        System.out.println(euros + "€ equivalen a " + (euros * 1.28611) + " U$S");
    } else if (divisa.equalsIgnoreCase("libras")) {
        System.out.println(euros + "€ equivalen a " + (euros * 0.86) + " £");
    } else {
        System.out.println(euros + "€ equivalen a " + (euros * 129.852) + " ¥");
    }    
    }    
}