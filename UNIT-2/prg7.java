abstract class animal{
	public abstract void animalsound();
	
	public void sleep(){
		System.out.println("ZzZZzz");
	}
}
class dog extends animal{
	public void animalsound(){
		System.out.println("the dog says:woof..woof");
	}
}

public class prg7{
	public static void main(String args[]){
		dog d=new dog();
		d.sleep();
		d.animalsound();
	}
}
	