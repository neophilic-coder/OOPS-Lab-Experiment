package Balance;

public class Account {
		double amt;
		public void Display_Balance(){
			System.out.println("Account balance: "+amt);
		}
		public Account(double amt){
			this.amt=amt;
		}
}
package Balanc;
import Balance.Account;
public class Bank {
	public static void main(String[] args) {
		Account acc = new Account(45000.00);
		acc.Display_Balance();
	}
}
