public class Main {
    public static void main(String[] args) {

       Biblioteca biblioteca = new Biblioteca();
       biblioteca.addCarte(new Carte("Cartea unu"));
       biblioteca.addZiar(new Ziar("Ziarul unu"));
       biblioteca.addVideo(new Video("Videoul unul"));
       biblioteca.afisareContinutCarti();
       biblioteca.afisareContinutZiar();
       biblioteca.afisareContinutVideo();

       BibilotecaGenerica<Carte>bibilotecaGenerica = new BibilotecaGenerica<>();
       bibilotecaGenerica.addMedia(new Carte("Cartea doi"));
      bibilotecaGenerica.afisareaMedia();



    }
}