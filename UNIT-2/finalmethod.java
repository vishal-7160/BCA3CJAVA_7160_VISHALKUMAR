class basepolicy{
	final void identity(){
		System.out.println("student vishal identify via biometrics.");
	}
}
class student extends basepolicy{
	void identity(){
		System.out.println("student");
	}
}
public class finalmethod{
	public static void main(String args[]){
		student s=new student();
		s.identity();
	}
}