package Day6.usingFinal;

public class FinalMethodDemo {

	// constructor
		FinalMethodDemo() {
			System.out.println("This is a default constructor");
		}

		final int a = 50;

		// Final method
		final void show() {
			System.out.println("Value of a: " + a);
		}
	}