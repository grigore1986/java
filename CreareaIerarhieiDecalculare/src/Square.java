// clasa Square extinde clasa TwoDimensionalShape si implementeaza metoda getArea() pentru calculul suprafetei patratului
class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}