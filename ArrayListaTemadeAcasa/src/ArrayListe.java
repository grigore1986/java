import java.util.ArrayList;
public class ArrayListe {
    public static void main(String[] args) {
        // Se obtine o instanta a ArrayList-ului cu obiecte String
       ArrayList<String> listaLucruri = LucruriDeFacut();
        // Se afiseaza lista cu lucruri de facut
        System.out.println(listaLucruri);
    }

    public static ArrayList<String> LucruriDeFacut() {
        // Se creeaza un nou ArrayList cu obiecte String
        java.util.ArrayList<String> listaLucruri = new java.util.ArrayList<String>();
        // Se adauga cateva elemente in ArrayList
        listaLucruri.add("Curatenie in casa");
        listaLucruri.add("Calcularea suprafetii acoperisului");
        listaLucruri.add("De facut cumparaturi");
        listaLucruri.add("De facut exercitiul la tema de ArrayList<>");
        // Se returneaza lista de lucruri de facut
        return listaLucruri;

    }
}