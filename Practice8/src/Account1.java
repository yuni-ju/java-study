import java.util.ArrayList;

public class Account1 extends Account{
    private String name;
    ArrayList<Transaction> list = new ArrayList<>();

    public Account1(String name, int id, double balance){
        super(id, balance);
        this.name = name;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        Transaction t = new Transaction('W',amount,getBalance(),"");
        list.add(t);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        Transaction t = new Transaction('D',amount,getBalance(),"");
        list.add(t);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getList() {
        return list;
    }

    public void setList(ArrayList<Transaction> list) {
        this.list = list;
    }
}
