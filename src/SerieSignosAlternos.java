/*Copyright (C) 2K23, grupo1
 * (grupo1Nombre), kleyton.alava@epn.edu.ec
 * Version 1.0
 */

import java.util.Scanner;        // "Scanner" se utilizará para leer la entrada del usuario.

public class SerieSignosAlternos {
    public static void main(String[] args) {        //Metodo con el cual va ha iniciar el programa.
        Scanner oSerieSignosAlternos = new Scanner(System.in);   // se crea un objeto llamado "scanner" para leer la entrada del usuario

        // Pedirle al usuario que ingrese por el terminal el numero "n" de elementos que se van a presentar en la susecion
        System.out.print("Ingrese el número de términos a generar: ");
        int n = oSerieSignosAlternos.nextInt();

        // Generar la serie Fibonacci usando un bucle for
        System.out.println("Serie  S1 Fibonacci usando bucle for:");
        fibonacciConFor(n);

        // Generar la serie Fibonacci usando un bucle do-while
        System.out.println("\nSerie S1 Fibonacci usando bucle do-while:");
        fibonacciConDoWhile(n);

         // Generar la serie Fibonacci usando un bucle while
        System.out.println("\nSerie S1 Fibonacci usando bucle while:");
        fibonacciConWhile(n);
 

        oSerieSignosAlternos.close();        //Damos por cerrado el objeto
    }

    // Método para generar la serie Fibonacci usando un bucle for
    public static void fibonacciConFor(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }

    // Método para generar la serie Fibonacci usando un bucle do-while
    public static void fibonacciConDoWhile(int n) {
        int a = 0, b = 1;
        int count = 0;

        do {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            count++;
        } while (count < n);
    }

     // Método para generar la serie Fibonacci usando un bucle while
     public static void fibonacciConWhile(int n) {
        int a = 0, b = 1;
        int count = 0;

        while (count < n) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            count++;
        }
    }
}
