/*Copyright (C) 2K23, grupo1
 * (grupo1Nombre), kleyton.alava@epn.edu.ec
 * Version 1.0
 */

/**
"Scanner" se utilizará para leer la entrada del usuario.
*/
import java.util.Scanner;

public class Serie0102 {

    /**
     * Generar la serie Fibonacci usando un bucle for
     */
    public static void showSerie1(int n) {
        System.out.println("Serie S1 Fibonacci usando bucle for:");
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }

        /**
         * Generar la serie Fibonacci usando un bucle do-while
         */
        System.out.println("\nSerie S1 Fibonacci usando bucle do-while:");
        int j = 0, k = 1;
        int count = 0;
        do {
            System.out.print(j + " ");
            int temp = j;
            j = k;
            k = temp + k;  // Aquí se debe actualizar 'k' en lugar de 'b'
            count++;
        } while (count < n);

        /**
         * Generar la serie Fibonacci usando un bucle while
         */
        System.out.println("\nSerie S1 Fibonacci usando bucle while:");
        int count2 = 0;
        int d = 0, c = 1;

        while (count2 < n) {
            System.out.print(d + " ");
            int temp = d;
            d = c;
            c = temp + c;
            count2++;
        }
    }

    public static void showSerie2(int n) {

        System.out.println("\nSerie S2 usando bucle for:");
        for (int i = 0; i < n; i++) {
            System.out.print((2 * i + 1) + " 0 ");
        }

        System.out.println("\nSerie S2 usando bucle do-while:");
        int i = 0;

        do {
            System.out.print((2 * i + 1) + " 0 ");
            i++;
        } while (i < n);

        System.out.println("\nSerie S2 usando bucle while:");
        int j = 0;

        while (j < n) {
            System.out.print((2 * j + 1) + " 0 ");
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos a generar: ");
        int n = scanner.nextInt();
        showSerie1(n);
        showSerie2(n);
        scanner.close();
    }
}
