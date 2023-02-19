// clasa Circle extinde clasa TwoDimensionalShape si implementeaza metoda getArea() pentru calculul suprafetei cercului
class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
