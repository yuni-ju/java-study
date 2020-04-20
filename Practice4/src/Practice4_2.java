public class Practice4_2 {

    public static boolean isPrime(int number){
        //소수판별
        int i = 2;

        if(number == 2){
            return true;
        }

        while(i< number){
            if(number%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

        int i=0;
        int count = 0;

        while(count < 120){

            if(!Practice4_1.isPalindrome(i) && isPrime(Practice4_1.reverse(i)) && isPrime(i)){
                System.out.print(i +" ");
                count++;
                if(count%10 == 0){
                    System.out.println();
                }
            }

            i++;
        }

    }

}
