/*Copyright (C) 2K23, grupo1
 * (grupo1Nombre), sebasb1955@hotmail.com
 * Version 1.0
*/


 /*
  * se utilizará para leer la entrada del usuario.
 */

import java.util.Scanner;

public class serie11{
   
    /*
     * serie usando un bucle for.
    */

    public void procesofor(int numterminos) {
        int a = 2;
        for (int i = 1; i <= numterminos; i++) {
            a = i * (i + 1);
            System.out.print(" - " + a);
        }
    }

    /*
     * serie usando un bucle do while.
    */

    public void procesodowhile(int numterminos) {
        int a = 2;
        int i = 1;
        do {
            a = i * (i + 1);
            i++;
            System.out.print(" - " + a);
        } while (i <= numterminos);   
    }

    /* 
     * serie usando while
    */

    public void procesowhile(int numterminos){
        int a = 2;
        int i = 1;
        while (i <= numterminos) {
            a = i * (i + 1);
            i++;
            System.out.print(" - " + a);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        /*
         * Pedirle al usuario que ingrese por el terminal el numero "num" de elementos que se van a presentar.
        */

        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();

        /*
         * Serie usando un bucle for.
        */

        System.out.println("\nSerie usando bucle for:");
        serie11 oSerie11 = new serie11();
        oSerie11.procesofor(num);
        
        System.out.println("");

        /*
         * Serie usando un bucle do while.
        */

        System.out.println("\nSerie usando bucle do while:");
        oSerie11.procesodowhile(num);

        System.out.println("");

        /*
         * Serie usando un bucle while.
        */
        
        System.out.println("\nSerie usando bucle while:");
        oSerie11.procesowhile(num);
    }
}