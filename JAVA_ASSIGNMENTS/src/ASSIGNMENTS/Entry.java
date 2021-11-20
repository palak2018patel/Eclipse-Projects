package ASSIGNMENTS;

//import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String withdraw="withdraw";
		//String deposit="deposit";
		//String withdraw_current="w-c";
		//String withdraw_savings="w-s";
		//Scanner s=new Scanner(System.in);
		//Scanner s1=new Scanner(System.in);
		//System.out.println ("Type withdraw to withdraw or type deposit to deposit? "   );
		//String entered=s.next();
		
		//System.out.println("Deposit to current account or savings account?");
		/*if (withdraw==entered) {
			
			System.out.println("To withdraw from current account with 10% Extracharge type wc or type ws for savings account with no charge");
			String entered1=s1.next();
			if (entered1==withdraw_current) {
				BankAccount c= new Current_account();
				c.display_withdraw_balance();				  
			}
			else if(entered1==withdraw_savings) {
			
			
		}sc1.close();
		}
		
		
		 if (entered==deposit) {
						
		}sc.close();
		}	*/
		//double withdraw_amount=sc.nextDouble();
		
	BankAccount b= new BankAccount();
	b.accountHolder= "Palak";
	b.accountno=1234567890;
	b.dateOfcreation=10/13/2021;
	b.display_accountinfo();
  
	b.deposit(101);
	b.with_draw(10);
	
	BankAccount c= new Current_account();
	c.with_draw(10);   
	c.deposit(1001);
	// c.Setamount(10);
	c.display_withdraw_balance();
  
 
  
  


	}

}
