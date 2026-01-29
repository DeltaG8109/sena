public class BankAccountClass {
    public static void main(String[] args) {
        BankAccountObject account1 = new BankAccountObject();

        account1.deposit(45000.0);
        account1.deposit(20000);
        account1.deposit(-15);

        System.out.println(account1.getBalance());
        
        account1.withDraw(15000);
        account1.withDraw(10000);
        account1.withDraw(-1000000);
    }
}
