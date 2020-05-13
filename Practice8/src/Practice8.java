import java.util.ArrayList;
import java.util.Scanner;

public class Practice8 {

    public static void main(String[] args) {

        ArrayList<Transaction> list;
        Account1 user1 = new Account1("George", 1122, 1000);
        user1.setAnnualInterestRate(1.65);

        user1.deposit(30);
        user1.deposit(40);
        user1.deposit(50);
        user1.withdraw(5);
        user1.withdraw(4);
        user1.withdraw(2);

        list = user1.getList();

        System.out.println("Name : " + user1.getName());
        System.out.println("Annual interest rate : " + Account1.getAnnualInterestRate());
        System.out.println("Balance : " + user1.getBalance());


        System.out.printf("%-35s%-10s%-10s%-10s\n","Date","Type","Amount","Balance");
        for(int i=0;i<list.size();i++){
            System.out.printf("%-35s%-10c%-10.1f%-10.1f\n",list.get(i).getDate().toString(),list.get(i).getType(),list.get(i).getAmount(),list.get(i).getBalance());
        }



    }
}
