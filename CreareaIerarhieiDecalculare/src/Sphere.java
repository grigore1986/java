// clasa Sphere extinde clasa ThreeDimensionalShape si implementeaza metoda getArea() pentru calculul suprafetei sferei
// si metoda getVolume() pentru calculul volumului sferei
class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }
}