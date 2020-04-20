import java.util.Scanner;

public class Practice3_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        int rand;
        int win=0, comwin=0;
        String str = " ";
        String winner = " ";

        while(true) {

            //랜덤 숫자 생성
            rand = (int)(Math.random()*3);

            //매핑
            switch (rand){
                case 0:
                    str = "scissor.";
                    break;
                case 1:
                    str = "rock.";
                    break;
                case 2:
                    str = "paper.";
                    break;
            }
            System.out.println("computer is "+ str);

            //사용자 입력
            while(true) {
                System.out.print("scissor (0), rock (1), paper (2) : ");
                num = input.nextInt();
                if(0<=num && num <= 2){
                    break;
                }
                else{
                    System.out.println("숫자를 다시 입력해주세요");
                }
            }

            //가위바위보 승패 결정
            if(rand == 0 && num == 1) {
                win++;
                System.out.println("You won");
            }
            else if(rand == 1 && num == 2){
                win++;
                System.out.println("You won");
            }
            else if(rand == 2 && num == 0) {
                win++;
                System.out.println("You won");
            }
            else if(rand != num){
                comwin++;
                System.out.println("Com won");
            }

            //최종 승패 결정
            if(Math.abs(win-comwin)==2) {
                winner = win>comwin ? "You" : "Computer";
                break;
            }
        }

        System.out.println(winner+" won more than two times");

    }

}
