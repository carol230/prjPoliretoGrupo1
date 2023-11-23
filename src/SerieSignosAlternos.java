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
        System.out.print("\nCiclo for: ");
        int contador=0;
        for (int i=2;contador<NroTerminos;++i){
        if (i==2||(i%2!=0)){
            System.out.print(i+" ");
            contador++;
        }
    }
        System.out.print("\nCiclo doWhile: ");
        contador=0;
        int k=2;
        do{
        if(k==2||(k%2!=0)){
            System.out.print(k+" ");
            contador++;
        }
        k++;
        }while(contador<NroTerminos);
        System.out.print("\nCiclo While: ");
        contador=0;
        int j=2;
        while(contador<NroTerminos) {
        if (j==2||(j%2!=0)){
            System.out.print(j+" ");
            contador++;
        }
        j++;
        }
    }
    public void showSerie6(int NroTerminos){
        System.out.print("\nCiclo for: ");
        for (int i=1;i<NroTerminos;++i){
            System.out.print(i*i+" ");
        }
        System.out.print("\nCiclo doWhile: ");
        int k=1;
        do {
            System.out.print(k*k+" ");
            k++;
        } while (k<NroTerminos);
        System.out.print("\nCiclo While: ");
        int j=1;
        while(j<NroTerminos){
            System.out.print(j*j+" ");
            j++;
        }
    }
}
