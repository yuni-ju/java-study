public class Rectangle extends GeometricObjectComparable {

    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public boolean equals(Object rect) {
        return this.width == ((Rectangle) rect).getWidth() &&
                this.height == ((Rectangle) rect).getHeight();
    }

    @Override
    public String toString() {
        return "[rectangle] width: " + width + " height: " + height;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
