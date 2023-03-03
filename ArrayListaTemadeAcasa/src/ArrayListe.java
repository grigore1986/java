import java.util.ArrayList;
public class ArrayListe {
    public static void main(String[] args) {
       ArrayList<String> listaLucruri = LucruriDeFacut();
        System.out.println(listaLucruri);
    }

    public static ArrayList<String> LucruriDeFacut() {
        java.util.ArrayList<String> listaLucruri = new java.util.ArrayList<String>();
        listaLucruri.add("Curatenie in casa");
        listaLucruri.add("Calcularea suprafetii acoperisului");
        listaLucruri.add("De facut cumparaturi");
        listaLucruri.add("De facut exercitiul la tema de ArrayList<>");
        return listaLucruri;

    }
}