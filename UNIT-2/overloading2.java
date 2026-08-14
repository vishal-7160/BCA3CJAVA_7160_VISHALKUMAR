 import java.util.Scanner;
 class calculate
{
	void sum(int a, int b){
		System.out.println("sum of 2 is "+(a+b));
	}
	void sum(int a,int b,int c){
		System.out.println("sum of 3 is :"+(a+b+c));
}
}
public class overloading2{
	public static void main(String args [])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your first value:");
		int a= input.nextInt();
		System.out.println("please enter your second value:");
		int b=input.nextInt();
		System.out.println("please enter your third value:");
		int c=input.nextInt();
		
		calculate m1=new calculate();
		m1.sum(a,b);
		m1.sum(a,b,c);
	}
}

		