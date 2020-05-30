public class Practice10_2 {
    public static void main(String[] args) {
      GeometricObjectComparable[] objects = {new Square(2),new Circle(5),new Square(5),new Rectangle(3,4), new Square(4.5)};

      for(int i=0; i<objects.length;i++){
          if(objects[i] instanceof Circle)
              System.out.println("Area is " + ((Circle)objects[i]).getArea());
          else if(objects[i] instanceof Rectangle)
              System.out.println("Area is " + ((Rectangle)objects[i]).getArea());
          else if(objects[i] instanceof Square) {
              System.out.println("Area is " + ((Square) objects[i]).getArea());
              ((Square) objects[i]).howToColor();
          }
      }

    }

}
