package hit.classwork;

public class ThreadDemo1 {
	public static void main(String[] args) throws Exception{
		
		Thread t=Thread.currentThread();
		t.setName("this is my main thread...");
		t.setPriority(10);
		System.out.println("Now thread will sleep for 5 seconds...");
	
		System.out.println("start the class");	
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	static void vacinationCenter()throws Exception {
		System.out.println("method called...");
		Thread.sleep(5000);
	}
}

