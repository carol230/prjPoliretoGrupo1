/*Copyright (C) 2K23, grupo1
 * (grupo1Nombre), kleyton.alava@epn.edu.ec
 * Version 1.0
 */

/**
"Scanner" se utilizará para leer la entrada del usuario.
*/
import java.util.Scanner;        

public class SerieSignosAlternos {
    
/**
* Metodo con el cual va ha iniciar el programa.
*/
    public static void main(String[] args) {       
        Scanner oSerieSignosAlternos = new Scanner(System.in);   // se crea un objeto llamado "scanner" para leer la entrada del usuario

/**
* Pedirle al usuario que ingrese por el terminal el numero "n" de elementos que se van a presentar en la susecion
*/
        System.out.print("Ingrese el número de términos a generar: ");
        int n = oSerieSignosAlternos.nextInt();

/**
* Generar la serie Fibonacci usando un bucle for
*/
        System.out.println("Serie  S1 Fibonacci usando bucle for:");
        fibonacciConFor(n);

/**
* Generar la serie Fibonacci usando un bucle do-while
*/
        System.out.println("\nSerie S1 Fibonacci usando bucle do-while:");
        fibonacciConDoWhile(n);

/**
* Generar la serie Fibonacci usando un bucle while
*/
        System.out.println("\nSerie S1 Fibonacci usando bucle while:");
        fibonacciConWhile(n);


/**
Damos por cerrado el objeto
*/
        oSerieSignosAlternos.close();        
    }

/**
Método para generar la serie Fibonacci usando un bucle for
*/

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

/** 
* Método para generar la serie Fibonacci usando un bucle do-while
*/
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

/**
 * Método para generar la serie Fibonacci usando un bucle while
*/

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
    public static void showSerie5(int NroTerminos){
        System.out.print("\nCiclo for: ");
        int contador=0;
        for (int i=2;contador<NroTerminos;++i){
        if (i==2||(i%2!=0)){
            System.out.print(i+" ");
            contador++;
        }
    }
        System.out.print("\nCiclo doWhile: ");
        contador=0;
        int k=2;
        do{
        if(k==2||(k%2!=0)){
            System.out.print(k+" ");
            contador++;
        }
        k++;
        }while(contador<NroTerminos);
        System.out.print("\nCiclo While: ");
        contador=0;
        int j=2;
        while(contador<NroTerminos) {
        if (j==2||(j%2!=0)){
            System.out.print(j+" ");
            contador++;
        }
        j++;
        }
    }
    public static void showSerie6(int NroTerminos){
        System.out.print("\nCiclo for: ");
        for (int i=1;i<NroTerminos;++i){
            System.out.print(i*i+" ");
        }
        System.out.print("\nCiclo doWhile: ");
        int k=1;
        do {
            System.out.print(k*k+" ");
            k++;
        } while (k<NroTerminos);
        System.out.print("\nCiclo While: ");
        int j=1;
        while(j<NroTerminos){
            System.out.print(j*j+" ");
            j++;
        }
    }
}
