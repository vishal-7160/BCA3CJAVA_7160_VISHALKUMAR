//14. Write a java program to use multilevel inheritance.// 
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
class puppy extends Dog{
	void weep(){
		System.out.println("puppy is weeping.");
	}
}

public class multi{
	public static void main(String[] args){
		puppy p =new puppy();
		p.eat();
		p.bark();
		p.weep();
	}
}