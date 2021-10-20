import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CoffeeMachine {

	// creates and arraylist
	static ArrayList<CoffeeAbstract> coffeelist = new ArrayList<CoffeeAbstract>();

	// setters and getters for the arraylist
	public ArrayList<CoffeeAbstract> getCoffeelist() {
		return coffeelist;
	}

	public void setCoffeelist(ArrayList<CoffeeAbstract> coffeelist) {
		CoffeeMachine.coffeelist = coffeelist;
	}

	// constructor for the CoffeeMachine
	public CoffeeMachine() {

		// for-loop that adds 20 random coffees to the arraylist
		for (int i = 0; i < 20; i++) {
			CoffeeAbstract capuccino = new Cappuccino();
			CoffeeAbstract latte = new Latte();
			CoffeeAbstract blackCoffee = new BlackCoffee();
			int high = 4;
			int low = 1;
			Random cap = new Random();
			int capEnergy = cap.nextInt(high - low) + low;

			// if capEnergy is 1 add latte
			if (capEnergy == 1) {
				coffeelist.add(latte);
			}
			// if capEnergy is 2 add BlackCoffee
			if (capEnergy == 2) {
				coffeelist.add(blackCoffee);
			}
			// if capEnergy is 3 add Cappuccino
			if (capEnergy == 3) {
				coffeelist.add(capuccino);
			}

		}

		// for-loop that prints out every added coffee
		for (int j = 0; j < coffeelist.size(); j++) {
			System.out.println(coffeelist.get(j));
		}
	}

	// method that contains a for-loop that creates five random drinks
	public static void addfiveDrinks() {

		for (int i = 0; i < 5; i++) {
			CoffeeAbstract cappuccino = new Cappuccino();
			CoffeeAbstract latte = new Latte();
			CoffeeAbstract blackCoffee = new BlackCoffee();
			int high = 4;
			int low = 1;
			Random cap = new Random();
			int capEnergy = cap.nextInt(high - low) + low;

			if (capEnergy == 1) {
				coffeelist.add(latte);
			}
			if (capEnergy == 2) {
				coffeelist.add(blackCoffee);
			}
			if (capEnergy == 3) {
				coffeelist.add(cappuccino);
			}

		}
		
	}

	// creates a synchronized method that makes sure that threads don't collide
	public synchronized static CoffeeAbstract checkCoffee() {
		CoffeeAbstract coffeereturn;

		// sleep for two seconds when drinking
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// if-statement that returns null if the size is equal to 0
		if (coffeelist.size() == 0) {
			coffeereturn = null;
		} else {
			// else that returns the value of index[0] and deletes it
			coffeereturn = coffeelist.get(0);
			coffeelist.remove(0);
			int six = 6;
			int one = 1;
			Random ran = new Random();
			// creating a random value for 20% 
			int twentyprocent = ran.nextInt(six - one) + one;
			
			// if-statement that checks if the integer twentyprocent is equal to 3. 1-5 = 3 is 20%
			if (twentyprocent  == 5) {
				addfiveDrinks();
				System.out.println("Five new drinks has been added.");

			}

		}
		// returns the coffee
		return coffeereturn;

	}

}
