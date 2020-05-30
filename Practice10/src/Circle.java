public class Circle extends GeometricObjectComparable{

        protected double radius;

        // Default constructor
        public Circle() {
            this(1.0, "white", 1.0);
        }

        // Construct circle with specified radius
        public Circle(double radius) {

            this.radius = radius;
        }

        // Construct a circle with specified radius, weight, and color
        public Circle(double radius, String color, double weight) {

            this.radius = radius;
        }

        // Getter method for radius
        public double getRadius() {
            return radius;
        }

        // Setter method for radius
        public void setRadius(double radius) {
            this.radius = radius;
        }


        // Override the equals() method defined in the Object class
        @Override
        public boolean equals(Object circle) {
            return this.radius == ((Circle)circle).getRadius();
        }

        @Override
        public String toString() {
            return "[Circle] radius = " + radius;
        }

        @Override
        public double getArea() {
            return radius * radius * 3.14;
        }

        @Override
        public double getPerimeter() {
            return 2 * radius * 3.14;
        }
}
