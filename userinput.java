// take a input from the user
import java.util.Scanner;
public class userInput{
	public static void main(String args[]){

	Scanner scn= new Scanner(System.in);
	System.out.println("enter a string:");
	String userInputstring = scn.nextLine();

	System.out.println("enter an integer:");
	int userinputInt= scn.nextInt();

	scn.close();
    System.out.println("you entered string:"+ userInputstring);
	System.out.println("you entered integer:"+ userinputInt);
	}
}
