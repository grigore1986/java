// clasa abstracta ThreeDimensionalShape este definita ca parinte pentru toate figurile geometrice spatiale
abstract class ThreeDimensionalShape extends Shape {
    // metoda abstracta getVolume() trebuie implementata de catre toate clasele care mostenesc aceasta clasa
    public abstract double getVolume();
}
