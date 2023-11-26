
import java.util.Scanner;

public class serie09 {

    public void procesofor(int numterminos) {
        int a = 2;
        for (int i = 1; i <= numterminos; i++) {
            System.out.print(" - "+a);
            a += 2;
        }
    }
    public void procesodowhile(int numterminos) {
        int a = 2;
        int i = 1;
        do {
            System.out.print(" - "+a);
            a += 2;
            i++;
        } while (i <= numterminos);

    }

    // serie usando while
    public void procesowhile(int numterminos){
        int a = 2;
        int i = 1;
        while (i <= numterminos) {
            System.out.print(" - "+a);
            a += 2;
            i++;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();

        System.out.println("\nSerie usando bucle for:");
        serie09 oSerie09 = new serie09();
        oSerie09.procesofor(num);

        System.out.println("");
        
        System.out.println("\nSerie usando bucle do while:");
        oSerie09.procesodowhile(num);

        System.out.println("");

        //Serie usando un bucle while.
        System.out.println("\nSerie usando bucle while:");
        oSerie09.procesowhile(num);
        
    }
}