public class Elefant implements Animal {

    // implementăm metodele definite în interfața Animal
    @Override
    public void eat() {
        System.out.println("Elefantul maninca iarba si frunze");
    }

    @Override
    public void sunet() {
        System.out.println("Elefantul scoate sunete puternice");
    }


}
