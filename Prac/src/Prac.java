import java.util.*;
public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner Age = new Scanner(System.in);
		int a=Age.nextInt();
		System.out.println("Enter your gender:       ");
		Scanner Gender = new Scanner(System.in);
		String g=Gender.nextLine();
		System.out.println("Enter your citizenship: ");
		Scanner Citizenship = new Scanner(System.in);
		String c=Citizenship.nextLine();	
		if(a<21)
			System.out.println("The person is a minor.");
		else if( c=="India")
			{System.out.println("This person has voting rights.");			
			
		if (g=="Female") 
				System.out.println("The person is an adult female.");
			else
				System.out.println("The person is an adult male.");}
		else 
			System.out.println("This person doesnot have voting rights.");


		 Age.close();
		 Gender.close();
		 Citizenship.close();
		 
				
				
				
			
		


	}

}
