import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Carte> carti = new ArrayList<>();
    List<Video> videos = new ArrayList<>();
    List<Ziar> ziare = new ArrayList<>();

    public void addCarte(Carte carte) {
        carti.add(carte);

    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public void addZiar(Ziar ziar) {
        ziare.add(ziar);
    }

    public void afisareContinutZiar() {
        for (int i = 0; i < ziare.size(); i++) {
            System.out.println(ziare.get(i));
        }
    }
        public void afisareContinutCarti () {
            for (int i = 0; i < carti.size(); i++) {
                System.out.println(carti.get(i));
            }
        }
            public void afisareContinutVideo () {
                for (int i = 0; i < videos.size(); i++) {
                    System.out.println(videos.get(i));
                }
            }
        }



