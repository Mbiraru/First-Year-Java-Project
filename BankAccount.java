package bankaccount;
import java.util.Scanner;
import java.util.Random;

public class BankAccount{
    private long accountNumber;
    private double deposit;
    private double balance;
    private double withdraw;
    private double amount ;
    private String FirstN;
    private String LastN;
    private int pin;
    public int n;
    public int rem;
  
    public void Accounter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name to create a new account");
        FirstN=sc.nextLine();
        System.out.println("Enter Last Name to create a new account");
        LastN=sc.nextLine();
        System.out.println("Enter amount to deposit to your account");
        amount=sc.nextDouble();
        System.out.println("Your account number is ");
        Random rand = new Random();
        n = rand.nextInt(1000000) + 1;
        System.out.println(n);
        System.out.println("Choose a pin number to use ");
        pin=sc.nextInt();
        System.out.println("Confirm pin number ");
        rem = sc.nextInt();
        do{
            System.out.println("Wrong pin");
            System.out.println("Please enter the correct pin");
            rem = sc.nextInt();
        }while(pin!=rem);
    }
    public void Creater(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter account number given to login into your account");
    accountNumber = sc.nextLong();
      do{
            System.out.println("Wrong account number");
            System.out.println("Please enter the correct account number");
            accountNumber = sc.nextLong();
        }while(accountNumber!=n);
    System.out.println("Enter pin to login into your account");
    pin=sc.nextInt();
      do{
            System.out.println("Wrong pin");
            System.out.println("Please enter the correct pin");
            pin = sc.nextInt();
        }while(pin!=rem);
    }
    public void Deposital(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter amount to deposit");
     deposit = sc.nextDouble();
     balance = balance + deposit;
     balance = balance + amount;
     System.out.println("Your balance is "+balance);
    }
    public void Withdrawable(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter amount to withdraw");
    withdraw = sc.nextDouble();
     if(withdraw>balance){
        System.out.println("Error...your withdrawal is greater than your balance.");
    }
     else{
      balance = balance - withdraw;
     System.out.println("Your balance is "+balance);   
     }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose what you want to do.");
        System.out.println("1 = Create Account");
        System.out.println("2 = Login");
        System.out.println("3 = Deposit");
        System.out.println("4 = Withdraw");
        System.out.println("5 = Exit");
        int choice = sc.nextInt();
        BankAccount acc1 = new BankAccount();
        do{
        switch(choice){
         case 1:
           acc1.Accounter();
           System.out.println("Continue or exit?");
           choice = sc.nextInt();
           break;
         case 2:
           acc1.Creater();
           System.out.println("Continue or exit?");
           choice = sc.nextInt();
           break;
         case 3:
           acc1.Deposital();
           System.out.println("Continue or exit?");
           choice = sc.nextInt();
           break;
         case 4:
           acc1.Withdrawable();
           System.out.println("Continue or exit?");
           choice = sc.nextInt();
           break;
         case 5:
         return;
         default:
             System.out.println("No choice like that");
             System.exit(0);
        }
        }
        while(choice>0);
}
}
