import java.util.*;
abstract class bank
{
    int accno;
    double bal;
    abstract void deposit(double amt);

    abstract void withdrawal(double amt);
}
class savings extends bank
{
    double rate,x=5000.0;int pos;
    String trans[],name,phone,user,ps,ac,no;
    savings(String name,String user,String ps,String phone,String no)
    {
        this.accno=accno;
        this.name=name;
        this.phone=phone;this.user=user;this.ps=ps;this.no=no;
        
    trans=new String[5];
    pos=-1;
    }
    public void deposit(double amt)
    {
        bal += amt;
        System.out.println("Amount debited - "+ amt);
        System.out.println("Current balance - "+bal);
    transaction("Amount deposited - " + amt +".Current balance - "+bal);
    }
    public void withdrawal(double amt)
    {
        if((bal-amt)>=10000)
        {
            bal -= amt;
            System.out.println("Amount credited - "+ amt);
            System.out.println("Current balance - "+bal);
        transaction("Amount credited - "+amt+".Current balance - "+bal);
        }
        else
        {
            System.out.println("Limit exceeded !");
        }
    }
    void intCalc()
    {
        bal += bal*rate*0.01;
    }
    public void transaction(String message)
    {
         
        if(pos<4)
        {
            trans[++pos]=message;
        }
        else
        {
            for(int i=0;i<4;trans[i]=trans[++i]);
            trans[4]=message;
        }
        

    }
       public void transfer(double x)
                               {
                                   if(x<=bal)
                                    {    withdrawal(x);
                                        System.out.println("Money successfully transfered"+x);
                                        transaction("Amount transferred - "+x+".Current balance - "+bal);
                                    }
                                    else if(x>bal)
                                        System.out.println("Money cannot be transfered,limit exceeded(limit is 5000.00");
                                    }
}

public class bank_system
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        savings cus[]=new savings[100];int pos=-1;
        String user,ps,no;
        int choice,i;
        double amt=0,x=5000.0;
     outer:   while(true)
        {
        System.out.println("========================");
        System.out.println(" BANK   OF    INDIA");
        System.out.println("========================");
        System.out.println("1.Create Account");
        System.out.println("2.Login");
        System.out.println("3.Exit");
        System.out.println("Enter choice :");
        choice=s.nextInt();
        switch(choice)
        {
            case 1:System.out.println("Enter name :");
                    String name=s.next();
                    System.out.println("Enter username :");
                    user=s.next();
                    System.out.println("Enter password :");
                    ps=s.next();
                    System.out.println("Contact No.(8 no. digits only) :");
                    String phn=s.next();
                    no=phn.substring(4,8);
                    cus[++pos]=new savings(name,user,ps,phn,no);
                    break;
             case 2:System.out.println("Username :");
                    user=s.next();
                    System.out.println("Password :");
                    ps=s.next();
                    for(i=0;i<=pos;i++)
                    {
                        if(ps.equals(cus[i].ps))
                        {
                            break;
                        }
                    }
                    if(i==pos+1)
                    {
                        System.out.println("Wrong username or password");
                        break;
                    }
                        while(true)
                    {
                    System.out.println("===================");
                    System.out.println(" My    Account ");
                    System.out.println("===================");
                    System.out.println("1.Deposit Money");
                    System.out.println("2.Transfer Money");
                    System.out.println("3.Last 5 transactions");
                    System.out.println("4.User Information");
                    System.out.println("5.Logout");
                    System.out.println("Enter choice :");
                    choice=s.nextInt();
                    switch(choice)
                    {
                        case 1:System.out.println("Enter amount :");    
                                amt=s.nextDouble();
                                s.nextLine();
                               cus[i].deposit(amt);
                               break;
                        case 2:System.out.println("Enter payee username :");
                                s.nextLine();
                               String usr=s.nextLine();
                               int k;
                               for(k=0;k<=pos;k++)
                               {
                                   
                                   if(usr.equals(cus[k].user))
                                   {
                                       break;
                                    }
                                }
                                if(k>pos)
                                {
                                    System.out.println("Payee username not found");
                                    break;
                                }
                                System.out.println("Enter amount ");
                                double amount = s.nextDouble();
                                s.nextLine();
                                cus[k].deposit(amount);
                                cus[i].transfer(amount);
                                break;
                         case 3:for(int j=0;(cus[i].pos==5)?(j<pos):(j<=pos);j++)
                                System.out.println(cus[i].trans[j]);
                                System.out.println("\n");
                                break;
                        case 4:System.out.println("Account holder's name -"+cus[i].name);
                               System.out.println("Account holder's username -"+ cus[i].user);
                               System.out.println("Account no -"+cus[i].no);
                               break;
                        case 5:continue outer;
                    }
                }

                case 3:System.exit(1);

}
}






    }
}