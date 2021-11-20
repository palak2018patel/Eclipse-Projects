package Tim;

public class Dog {
	
	public String name;
	public int age;
	static int count=0;///if public you can call by the object names tim,bill.but then you have to define this.count=count in the constructor
	public Dog(String name, int age) {
		 this.name=name;//use "this"for making different instances of a class
		 this.age=age;
		 count=count+1;
		//this.woof();   //you can put methods in constructors also. they will be executed as defined in the method body
	 }
	public  void speak() {
	System.out.println("Woof I am  " + this.name +"  and I am  "+ this.age+"  years old");

	}
	 public static void woof() {
		System.out.println("I can bark");
		}
	 
	 public static void main(String[] args) {
		 Dog tim=new Dog("tim", 9);
		 Dog bill = new Dog("bill",10);//static var,methods are called by class name
		 tim.speak();
		 System.out.println(Dog.count);// calling a static variable by class name
		 tim.woof();				//calling method by instance name	if method is not made static else  call by class name
		 //calling a static method by class name,-methods always need () parenthisis.
		 Dog.woof();
	/*public int get_age() {
	return this.age;///////////used when var are set private for a class.
	}
	public String get_name() {
	return this.name;
	}
	public void set_age(int age) {
		this.age=age;
	}
	public void set_name(String name) {
		this.name=name;*/
	}

}
