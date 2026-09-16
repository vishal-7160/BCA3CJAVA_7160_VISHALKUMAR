import java.util.Scanner;

class calculate{
	int a,b;
	void add(){
		System.out.println(a+b);
	}
	void sub(){
		System.out.println(a-b);
	}
	void mul(){
		System.out.println(a*b);
	}
	void div(){
		System.out.println(a/b);
	}
	void mod(){
		System.out.println(a%b);
	}
}

class userinput extends calculate{
	
	void getval(){
		Scanner input=new Scanner(System.in);
		System.out.print("enter A value:");
			a=input.nextInt();
		System.out.print("enter B value:");
			b=input.nextInt();
	}
}

public class prg4{
	public static void main(String args []){
		userinput ui=new userinput();
		
		ui.getval();
		ui.add();
		ui.sub();
		ui.mul();
		ui.div();
		ui.mod();
	}
}
