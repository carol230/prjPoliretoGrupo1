import java.util.Scanner;

public class SerieSignosAlternos2 {

    public static void main(String[] args) {
        Scanner oSerieSignosAlternos2 = new Scanner(System.in);

        // Solicitar al usuario el número de términos/niveles/palabra a generar
        System.out.print("Ingrese el número de términos a generar: ");
        int n = oSerieSignosAlternos2.nextInt();

        // Generar la serie S2 usando un bucle for
        System.out.println("Serie S2 usando bucle for:");
        serieS2ConFor(n);

        // Generar la serie S2 usando un bucle do-while
        System.out.println("\nSerie S2 usando bucle do-while:");
        serieS2ConDoWhile(n);

        // Generar la serie S2 usando un bucle while
        System.out.println("\nSerie S2 usando bucle while:");
        serieS2ConWhile(n);

        oSerieSignosAlternos2.close();
    }

    // Método para generar la serie S2 usando un bucle for
    public static void serieS2ConFor(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print((2 * i + 1) + " 0 ");
        }
    }

    // Método para generar la serie S2 usando un bucle do-while
    public static void serieS2ConDoWhile(int n) {
        int i = 0;

        do {
            System.out.print((2 * i + 1) + " 0 ");
            i++;
        } while (i < n);
    }

    // Método para generar la serie S2 usando un bucle while
    public static void serieS2ConWhile(int n) {
        int i = 0;

        while (i < n) {
            System.out.print((2 * i + 1) + " 0 ");
            i++;
        }
    }
}