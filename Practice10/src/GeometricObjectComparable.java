public abstract class GeometricObjectComparable implements Comparable<GeometricObjectComparable> {

    private String color = "white";
    private boolean filled;

    /**Default construct*/
    protected GeometricObjectComparable() {
    }

    /**Construct a geometric object*/
    protected GeometricObjectComparable(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**Getter method for color*/
    public String getColor() {
        return color;
    }

    /**Setter method for color*/
    public void setColor(String color) {
        this.color = color;
    }

    /**Getter method for filled. Since filled is boolean,
     so, the get method name is isFilled*/
    public boolean isFilled() {
        return filled;
    }

    /**Setter method for filled*/
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**Abstract method findArea*/
    public abstract double getArea();

    /**Abstract method getPerimeter*/
    public abstract double getPerimeter();

    public static GeometricObjectComparable max(GeometricObjectComparable obj1, GeometricObjectComparable obj2) {
        if(obj1.compareTo(obj2)==1)
            return obj1;
        else
            return obj2;
    }

    @Override
    public int compareTo(GeometricObjectComparable obj) {
        if(this.getArea() == obj.getArea()) //compareTo 결과값 : 같으면 0, this가 작으면 -1, 크면 1
            return 0;
        else if(this.getArea() < obj.getArea())
            return -1;
        else
            return 1;
    }
}
