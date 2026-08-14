class animal{
	String name="animal";
	void eat (){
		System.out.println("this animal eats food.");
	}
}
// subclass (child) inheriting aniamal
class Dog extends animal{
	void bark(){
		System.out .println("the Dog barks: woof! woof!");
	}
}
// main execution class
public class main{
	public static void main(String[] args){
		Dog myDog=new Dog();
		myDog.eat();
		myDog.bark();
	}
}