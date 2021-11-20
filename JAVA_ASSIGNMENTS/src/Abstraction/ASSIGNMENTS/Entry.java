package Abstraction.ASSIGNMENTS;

//import Abstractions.ASSIGNMENTS.Bike;

public class Entry {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jaguar=new Car();
		jaguar.seats();
		jaguar.No_of_wheels();
		jaguar.navigationSystem();
		jaguar.gears();
		//jaguar.start("vehicle");
		
		
		//Vehicle v=new Vehicle():// Cannot create an object of the abstract class.-Compilation error
			//Bike Jackson=new Bike();
			//Vehicle Jackson = new Bike();
			//Jackson.No_of_wheels();
			//Jackson.fuel_capacity();
			//Jackson.seats();			
			//Jackson.start(Jackson); 
		
			
			
			Car merc=new Car ();
			Vehicle volkswagen=new Car();
			Bike jetson=new Bike();
			Vehicle hero=new Bike();
			jetson.No_of_wheels();
			jetson.fuel_capacity();
			jetson.seats();		
		//Vehicle.stop(hero);
		//Vehicle.stop(new Car());
		//Vehicle.stop(new Bike());
		
		
	hero.stop(hero);
	jetson.stop(jetson);
	merc.stop(merc);
	volkswagen.stop(volkswagen);
	
	try {	Vehicle myCar= new Car();
			Vehicle myBike= new Bike();	
	//v=(Bike)v;
			myCar.honk();
			myBike.honk();		
			honk(myCar);
			honk(myBike);} 
		catch (Exception e)
			{
			System.out.println("Exception"+e.getMessage());}
			}
	
		public static  void honk(Vehicle v) {
			v=(Car)v;
			System.out.println("I can honk honk honk");
		}
	}
	


	


