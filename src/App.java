import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {
        Scanner oSerieSignosAlternos = new Scanner(System.in);
        System.out.println("Grupo: Uno");
        System.out.println("Integrantes: Ivonne Ayala, Leandro Alava, Lenin Amagandi, Alexis Bautista, Sebastian Bravo ");
        
        /**
    * Pedirle al usuario que ingrese por el terminal el numero "n" de elementos que se van a presentar en la susecion
    */
        System.out.print("Ingrese el número de términos a generar: ");
        int n = oSerieSignosAlternos.nextInt();

        // Llamar a los métodos de la clase SerieSignosAlternos
        System.out.println("SERIE 1");
        SerieSignosAlternos.fibonacciConFor(n);
        System.out.println("");
        SerieSignosAlternos.fibonacciConDoWhile(n);
        System.out.println("");
        SerieSignosAlternos.fibonacciConWhile(n);
        System.out.println("");
        // Llamar a los métodos de la clase SerieSignosAlternos2
        System.out.println("\nSERIE 2");
        SerieSignosAlternos2.serieS2ConFor(n);
        System.out.println("");
        SerieSignosAlternos2.serieS2ConDoWhile(n);
        System.out.println("");
        SerieSignosAlternos2.serieS2ConWhile(n);
        System.out.println("");
        
        System.out.print("Serie 5: ");
        SerieSignosAlternos.showSerie5(n);
        System.out.print("\nSerie 6: ");
        SerieSignosAlternos.showSerie6(n);

        System.out.println("");

        System.out.print("\nSerie 9: ");
        System.out.println("\nSerie usando bucle for:");
        serie09 oSerie09 = new serie09();
        oSerie09.procesofor(n);
        System.out.println("\nSerie usando bucle do while:");
        oSerie09.procesodowhile(n);
        System.out.println("\nSerie usando bucle while:");
        oSerie09.procesowhile(n);

        System.out.println("");

        System.out.print("\nSerie 10: ");
        System.out.println("\nSerie usando bucle for:");
        serie10 oSerie10 = new serie10();
        oSerie10.procesofor(n);
        System.out.println("\nSerie usando bucle do while:");
        oSerie10.procesodowhile(n);
        System.out.println("\nSerie usando bucle while:");
        oSerie10.procesowhile(n);

        oSerieSignosAlternos.close();
    }

        
    }

