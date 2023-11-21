import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner oSerieSignosAlternos = new Scanner(System.in);

        System.out.println("Grupo: Uno");
        System.out.println("Integrantes: Ivonne Ayala, Leandro Alava, Lenin Amagandi, Alexis Bautista, Sebastian Bravo ");
        System.out.println("Ingrese el número de términos a generar ");
        int n = oSerieSignosAlternos.nextInt();

        // Llamar a los métodos de la clase SerieSignosAlternos
        SerieSignosAlternos.fibonacciConFor(n);
        System.out.println("");
        SerieSignosAlternos.fibonacciConDoWhile(n);

        oSerieSignosAlternos.close();
        
    }

}
