import java.util.Scanner;
import Addition.Ad;
import Subtraction.Sub;
import Multiplication.Mul;
import Division.Div;
import Modular.Mod;

public class ArithMain
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 1st number:");
		int n1=scn.nextInt();
		System.out.println("enter 2nd number:");
		int n2= scn.nextInt();
		
		Ad a= new Ad();
		a.calAd(n1,n2);
		a.dispAd();
		
		Sub s=new Sub();
		s.calSub(n1,n2);
		s.dispSub();
		
		Mul m =new Mul();
		m.calMul(n1,n2);
		m.dispMul();
		
		Div d=new Div();
		d.calDiv(n1,n2);
		d.dispDiv();
		
		Mod o=new Mod();
		o.calMod(n1,n2);
		o.dispMod();
	}
}
		