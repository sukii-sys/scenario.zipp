class BankAccount{
    int accNumber;
    String holder;
    double balance;
    
    public BankAccount(int accNumber, String holder, double balance){
        this.accNumber = accNumber;
        this.holder = holder;
        this.balance = balance;
    }
    
    public void deposit (double amount){
        if (amount >0){
            balance += amount;
            System.out.println("\nSuccessfully Deposited Rs."+amount+" to "+holder+"'s account");
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw (double amount){
        if (amount >0 && amount <= balance){
            balance -= amount;
            System.out.println("\nSuccessfully Withdrawn Rs."+amount+" from "+holder+"'s account");
        }else if(amount>balance){
            System.out.println("Insufficient balance.");
        }else{
            System.out.println("Invalid withdrawal amount.");
        }
    }
    
    public void displayBalance(){
    System.out.println("\n--- Account Summary ---");
    System.out.println("Account Number :"+ accNumber);
    System.out.println("Account Holder :"+ holder);
    System.out.println("Current Balance : Rs."+ balance);
    System.out.println("-------------------------");
    }
}

public class Main{
    public static void main(String[]args){
        BankAccount acc1 = new BankAccount (23115, "John Doe", 5000.00);
        BankAccount acc2 = new BankAccount (23226, "Susan Smith", 7000.00);
        System.out.println("------ Initial Balance ------");
        acc1.displayBalance();
        acc2.displayBalance();
        System.out.println("\n------ Performing Operation ------");
        
        acc1.deposit(2050.00);
        acc1.withdraw(2000.00);
        
        acc2.deposit(2000.00);
        acc2.withdraw(4000.00);
        
        System.out.println("\n------ Final Balance ------");
        acc1.displayBalance();
        acc2.displayBalance();
    }
}