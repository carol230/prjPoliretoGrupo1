import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner oSerieSignosAlternos = new Scanner(System.in);
        Scanner oSerieSignosAlternos2 = new Scanner(System.in);
        System.out.println("Grupo: Uno");
        System.out.println("Integrantes: Ivonne Ayala, Leandro Alava, Lenin Amagandi, Alexis Bautista, Sebastian Bravo ");
        System.out.println("Ingrese el número de términos a generar en la SERIE 1 ");
        int n = oSerieSignosAlternos.nextInt();
        System.out.println("Ingrese el número de términos a generar en la SERIE 2 ");
        int a = oSerieSignosAlternos2.nextInt();
        

        // Llamar a los métodos de la clase SerieSignosAlternos
        System.out.println("SERIE 1");
        SerieSignosAlternos.fibonacciConFor(n);
        System.out.println("");
        SerieSignosAlternos.fibonacciConDoWhile(n);
        System.out.println("");
        SerieSignosAlternos.fibonacciConWhile(n);
        System.out.println("");
        oSerieSignosAlternos.close();


        // Llamar a los métodos de la clase SerieSignosAlternos2
        System.out.println("SERIE 2");
        SerieSignosAlternos2.serieS2ConFor(a);
        System.out.println("");
        SerieSignosAlternos2.serieS2ConDoWhile(a);
        System.out.println("");
        SerieSignosAlternos2.serieS2ConWhile(a);
        System.out.println("");
        oSerieSignosAlternos2.close();
        
    }

}
