import java.util.Scanner;

public class Practice2_2 {
    public static void main(String[] args){
        double num1, num2, num3;
        double max;
        double sum;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three edges (length in double): ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        sum = num1 + num2 + num3;

        //max 구하기
        max = num1;

        if(max < num2){
            if(num2 < num3){ //num3이 최대
                if(num3 < num1+num2){
                    System.out.println("The perimeter is "+ sum);
                }
                else{
                    System.out.println("Input is invalid");
                }
            }
            else{ //num2가 최대
                if(num2 < num1+num3){
                    System.out.println("The perimeter is "+ sum);
                }
                else{
                    System.out.println("Input is invalid");
                }
            }
        }
        else if(max < num3){
            if(num3 < num2) { //num2가 최대
                if(num2 < num1+num3){
                    System.out.println("The perimeter is "+ sum);
                }
                else{
                    System.out.println("Input is invalid");
                }
            }
            else{ //num3이 최대
                if(num3 < num1+num2){
                    System.out.println("The perimeter is "+ sum);
                }
                else{
                    System.out.println("Input is invalid");
                }
            }
        }
        else{ //num1이 최대
            if(num1 < num2+num3){
                System.out.println("The perimeter is "+ sum);
            }
            else{
                System.out.println("Input is invalid");
            }
        }



    }
}
