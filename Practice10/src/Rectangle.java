public class Rectangle extends GeometricObjectComparable{
        private double width;
        private double height;

        public Rectangle() {
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        /** Return width */
        public double getWidth() {
            return width;
        }

        /** Set a new width */
        public void setWidth(double width) {
            this.width = width;
        }

        /** Return height */
        public double getHeight() {
            return height;
        }

        /** Set a new height */
        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public boolean equals(Object rect) {
            return this.width == ((Rectangle)rect).getWidth() &&
                    this.height == ((Rectangle)rect).getHeight();
        }

        @Override
        public String toString() {
            return "[rectangle] width: " + width + " height: " + height;
        }

        @Override
        public double getArea() {
            return width * height;
        }

        @Override
        public double getPerimeter() {
            return (width + height) * 2;
        }
}
