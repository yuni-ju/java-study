import java.util.Scanner;

public class Practice6_1 {

    public static void main(String[] args) {

        double a,b,c,d,e,f;

        System.out.print("a,b,c,d,e,f를 순서대로 입력하세요: ");

        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        LinearEquation le = new LinearEquation(a,b,c,d,e,f);

        if(le.isSolvable()) {
            System.out.print("X = " + le.getX() + ", Y = " + le.getY());
        }else{
            System.out.println("the equation has no solution");
        }

    }

}
