import java.io.*;

public class testthrows{
	static void readFile()throws IOException{
		FileReader file = new FileReader("vishal_notes.txt");
		BufferedReader br = new BufferedReader(file);
		System.out.println(br.readLine());
	}
	
	public static void main(String args[]){
		try{
			readFile();
		}catch(IOException e){
			System.out.println("caller handled file error for vishal:"+e.getMessage());
		}
	}
}