package ASSIGNMENTS;
import java.util.*;

public class OddEven {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*System.out.println(" Enter a number:");
		
Scanner reader= new Scanner(System.in);
int number=reader.nextInt();

if (number%2==0)
	System.out.println(number+ "  is even.");
else
	System.out.println(number+ "  is odd.");
reader.close();
	
System.out.println("Number is odd or even checking complete");
}
}*/



		
			
		/*		System.out.println(" Enter a number:");
				Scanner reader= new Scanner(System.in);				
				String scanned = reader.next().toLowerCase();	
				
				if (!scanned.equals ("quit")) {
					int number=Integer.parseInt(scanned);
				
				  if(number%2==0)  
					System.out.println(number+ "  is even.");
				else
					System.out.println(number+ "  is odd.");}
				reader.close();			
				
				
		
			}
			
				}*/
	
	

Scanner reader= new Scanner(System.in);				
int number;
String scanned;
do{
	System.out.println(" Enter a number or type quit:");

 scanned = reader.next().toLowerCase();	
if (!scanned.equals ("quit")) {
	 number=Integer.parseInt(scanned);

  if(number%2==0)  
	System.out.println(number+ "  is even.");
else
	System.out.println(number+ "  is odd.");
  }
}while(!scanned.equals ("quit"));
reader.close();		



}

}

		
	






