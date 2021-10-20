import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

// the class People implements Runnable
public class People implements Runnable {

	String name;
	int energy;

	// creating new variable named x that takes the return value from the method
	// checkCoffee
	CoffeeAbstract x = CoffeMachine.checkCoffee();
	int exit = 5;

	// constructor with name and energy as parameters
	public People(String name, int energy) {
		this.name = name;
		this.energy = energy;
	}

	// setters and getters for name and energy
	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void run() {
		System.out.println(name + " energy level" + " is: " + energy + "%");
		// while-loop that checks if getEnergy is greater than 0
		while (getEnergy() > 0) {
			try {
				// for every second the person loses 10 energy
				Thread.sleep(1000);
				energy = getEnergy() - 10;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// if-statement that checks if getEnergy is less than 30
			if (getEnergy() < 30) {

				// while-loop that checks if getEnergy is lesser or equal to 100 and the
				// variable exit is 5
				while (getEnergy() <= 100 && exit == 5) {
					System.out.println(name + " has a energy level of " + energy + " and is in the coffee room");

					// if-statement that checks if the return value of checkCoffee is equal to null
					if (CoffeMachine.checkCoffee() == null) {
						System.out.println("The coffee machine is empty");
						// exits the loop
						exit = 0;
					} else {
						// pours a drink to the person and provides energy
						System.out.println(name + " is taking another cup of coffee");
						energy = x.getRandomEnergy() + energy;
						System.out.println(name + " gained " + x.getRandomEnergy() + " and has " + energy + " now");
					}

				}
				// if the persons energy level is greater or equal to 100 the person is working
				if (getEnergy() >= 100) {
					System.out.println(name + " is working");
				}
			}
	
			// if the persons energy level is less or equal to 0 the person goes home
			if (getEnergy() <= 0) {
				System.out.println(name + " is done and is going home");
				// terminates the program
				break;
			}


		}


	}

}
