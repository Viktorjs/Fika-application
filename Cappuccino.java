import java.util.Random;

// the class Cappuccino extends from the abstract class CoffeeAbstract
public class Cappuccino extends CoffeeAbstract {
	// constructor for the energy of the type of coffee
	public Cappuccino() {
		high = 30;
		low = 20;
		Random cap = new Random();
		// generates a random value
		RandomEnergy = cap.nextInt(high - low) + low;

	}

	// prints out how much energy the coffee has produced
	public String toString() {
		return "Cappuccino with " + RandomEnergy + " energy is produced";
	}

}
