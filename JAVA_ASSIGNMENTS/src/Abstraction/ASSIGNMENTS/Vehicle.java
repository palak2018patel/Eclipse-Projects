package Abstraction.ASSIGNMENTS;

public abstract class Vehicle {
public void No_of_wheels() {}
public void seats() {};
public void gears() {};
public void fuel_capacity() {};
public  void navigationSystem() {
	System.out.println("This vehicle has Navigation System"  );
}

  protected static void stop(Vehicle c) {
		System.out.println("This is a stop method for the cars");
 }
public abstract void honk() ;

Car c;

}
//}
//Vehicle v=new Vehicle();//cannot create objects in an abstract class


 


	

