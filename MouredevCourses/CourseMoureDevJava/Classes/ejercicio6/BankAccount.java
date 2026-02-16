

public class BankAccount{
    double balance;

    public void deposit(double balance){
        this.balance +=balance;
    }

    public void viewBalance(){
        System.out.println("Su saldo es de " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount client = new BankAccount();
        client.deposit(25000);

        client.viewBalance();
    }
}
