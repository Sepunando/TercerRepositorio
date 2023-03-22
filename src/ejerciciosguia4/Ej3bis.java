
package ejerciciosguia4;

import java.util.Scanner;

public class Ej3bis {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String divisa;
        System.out.println("Ingrese cantidad de euros:");
        int euros = leer.nextInt();
        do {
        System.out.println("Ingrese divisa para hacer conversion:(dolares/libras/yenes");
        divisa = leer.next();
        } while (!divisa.equalsIgnoreCase("dolares") && !divisa.equalsIgnoreCase("libras") && !divisa.equalsIgnoreCase("yenes"));
        conversor(euros,divisa);
    }
    
    public static void conversor(int euros, String divisa) {
        if (divisa.equalsIgnoreCase("dolares")) {
            System.out.println(euros + " euros, son equivalentes a " + (euros * 1.28611) + " dolares");
        } else if (divisa.equalsIgnoreCase("libras")) {
            System.out.println(euros + " euros, son equivalentes a " + (euros * 0.86) + " libras");
        } else {
            System.out.println(euros + " euros, son equivalentes a " + (euros * 129.852) + " yenes");
        }
        
    }
    
}
