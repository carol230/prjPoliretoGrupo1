/**
 * Serie8:  3, 8, 13, 18, 23, 28, 33, 38, ...
 * Esta clase genera y muestra la Serie8 utilizando diferentes ciclos.
 *@author: Alexis Bautista
 @version: 1.0
 */ 
public class Serie8 {

    /**
     * Metodo ciclo for 
     * @param nroTerminos
     */
    public void serie8For(int nroTerminos){
        for (int i = 1; i <= nroTerminos; i++) {
            System.out.print(3+5*(i-1)+"  ");
        }
    }

    /**
     * Metodo ciclo while
     * @param nroTerminos
     */
    public void serie8While(int nroTerminos){
        int i = 1;
        while (i <= nroTerminos) {
            System.out.print(3+5*(i-1)+"  ");
            i ++;
        }
    }

    /**
     * Metodo Do-While
     * @param nroTerminos
     */
    public void serie8Dowhile(int nroTerminos){
        int i=1;
        do {
            System.out.print(3+5*(i-1)+"  ");
            i ++;
        } while (i<=nroTerminos);
    }
}
