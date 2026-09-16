public class TestFinally{
	public static void main(String args[]){
		try{
			System.out.println("vishal opening database connection..");
			int data=25/5;
			System.out.println("Data calculated:"+data);
		}catch(ArithmeticException e){
			System.out.println("Excetion caught.");
		}finally{
			System.out.println("FINALLY BLOCK: closing vishal's database connection guaranteed!");
		}
	}
}
