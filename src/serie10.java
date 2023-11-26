/*Copyright (C) 2K23, grupo1
 * (grupo1Nombre), sebasb1955@hotmail.com
 * Version 1.0
*/



 /*
  * se utilizará para leer la entrada del usuario.
 */

 import java.util.Scanner;       

public class serie10{
   
    /*
     * serie usando un bucle for.
    */

    public void procesofor(int numterminos) {
        int a = 3;
        for (int i = 1; i <= numterminos; i++) {
            System.out.print(" - "+a);
            a *= 3;
        }
    }

    /*
     * serie usando un bucle do while.
    */
    
    public void procesodowhile(int numterminos) {
        int a = 3;
        int i = 1;
        do {
            System.out.print(" - "+a);
            a *= 3;
            i++;
        } while (i <= numterminos);
    }

    /* 
     * serie usando while
    */
    
    public void procesowhile(int numterminos){
        int a = 3;
        int i = 1;
        while (i <= numterminos) {
            System.out.print(" - "+a);
            a *= 3;
            i++;
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
        serie10 oSerie10 = new serie10();
        oSerie10.procesofor(num);
        
        System.out.println("");

        /*
         * Serie usando un bucle do while.
        */
       
        System.out.println("\nSerie usando bucle do while:");
        oSerie10.procesodowhile(num);

        System.out.println("");

        /*
         * Serie usando un bucle while.
        */
        
        System.out.println("\nSerie usando bucle while:");
        oSerie10.procesowhile(num);
    }
}