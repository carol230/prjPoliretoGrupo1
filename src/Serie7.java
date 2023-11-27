/**
 * Serie7:  1,  4,  7,  10,  13,  16,  19,  22,  25 ...
 * Esta clase genera y muestra la Serie7 utilizando diferentes ciclos.
 * 
 *@author: Alexis Bautista
 @version: 1.0

 */ 

public class Serie7 {
    /**
     * Metodo ciclo For
     * @param nroTerminos
     */
    public void serie7For(int nroTerminos){ 
        for (int i = 1; i <=nroTerminos; i++) {
            System.out.print(1+3*(i-1)+" ");
        }
    }
    
    /**
     * Metodo ciclo While
     * @param nroTerminos
     */
    public void serie7While(int nroTerminos){
        int i = 1;
        while (i <= nroTerminos) {
             System.out.print(1+3*(i-1)+" ");
             i++;
        }
    }

    /**
     * Metodo ciclo Do-While
     * @param nroTerminos
     */
    public void serie7Dowhile(int nroTerminos){
        int i = 1;
        do {
            System.out.print(1+3*(i-1)+" ");
            i ++;            
        } while (i<=nroTerminos);
    }
}