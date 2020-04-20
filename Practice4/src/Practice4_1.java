import java.util.Scanner;

public class Practice4_1 {

    public static int reverse(int number){
        // Return the reversal of an integer, i.e. reverse(456) returns 654
        int reversal = 0;
        String numStr = Integer.toString(number);
        String revStr = "";

        for(int i=numStr.length()-1; i>=0 ;i--){
            revStr += numStr.charAt(i);
        }

        reversal = Integer.parseInt(revStr);

        return reversal;
    }

    public static boolean isPalindrome(int number){
        // Return true if number is a palindrome

        if(number == reverse(number))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        num = input.nextInt();

        if(isPalindrome(num)) {
            System.out.println("회문입니다");
        } else{
            System.out.println("회문이 아닙니다");
        }

    }
}
