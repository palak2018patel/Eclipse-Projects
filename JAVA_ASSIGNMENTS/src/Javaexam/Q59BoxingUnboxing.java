package Javaexam;

public class Q59BoxingUnboxing {

	public static void main(String[] args) {
		Integer obj=new Integer("123");	//Boxing
		int i=obj.intValue();			//Unboxing
		System.out.println(i);

	}

}
