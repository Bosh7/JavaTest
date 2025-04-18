public class ThreadsExample1 {
	public static void main(String argv[]){	
		Thread t1 = new HelloThread("Amy");
		t1.start();
		
	
		for (int i=1; i<=100; i++) {
			System.out.println("Main:Hello "+i);
		}
	}
}
