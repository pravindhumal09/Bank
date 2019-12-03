import java.util.Scanner;
//import bfs.transaction.*;

public class Bank //extends Transactions
{
@SuppressWarnings("unused")
public static void main(String args[])
{
	int cid,ch;
	Scanner sc=new Scanner(System.in);
	int[] cust_id = new int[]{101,102,103,104,105,106,107,108,109};
	int[] balance= new int[]{1000,2000,4400,4321,5432,7890,9988,7654,7865};
	
	System.out.println("Welcome to XYZ bank:");
	System.out.println("Enter ur customer id:");
	cid=sc.nextInt();
	System.out.println("Your account balance is"+balance[cid%10]);
	while(true)
	{
		System.out.println("Welcome to XYZ bank:");
		System.out.println("Enter ur customer id:");
		cid=sc.nextInt();
		System.out.println("Your account balance is"+balance[cid%10]);
		System.out.println("Enter ur Choice:-\n1.Deposit\n2.Withdraw\n3.Fund Transfer\4.Exit");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter the amount to deposit:");
			int amt=sc.nextInt();
			if(amt<=49999)
			{
				balance[cid%10]=balance[cid%10]+amt;
			}
			System.out.println("Amount"+amt+"credited successfully");
			System.out.println("Balance="+balance[cid%10]);
			break;
		case 2:
			System.out.println("Enter the amount to withdraw");
			amt=sc.nextInt();
			if(amt<=balance[cid%10])
			{
				balance[cid%10]=balance[cid%10]-amt;
				System.out.println("Amount"+amt+"Debited successfully");
				System.out.println("Balance="+balance[cid%10]);
			}
			break;
		case 3:
			System.out.println("Enter the customer id:");
			int rcid=sc.nextInt();
			System.out.println("Enter the amount to transfer:");
			amt=sc.nextInt();
			if(amt<=49999)
			{
				balance[cid%10]=balance[cid%10]-amt;
				balance[rcid%10]=balance[rcid%10]+amt;
			}
			System.out.println("Amount"+amt+"credited to"+rcid+"  successfully");
			System.out.println("Balance="+balance[cid%10]);
			break;
		case 4:
			    sc.close();
			   System.exit(0);
			
		}
	}
}
}
