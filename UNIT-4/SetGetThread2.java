// java program to set thread name and priority

class MyThread extends Thread{
	public void run(){
		System.out.println("Thread is running with name:" + Thread.currentThread().getName());
		System.out.println("Thread priority:"+Thread.currentThread().getPriority());
	}
}
public class SetGetThread2{
	public static void main(String args[]){
		Thread myThread=new Thread(new MyThread());
		
		myThread.setName("MyThreadNm");
		myThread.setPriority(Thread.NORM_PRIORITY);
		myThread.start();
		
		System.out.println("Main thread name:"+ Thread.currentThread().getName());
		System.out.println("Main thread priority:"+ Thread.currentThread().getPriority());
	}
}