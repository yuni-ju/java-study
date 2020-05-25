public class Circle extends GeometricObjectComparable {

    protected double radius;

    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public boolean equals(Object circle) {
        return this.radius == ((Circle) circle).getRadius();
    }

    @Override
    public String toString() {
        return "[Circle] radius = " + radius;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
