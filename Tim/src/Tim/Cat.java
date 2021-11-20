package Tim;

public class Cat extends Dog{

 
    int food;
	public Cat(String name, int age,int food) {
		super(name, age);
		this.food=food;
	}
	public Cat(String name,int food) {
		super(name,0);
	
		this.food=food;
	}
	public Cat(String name) {
		super(name,0);
	
		this.food=50;
	}
	
	
	public void speak() {;
		System.out.println("Meow my name is "+this.name +" and I am  "+this.age + " years old and I get fed "+this.food);
	}
	public int eat(int x) {
		return this.food-=x;
	}
		
	
	
	
	
	
	
public static void main(String[] args) {
	Cat tim= new Cat("tim",1,100);
	tim.speak();
	Cat bill= new Cat("bill",70);
	Cat joe=new Cat("joe");
	bill.speak();
	joe.speak();;
	Dog Duke=new Dog("Duke",4);
	Duke.speak();
	Dog Merlyn= new Dog("Merlyn",5);
	Merlyn.speak();
    
    
    
}
}
