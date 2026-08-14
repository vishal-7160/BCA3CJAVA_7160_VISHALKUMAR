/*15. Write a java program to use Hierarchical inheritance*/
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
class cat extends animal{
	void meoow(){
		System.out.println("cat is meoow.");
	}
}

public class hirerchical
{
    public static void main(String args []){
    cat c=new cat();
    Dog d=new Dog();
    d.eat();
    d.bark();
    c.eat();
    c.meoow();
    }
}
