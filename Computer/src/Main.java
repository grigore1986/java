import edu.tekwill.academy.computer.components.Processor;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor("Celeron" ,"MS345", 5);
        System.out.println(processor.getMarca());
        processor.setMarca("Intel");
        System.out.println(processor.getMarca());
    }
}