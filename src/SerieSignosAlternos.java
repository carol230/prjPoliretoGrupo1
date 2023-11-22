/*Copyright (C) 2K23, grupo1
 * (grupo1Nombre), caro.ayala2605@gmail.com
 * Version 1.0
 */

public class SerieSignosAlternos {
    /*
     * showSerie muestra la serie
     * @param NroTerminos : numero de terminos para la serie
     */
    public void showSerie5(int NroTerminos){
        System.out.println();
        System.out.print("Ciclo for: ");
        for (int i=2;i<NroTerminos;++i){
            if(i==2){
                System.out.print(i+" ");
            }else if(i%2!=0){
                System.out.print(i+" ");
                i++;
            }
        }
        System.out.println();
        System.out.print("Ciclo doWhile: ");
        int i=2;
        do {
            if(i==2){
                System.out.print(i+" ");
            }else if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        } while(i<NroTerminos);
        System.out.println();
        System.out.print("Ciclo While: ");
        int j=2;
        while(j<NroTerminos){
            if(j==2){
                System.out.print(j+" ");
            }else if(j%2!=0){
                System.out.print(j+" ");
            }
            j++;
        }
    }
    public void showSerie6(int NroTerminos){
        System.out.println();
        System.out.print("Ciclo for: ");
        for (int i=1;i<NroTerminos;++i){
            System.out.print(i*i+" ");
        }
        System.out.println();
        System.out.print("Ciclo doWhile: ");
        int i=1;
        do {
            System.out.print(i*i+" ");
            i++;
        } while (i<NroTerminos);
        System.out.println();
        System.out.print("Ciclo While: ");
        int j=1;
        while(j<NroTerminos){
            System.out.print(j*j+" ");
            j++;
        }
    }
}
