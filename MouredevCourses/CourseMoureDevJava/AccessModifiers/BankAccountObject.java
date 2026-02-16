public class BankAccountObject {
    
    private double balance = 0;

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Deposito correctamente " + amount + " Su saldo es de: " + this.balance +".");
        }else{
            System.out.println("Error en el deposito.");
        }
    }
    
    public double getBalance(){
        return balance;
    }

    public void withDraw(double amount){
        if(amount < 0){
            System.out.println("Monto inválido para retiro.");
            return;
        }
        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println("Retiro de " + amount + "\nRetiro Completado. " + "\nSu saldo actual es de " + this.balance + ".");
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

}
