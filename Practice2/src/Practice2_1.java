import java.util.Scanner;

public class Practice2_1 {
    public static void main(String[] args){
        int num;
        int temp;
        int result=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        num = input.nextInt();
        temp = num;

        while(temp>0){
            result *= (temp%10);
            temp /= 10;
        }

        System.out.print("The multiplication of all digits in "+ num + " is " + result);

    }
}
