package Day35;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Jack",1234567,310000);
        BankAccount b2=new BankAccount("Nally",234543,500000);
        b1.deposit(1000);
        b2.withdraw(300);
        b1.withdraw(2000);
        b2.deposit(356);
        System.out.println(b1);
        System.out.println(b2);
    }
}
