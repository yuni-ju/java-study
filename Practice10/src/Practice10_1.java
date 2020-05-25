
public class Practice10_1 {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);

        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(1,2);

        Circle circle = (Circle) GeometricObjectComparable.max(circle1, circle2);
        Rectangle rectangle = (Rectangle)GeometricObjectComparable.max(rectangle1, rectangle2);
        System.out.println("The max circle's area is "+ circle.getArea());
        System.out.println("The max rectangle's area is "+ rectangle.getArea());
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
