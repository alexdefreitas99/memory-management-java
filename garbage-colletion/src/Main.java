
public class Main {
	
	public static void main(String[] args) 
	{
		Runtime runtime = Runtime.getRuntime();

		System.out.println("Available memory: " + runtime.freeMemory() / 1024 + "k");

		Customer c;
		for (int i=0; i<1000000; i++)
		{
			c = new Customer("John");	
		}

		System.out.println("Available memory: " + runtime.freeMemory() / 1024 + "k");
		
		System.gc();

		System.out.println("Available memory: " + runtime.freeMemory() / 1024 + "k");
	}

	
}
