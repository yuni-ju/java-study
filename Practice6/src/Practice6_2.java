import java.util.Scanner;

public class Practice6_2 {

    public static void main(String[] args) {

        double x1,y1,x2,y2,x3,y3,x4,y4;

        System.out.println("첫번째 직선 위의 좌표 2개를 입력하세요");
        Scanner input = new Scanner(System.in);
        System.out.print("(x1, y1) : ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.print("(x2, y2) : ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        System.out.println("두번째 직선 위의 좌표 2개를 입력하세요");
        System.out.print("(x3, y3) : ");
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        System.out.print("(x4, y4) : ");
        x4 = input.nextDouble();
        y4 = input.nextDouble();

        //교차점의 좌표

        LinearEquation le = new LinearEquation(x1,y1,x2,y2,x3,y3,x4,y4);

        if(le.isSolvable()) {
            System.out.println("두 직선의 교차점 좌표 : (" + le.getX() + ", " + le.getY()+")");
        }else{
            System.out.println("교차점이 없습니다.");
        }



    }


}
