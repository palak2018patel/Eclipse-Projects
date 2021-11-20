package Javaexam;

public class Q1Booleanabc {

	public static void main(String[] args) {
		boolean hasDriverLicense=false;
		boolean adult=true;
		boolean citizen=false;
		boolean is_eligible=(hasDriverLicense||adult)&&!citizen;
		System.out.println("Is Eligible for voting "+is_eligible);

	}

}
