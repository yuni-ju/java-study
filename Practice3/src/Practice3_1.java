import java.util.Scanner;

public class Practice3_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num=0;

        System.out.print("Enter the number of lines : ");
        num = input.nextInt();

        for(int i=1;i<=num;i++){

            for(int j=num-i;j>0;j--){
                System.out.printf("%3c",' ');
            }

            for(int k=i;k>1;k--){
                System.out.printf("%3d",k);
            }

            for(int k=1;k<=i;k++){
                System.out.printf("%3d",k);
            }

            for(int j=num-i;j>0;j--){
                System.out.printf("%3c",' ');
            }

            System.out.println();
        }


    }


}
