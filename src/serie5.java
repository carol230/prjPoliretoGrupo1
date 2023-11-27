public class serie5 {
    public void showSerie5(int NroTerminos){
        System.out.println("\nSerie usando bucle for: ");
        int contador=0;
        /*
        * Metodo ciclo For
        */
        for (int i=2;contador<NroTerminos;++i){
        if (i==2||(i%2!=0)){
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
        if(k==2||(k%2!=0)){
            System.out.print(k+" ");
            contador++;
        }
        k++;
        }while(contador<NroTerminos);
        System.out.println("\nSerie usando bucle while: ");
        /*
        * Metodo ciclo while
        */
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
        
}
