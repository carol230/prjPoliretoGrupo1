
public class App {
    public static void main(String[] args) throws Exception {
        //scanner funcion 
        SerieSignosAlternos oSerieSignosAlternos = new SerieSignosAlternos();

        System.out.println("Grupo: Uno");
        System.out.println("Integrantes: Ivonne Ayala, Leandor Alava, Lenin Amagandi, Alexis Bautista, Sebastian Bravo ");

        System.out.print("Serie 5: ");
        oSerieSignosAlternos.showSerie5(9);
        System.out.println();
        System.out.print("Serie 6: ");
        oSerieSignosAlternos.showSerie6(9);
    
    }
}
