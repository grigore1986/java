import java.util.List;

public class PrintareaListei<T> implements Runnable{
    private List<T>list;
    public PrintareaListei(List<T>list){
        this.list = list;
    }

    @Override
    public String toString() {
        return "Lista de printare este: "+ list;
    }

    @Override
    public void run() {
        for(T cuvint : list){
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println(cuvint);
        }

    }
}
/*
 În acest exemplu, am folosit generics pentru a face ca clasa PrintareaListei să poată lucra cu orice tip de listă.
 Astfel, clasa PrintareaListei poate primi orice tip de listă.
 În metoda run(), tipul generic T în declarația variabilei și am folosit-o pentru a afișa elementele listei.
 */