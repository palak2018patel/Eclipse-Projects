package trial;
import java.util.*;
import java.lang.*;
public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age: ");
		Scanner Age = new Scanner(System.in);
		int a=Age.nextInt();
		System.out.println("Enter your gender: ");
		Scanner Gender = new Scanner(System.in);
		String g=Gender.nextLine();
		System.out.println("Enter your citizenship: ");
		Scanner Citizenship = new Scanner(System.in);
		String c=Citizenship.nextLine();
	    
	    String votingRight;
	    
	    

		if(a<21) {
			System.out.println("The person is a minor.");
			}
			
		else votingRight =(c.equals("India") && g.equals("f"))?"Yes":"No";
		/*(c.equals("India") && g.equals("f")){
					System.out.println("The person is an adult female.");
					
				System.out.println("This person has voting rights.");	*/
				//}
			/*else if (c.equals("India") && g.equals("m")) {
				System.out.println("The person is an adult male.");
				System.out.println("This person has voting rights.");	
				}
		else 
			System.out.println("This person doesnot have voting rights.");*/


		 Age.close();
		 Gender.close();
		 Citizenship.close();
	 	

			
	}

}
