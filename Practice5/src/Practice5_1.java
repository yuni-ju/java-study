import java.util.Scanner;

public class Practice5_1 {

    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);

        //원소 개수 입력
        System.out.print("Enter the number of elements: ");
        num = input.nextInt();

        //원소 입력
        int[] arr = new int[num];
        System.out.print("Enter a list: ");
        for(int i=0;i<num;i++){
            arr[i]=input.nextInt();
        }

        //1step
        partition(arr);

        //출력
        System.out.print("After the partition, the list is ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void swap(int[] list,int a, int b){
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    public static int partition(int[] list){

        int pivotIndex=0;
        int pivot = list[0];
        int leftMark=1;
        int rightMark= list.length-1;

        while(true){

            if(pivot>list[leftMark]) leftMark ++;
            if(list[rightMark]>pivot) rightMark--;
            if(rightMark<=leftMark){
                swap(list,pivotIndex,rightMark);
                pivotIndex = rightMark;
                break;
            }

            if(pivot<=list[leftMark]&&list[rightMark]<=pivot){
                swap(list,leftMark,rightMark);
            }
        }

        return pivotIndex;
    }



}
