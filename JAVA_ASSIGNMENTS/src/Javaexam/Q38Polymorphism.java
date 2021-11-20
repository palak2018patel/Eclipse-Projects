package Javaexam;
public  class Q38Polymorphism {	
		static class Animal{
			public void animalSound() {
				System.out.println("The animal makes a sound");
			}
		}
			static class Pig extends Animal{
				public void animalSound() {
					System.out.println("The pig says: oink oink");
				}
			}
		
				static class Dog extends Animal{
					public void animalSound() {
						System.out.println("The dog says: woof woof");
					}
				}
		
		public static void main(String[] args) {	
		Animal myAnimal=new Animal();
		Animal myPig=new Pig();
		Animal myDog=new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}
