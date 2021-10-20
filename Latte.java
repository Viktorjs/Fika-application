import java.util.Random;

//the class Latte extends from the abstract class CoffeeAbstract
public class Latte extends CoffeeAbstract {
	// constructor for the energy of the type of coffee
	public Latte() {
		high = 35;
		low = 25;
		Random Lat = new Random();
		// generates a random value
		RandomEnergy = Lat.nextInt(high - low) + low;

	}

	// prints out how much energy the coffee has produced
	public String toString() {
		return "Latte with " + RandomEnergy + " energy is produced";
	}

}
