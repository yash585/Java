/*Q1) Design a class for Bank. Bank Class should support following operations;
a. Deposit a certain amount into an account
b. Withdraw a certain amount from an account
c. Return a Balance value specifying the amount with details */
import java.util.Scanner;

class Bank
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ac no balance");
        String acno=sc.next();
        double bal=sc.nextDouble();
        double amt;
        int ch;
        do
        {
            System.out.println("\n1.Deposite\n2.Withdraw\n3.Balance inquirt\n");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1: System.out.println("Enter amt to deposit:");
                        amt=sc.nextDouble();
                        bal=bal+amt;
                        break;

                case 2: System.out.println("Enter amt to withdraw:: ");
                        amt=sc.nextDouble();
                        double t=bal;
                        if((bal-amt)<0)
                            System.out.println("Insuffient funds:");
                        else
                            bal=bal-amt;
                        break;

                case 3: System.out.println("\nac_no\tbalance");
                        System.out.println(acno+"\t"+bal);
                        break;

            }
        }while(ch<4);
    }
}