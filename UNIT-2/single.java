//13. Write a java program to perform simple inheritance.//
class animal{
	String name="animal";
	void eat (){
		System.out.println("this animal eats food.");
	}
}
class Dog extends animal{
	void bark(){
		System.out .println("the Dog barks: woof! woof!");
	}
}
public class single{
	public static void main(String[] args){
		Dog myDog=new Dog();
		myDog.eat();
		myDog.bark();
	}
}