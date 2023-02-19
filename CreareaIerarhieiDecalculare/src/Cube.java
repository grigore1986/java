// clasa Cube extinde clasa ThreeDimensionalShape si implementeaza metoda getArea() pentru calculul suprafetei cubului
// si metoda getVolume() pentru calculul volumului cubului
class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }
}
