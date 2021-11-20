package Abstraction.ASSIGNMENTS;//bike was put in another package for trial so default start function cannot be accessed. 

import Abstraction.ASSIGNMENTS.Vehicle;

public class Bike extends Vehicle {
	
	public  void honk() {
		System.out.println("I can honk");
	}
	
	@Override
	public
	void No_of_wheels() {
		System.out.println("Bike has 2 wheels");
}	
	@Override
	public
	void seats() {
		System.out.println("Bike  has 1 seat");
	}
	@Override
	public
	void gears() {
		System.out.println("The bike has 4 gears");		
	}
	void propogation() {
	System.out.println("Bike needs to be pedalled to move and hence is manual.");
}
	@Override
	public
	void fuel_capacity() {		
		System.out.println("The bike has 10 Gallon fuel capacity");
	}
	void Maxspeed() {
		System.out.println("The maximum speed this bike can reach is 15km/hr");
	}

//public static void main(String args[]) {
	
	
			//Car jaguar=new Car ();
			//Vehicle volkswagen=new Car();
			//Bike jetson=new Bike();
			//Vehicle hero=new Bike();
		
		
		
	

//}
}