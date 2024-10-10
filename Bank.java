import java.util.*;
public class Bank {
    private double bal=5000;
    private int pwd;
    public void deposit(double money)
    {
        System.out.print("Enter Password : ");
        Scanner sc=new Scanner(System.in);
        pwd=sc.nextInt();
        if(pwd==123)
        {
            bal=bal+money;
            System.out.println("Deposited Money : "+money);
            System.out.println("Total Balance : "+bal);

        }
        else{
            System.err.println("Incorrect Password ...");
        }
        
        sc.close();
    }
    public void withdraw(double money)
    {
        System.out.print("Enter Password : ");
        Scanner sc=new Scanner(System.in);
        pwd=sc.nextInt();
        if(pwd==123)
        {
            bal=bal-money;
            System.out.println("Withdrawn Money : "+money);
            System.out.println("Total Balance : "+bal);

        }
        else{
            System.err.println("Incorrect Password ...");
        }
        sc.close();
    }
    public void checkbal()
    {
        System.out.print("Enter Password : ");
        Scanner sc=new Scanner(System.in);
        pwd=sc.nextInt();
        if(pwd==123)
        {
            System.out.println("Total Balance : "+bal);

        }
        else{
            System.err.println("Incorrect Password ...");
        }
        sc.close();
    }
    
}
class customer{
    public static void main(String[] args)
    {
        Bank b=new Bank();
        int ch;
        double money;
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.print("\nEnter Your Choice : ");
        ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter the amount : ");
                money=sc.nextDouble();
                b.deposit(money);
                break;

            case 2:
                System.out.print("Enter the amount : ");
                money=sc.nextDouble();
                b.withdraw(money);
                break;
                
            case 3:
                b.checkbal();
                break;
        
            default:
                break;
        }
        sc.close();


    }
}
