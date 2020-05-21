import java.util.Scanner;

public class Practice9_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        int[] arr = new int[120];
        double rand;

        System.out.print("Enter an index : ");
        num = input.nextInt();

        for(int i=0;i<arr.length;i++){
            rand = Math.random();
            arr[i]=(int)(rand*10);
        }

        try{
            System.out.println("The element is "+arr[num]);
        }
        catch (Exception e){
            System.out.println("Index out of bound");
        }

    }

}
