public class serie5 {
    public boolean esPrimo(int numero){
            for (int i=2;i<=numero/2;i++) {
                if (numero%i==0){
                    return false;
                }
            }
            return numero>1;
        }
    public void showSerie5(int NroTerminos){
        
        System.out.println("\nSerie usando bucle for: ");
        int contador=0;

        /*
        * Metodo ciclo For
        */
        for (int i = 2; contador < NroTerminos; ++i) {
            if(esPrimo(i)){
                System.out.print(i+" ");
                contador++;
            }
        }
    
        System.out.println("\nSerie usando bucle doWhile: ");
        /*
        * Metodo ciclo doWhile
        */
        contador=0;
        int k=2;
        do{
        if(esPrimo(k)){
                System.out.print(k+" ");
                contador++;
            }
        }while(contador<NroTerminos);
        System.out.println("\nSerie usando bucle while: ");
        /*
        * Metodo ciclo while
        */
        contador=0;
        int j=2;
        while(contador<NroTerminos) {
        if(esPrimo(j)){
                System.out.print(j+" ");
                contador++;
            }
            j++;
        }
    }
        
}
