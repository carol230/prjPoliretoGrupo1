public class serie6 {
    public  void showSerie6(int NroTerminos){
        System.out.println("\nSerie usando bucle for: ");
        /*
        * Metodo ciclo For
        */
        for (int i=1;i<NroTerminos;++i){
            System.out.print(i*i+" ");
        }
        System.out.println("\nSerie usando bucle doWhile: ");
        /*
        * Metodo ciclo doWhile
        */
        int k=1;
        do {
            System.out.print(k*k+" ");
            k++;
        } while (k<NroTerminos);
        System.out.println("\nSerie usando bucle while: ");
        /*
        * Metodo ciclo while
        */
        int j=1;
        while(j<NroTerminos){
            System.out.print(j*j+" ");
            j++;
        }
    }
}
