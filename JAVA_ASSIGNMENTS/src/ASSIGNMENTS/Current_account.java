package ASSIGNMENTS;
//import java.util.*;

public class Current_account extends BankAccount {
	double j=0;
	double wd=0;
	
@Override
double with_draw(double amount) {
	
	
	return  j=(Principal-(amount+(0.1*amount)));
}

 void display_withdraw_balance() {
	
	System.out.println("The balance amount after withdrawal of  is " + j);	
	
}
 public void Set_withdrawal_amount(double wd) {
	  this.amount=wd;
	    }

}
