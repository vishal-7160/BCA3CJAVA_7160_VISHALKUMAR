/* MULTIPLE INHERITENCE USING INTERFACES*/
interface animal
{
	void lion();
}
interface dear extends animal{
	void dearsound();
}
class tiger implements dear{
	public void lion(){
		System.out.println(" lion chasing the dear for hunt");
	}
	public void dearsound(){
		System.out.println(" dear got hunted by the lion");
	}
}
public class multinterface{
	public static void main(String[] args)
	{
		tiger t = new tiger();
		t.lion();
		t.dearsound();
	}
}
	