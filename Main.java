import java.util.Random;

// the main class that starts the program
public class Main {

// generates a random value for every created person
	static int high = 90;
	static int low = 30;
	static Random ran = new Random();
	static int peoplerandom = ran.nextInt(high - low) + low;
	static int peoplerandom1 = ran.nextInt(high - low) + low;
	static int peoplerandom2 = ran.nextInt(high - low) + low;

	public static void main(String[] args) {

		// creates an object of CoffeeMachine and calls it
		CoffeMachine machine = new CoffeMachine();

		// creates three different people containing paramaters for name and energy
		People Jonte = new People("Jonte", peoplerandom);
		People Oscar = new People("Oscar", peoplerandom1);
		People Mathias = new People("Mathias", peoplerandom2);

		// creating threads for the people
		Thread t1 = new Thread(Jonte);
		Thread t2 = new Thread(Oscar);
		Thread t3 = new Thread(Mathias);

		// starting the threads
		t1.start();
		t2.start();
		t3.start();

	}

}
