import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de terminos a generar en las series: ");
        int nroTerminos = scanner.nextInt();

        System.out.println();
        System.out.println("SERIE 7");
        Serie7 oSerie7 = new Serie7();

        System.out.println("Serie con ciclo For");
        oSerie7.serie7For(nroTerminos);

        System.out.println();
        System.out.println("Serie con ciclo While");
        oSerie7.serie7While(nroTerminos);

        System.out.println();
        System.out.println("Serie con ciclo Do-While");
        oSerie7.serie7Dowhile(nroTerminos);

        System.out.println();
        System.out.println();
        System.out.println("SERIE 8");
        Serie8 oSerie8 = new Serie8();

        System.out.println("Serie con ciclo For");
        oSerie8.serie8For(nroTerminos);

        System.out.println();
        System.out.println("Serie con ciclo While");
        oSerie8.serie8While(nroTerminos);

        System.out.println();
        System.out.println("Serie con ciclo Do-While");
        oSerie8.serie8Dowhile(nroTerminos);

        scanner.close();
    }
}
