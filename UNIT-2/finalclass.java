final class vishalsecuredata{
	void showdata(){
		System.out.println("secure confidential records for vishal");
	}
}

class hackdata extends vishalsecuredata{
	void show(){
		System.out.println("xyz");
	}
}
public class finalclass{
	public static void main(String args[]){
		hackdata h = new hackdata();
		h.showdata();
	}
}