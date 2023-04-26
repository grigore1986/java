
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Declaram un array de animale
        Animale[] animals = {
                new Animale("Leu", "Carne"),
                new Animale("Straus", "Iarba"),
                new Animale("Strigoi", "Soarece"),
                new Animale("Gaine", "Graunte"),
                new Animale("Gorila", "Banane"),
                new Animale("Pinguin", "Peste"),
                new Animale("Delfin", "Peste"),

        };
//        // Declaram un Executor de Fir de Execuție Planificat cu un singur fir de execuție
//        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

         // Declaram un Executor de Fir de Execuție Planificat cu 3 fire
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);

        // Parcurgem arrayul de animale
        for (Animale animal : animals) {
            // Cream o sarcina (task) de alimentare pentru fiecare animal prin lambda
            Runnable task = () -> {
                System.out.println("Animalul " + animal.getNume() + " a fost hranit cu " + animal.getFood());
            };
            // Programam ca fie executata la fiecare 3 minute, incepand cu minutul zeru
            executorService.scheduleAtFixedRate(task, 0, 3, TimeUnit.MINUTES);
            // Asteptam 10 min ca taskurile sa se finalizaze
            executorService.shutdown();
            try{
                executorService.awaitTermination(10,TimeUnit.MINUTES);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
/*
    1. Creați un program care va alimentarea animalelor în grădina zoologica
    2. Pentru fiecare animal creați cate o sarcina de alimentare și afișați atunci cînd sarcina este executată
    3. Alimentați animalele fiecare 3 minute
 */