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
        System.out.println("SERIE 1 y 2");
        SerieSignosAlternos.showSerie1(n);
        System.out.println("");
        SerieSignosAlternos.showSerie2(n);
        System.out.println("");

        System.out.print("\nSerie 5: ");
        serie5 oSerie5 = new serie5();
        oSerie5.showSerie5(n);
        System.out.println("");
        System.out.print("\nSerie 6: ");
        serie6 oSerie6 = new serie6();
        oSerie6.showSerie6(n);
        System.out.println();

        System.out.println("\nSerie 7:");
        Serie7 oSerie7 = new Serie7();
        System.out.println("\nSerie usando bucle for:");
        oSerie7.serie7For(n);
        System.out.println("\nSerie usando bucle while:");
        oSerie7.serie7While(n);
        System.out.println("\nSerie usando bucle do while:");
        oSerie7.serie7Dowhile(n);
        System.out.println("");

        System.out.println("\nSerie 8:");
        Serie8 oSerie8 = new Serie8();
        System.out.println("\nSerie usando bucle for:");
        oSerie8.serie8For(n);
        System.out.println("\nSerie usando bucle while:");
        oSerie8.serie8While(n);
        System.out.println("\nSerie usando bucle do while:");
        oSerie8.serie8Dowhile(n);
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

        System.out.println("");

        System.out.print("\nSerie 11: ");
        System.out.println("\nSerie usando bucle for:");
        serie11 oSerie11 = new serie11();
        oSerie11.procesofor(n);
        System.out.println("\nSerie usando bucle do while:");
        oSerie11.procesodowhile(n);
        System.out.println("\nSerie usando bucle while:");
        oSerie11.procesowhile(n);
        oSerieSignosAlternos.close();
    }
    }

