class MySyncThread extends Thread{
	private String threadName;
	private SharedRecourse sharedResourse;
	
	public MySyncThread(String threadName,SharedRecourse sharedResourse){
		this.threadName=threadName;
		this.sharedResourse= sharedResourse;
	}
	public void run(){
		sharedResourse.printNumbers(threadName);
	}
}
class SharedRecourse
{
	public synchronized void printNumbers(String threadName){
		for(int i=1;i<=5;i++){
			System.out.println(threadName+":"+i);
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Thread complete...");
	}
}
public class SyncThread
{
	public static void main(String args[]){
		SharedRecourse sharedResourse=new SharedRecourse();
		
		MySyncThread thread1=new MySyncThread("Thread-1",sharedResourse);
		MySyncThread thread2=new MySyncThread("Thread-2",sharedResourse);
		
		thread1.start();
		thread2.start();
	}
}