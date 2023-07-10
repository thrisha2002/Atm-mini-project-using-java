import java.util.Scanner;
public class Atm 
{
    public static void main(String[] args)
  {
     int debit,credit,balance=10000;
     Scanner scn=new Scanner(System.in);
     while(true)
     {
       System.out.println("select option 1 for debit");
       System.out.println("select option 2 for credit");
       System.out.println("select option 3 for checking balance");
       System.out.println("select option 4 for exit");
       System.out.println("select an option");
       int s=scn.nextInt();
       switch(s)
       {
        case 1:
        System.out.println("enter amount to be debited");
        debit=scn.nextInt();
        if(debit<=balance)
        {
            balance=balance-debit;
            System.out.println("amount debited successfully");
        }
        else
        System.out.println("insufficient balance");
        break;
        case 2:
        System.out.println("enter amount to be credited");
        credit=scn.nextInt();
        balance=balance+credit;
        break;
        case 3:
        System.out.println(balance);
        break;
        case 4:
        System.out.println("transcation completed successfully");
        System.exit(0);

       }

     }
 }
}
