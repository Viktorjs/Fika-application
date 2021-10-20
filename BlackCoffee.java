import java.util.Random;

//the class BlackCoffee extends from the abstract class CoffeeAbstract
public class BlackCoffe extends CoffeeAbstract {
	// constructor for the energy of the type of coffee
	public BlackCoffe() {
		high = 40;
		low = 20;
		Random Bla = new Random();
		// generates a random value
		RandomEnergy = Bla.nextInt(high - low) + low;
	}

	// prints out how much energy the coffee has produced
	public String toString() {
		return "Blackcoffee with " + RandomEnergy + " energy is produced";
	}

}
