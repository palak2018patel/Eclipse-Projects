package Abstraction.ASSIGNMENTS;

//import Abstractions.ASSIGNMENTS.Bike;

public class Car extends Bike {
	
	public  void honk() {
		System.out.println("I can honk honk");
	}
		
	
	@Override
	public
	void No_of_wheels() {
				System.out.println("Car has 4 wheels");
	}
	@Override
	public
	void seats() {
		System.out.println("Car has 5 seats");	//return 5;
	}
	@Override
	public
	void gears() {
			System.out.println("The car has 4 gears");
	}	
	//protected void propogation() {
		//System.out.println("car moves automatically after being started.");
	//}
	@Override
	public
	 void fuel_capacity() {
				System.out.println("The car has 50gallon fuel capacity");
	}	
	void turning_radius() {
	System.out.println(" The car has double turning radius");
	}
	final  static void start(Car c){
		 
		System.out.println("This is a start method for the car");		
}
		//protected static void stop(Vehicle c){
		//System.out.println("This is a stop method for the cars");
		//}
	public static void main(String args[]) {
	
			//Vehicle v=new Vehicle();//compilation error, cannot create an object of the abstract class
			Car jaguar=new Car ();
			Vehicle volkswagen=new Car();
			Bike jetson=new Bike();
			Vehicle hero=new Bike();//but you can create objects of the child class referencing the abstract parent class
	
			//and such a reference allows the new object to utilize only the inherited + override properties of the child class
			jaguar.seats();//and not the newly created properties of the child class.See volkswagen even though a car cannot access start function because it is referencing the parent class.
			jaguar.No_of_wheels();
			jaguar.navigationSystem();
			jaguar.gears();			//Vehicle v=new Vehicle():// Cannot create an object of the abstract class.-Compilation error
			
			jetson.No_of_wheels();
			jetson.fuel_capacity();
			jetson.seats();			
	        start( jaguar);
	        start ((Car) volkswagen);    //volkswagen is a car of Class Vehicle so will not have exception!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	        Car.start(null); 
	        
	     try {
		 	start((Car) jetson);          //jetson is a bike of Class Bike so will have exception
		 	start((Car)    hero   );       //hero is a bike of Class Vehicle so will have exception
		}catch ( ClassCastException Start  )
	     {
			System.out.println (Start.getMessage());
	     }
	try{ Bike ze=new Bike();
			start((Car)ze);}catch ( Exception e) {
			System.out.println (e.getMessage());    			
	}
	stop(jaguar);
	stop(hero);
	stop(volkswagen);
	stop(jetson);
	//start( jetson);
	//start( hero);
	//start( volkswagen);		
		
	//try{ Bike hero=new Bike();
	//Bike.start(hero);}catch ( Exception e) {
	//System.out.println (e.getMessage());

	}

		
	}

			

	
	
	
	
	



	
	




