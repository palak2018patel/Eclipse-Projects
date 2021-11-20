package ASSIGNMENTS;
//Superclass
public class BankAccount {
	String accountHolder="";
	long accountno=0;
	int dateOfcreation;
	//private String userId;
	//private passWord;
	//private routing no;
	final long Principal=1500;
	double balance=1500;
	double remaining_balance;
	double amount;
	
	 void display_accountinfo() {
		System.out.println("The account "+this.accountno+" is of account holder "+this.accountHolder);		
	}
   double  with_draw(double amount) {
	   return (Principal-amount);}
	   
void display_withdraw_balance() {
	
	System.out.println("The amount after withdrawal is "+ (Principal-amount));		 
  }
   
  double deposit(double amount) {
	  
	  return (Principal+amount);
	  
  }

	//public void Setamount(double amount) {
		//  this.amount=amount;
		   // }
}
  
 
  