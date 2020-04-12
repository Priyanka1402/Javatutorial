/**
 * 
 */
/**
 * @author Priyanka_Devnani
 *
 */
package atmTransaction;

import java.util.Scanner;

public class AtmTransaction {
	 static Scanner sc = new Scanner(System.in);

	private static double Balance = 1000;
	static int transactionAmt;
	static int depositAmt;

	public static void main(String[] args) {
		Balance();
		Transaction();
		AnotherTransaction();

	}

	private static void AnotherTransaction() {

		// TODO Auto-generated method stub
		System.out.println("Do you want to perform another transaction (Y/N)");
		 sc = new Scanner(System.in);
		String userAction = sc.next();
		while (!userAction.equalsIgnoreCase("N")) 
		{
			if(userAction.equalsIgnoreCase("Y")) {
				Transaction ();
				AnotherTransaction();
			}}


		System.out.println("Thank You");


	}

	private static void Transaction() {
		// TODO Auto-generated method stub
		System.out.println("Do you want to perform a transaction (W/D)");
		sc = new Scanner(System.in);
		String userAction = sc.next();
		if(userAction.equalsIgnoreCase("W")) 
		{
			System.out.println("You have selected 'Withdrawal' option , Please enter withdrawal amount");
			transactionAmt = sc.nextInt();
			if(Balance >= transactionAmt) 
			{
				Balance = Balance - transactionAmt;
				System.out.println("Current Balance is "+Balance+"");}
			if(Balance < transactionAmt) 
			{
				System.out.println("Current Balance is "+Balance+" while is less than withdrawal amount ");}
		}
		else if(userAction.equalsIgnoreCase("D"))
		{
			System.out.println("You have selected 'Deposit' option , Please enter Deposit amount");
			depositAmt = sc.nextInt();

			Balance = Balance + depositAmt;
			System.out.println("Current Balance is "+Balance+"");

		}
		else {

			System.out.println("You have entered invalid choice");
		}

	}

	private static void Balance() {
		// TODO Auto-generated method stub
		System.out.println("Current Balance is "+Balance+"");

	}

}

