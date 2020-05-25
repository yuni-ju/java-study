public abstract class GeometricObjectComparable implements Comparable {

    private String color = "white";
    private boolean filled;

    protected GeometricObjectComparable() {
    }

    protected GeometricObjectComparable(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public static Object max(Circle circle1, Circle circle2) {

        double c1, c2;

        c1 = circle1.getArea();
        c2 = circle2.getArea();

        if(c1 > c2)
            return circle1;
        else
            return circle2;

    }

    public static Object max(Rectangle rectangle1, Rectangle rectangle2) {

        Rectangle rectangle = new Rectangle();
        return rectangle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}
