public class HelloThread extends Thread {
	String name;

	public HelloThread(String n)  {
		name = n;
	}

	public void run() {
		for (int i=1; i<=100; i++) {
			System.out.println(name+":Hello "+i);
		}
	}
}
