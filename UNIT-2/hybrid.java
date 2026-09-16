class animal
{
	public void sound()
	{
		System.out.println("animal sound");
	}
	public void eat()
	{
		System.out.println("eats food");
	}
}
class cat extends animal
{
	public void catsound()
	{
		System.out.println("cat sound meow..");
	}
	public void drink()
	{
		System.out.println("cat drinks milk");
	}
}
interface petanimal
{
	public void cute();
	public void small();
}	
class puppy extends cat implements petanimal
{
	public void cute()
	{
		System.out.println(" puppy barks a lot");
	}
	public void small()
	{
		System.out.println("puppy plays");
	}
}
public class hybrid{
	public static void main(String args[])
	{
		puppy p = new puppy();
		p.sound();
		p.eat();
		p.cute();
		p.small();
		
	}
}
	