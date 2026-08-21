/* WRITE A JAVA PROGRAM TO DEMONSTRATE ENCAPSULATION */

public class encapsulation
{
	private String name;
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	public static void main(String args[]){
		encapsulation emp= new encapsulation();
		emp.setname("vishal");
		System.out.println("employee name:"+emp.getname());
	}
}