class calculate
{
	void sum(int a, int b){
		System.out.println("sum of 2 is "+(a+b));
	}
	void sum(double a,double b,double c){
		System.out.println("sum of 3 is :"+(a+b+c));
}
}
public class overloading3{
	public static void main(String args [])
	{
		calculate m1=new calculate();
		m1.sum(10,20);
		m1.sum(10,20,30);
	}
}

		