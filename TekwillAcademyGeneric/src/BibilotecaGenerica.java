import java.util.ArrayList;
import java.util.List;
//Clasa BibilotecaGenerica utilizează un generic T pentru a permite stocarea oricărui tip de media.
public class BibilotecaGenerica<T> {
    private List<T>listaMedia;
  //  Constructorul clasei initializează lista de media cu un ArrayList.
    public BibilotecaGenerica(){
        listaMedia = new ArrayList<>();
    }
    //Metoda addMedia primește ca parametru un obiect de tipul generic T și îl adaugă în lista de media.
    public void addMedia(T media){
      listaMedia.add(media);
    }
    //Metoda getListaMedia returnează lista de media.
    public List<T>getListaMedia(){
        return listaMedia;
    }
    // Metoda "afisareaMedia" este utilizată pentru a afișa informațiile despre toate elementele din listaMedia
    public  void afisareaMedia(){
        for(int i = 0; i < listaMedia.size(); i++) {
            T media = listaMedia.get(i);
            System.out.println(media);
        }
    }
}
