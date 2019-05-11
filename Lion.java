import java.util.Random;

public class Lion extends Mammal {
	private int tagNumber;
	public static int count = 1;
	private String[] sex = {"male","female"};
	private String animalSex;
	Random number = new Random();

	public Lion() {
		super();
		setAnimalSex(sex[number.nextInt(2)]);
		setNumberOfEmployees(getNumberOfEmployees() + 5);

		//setNumberOfAnimals(getNumberOfAnimals() + 1);
		tagNumber = number.nextInt(999)+1;
		count++;
	}
	
	public int getTagNumber() {
		return tagNumber;
	}
	

	public String toString() {
		return "\nSex: " + this.getAnimalSex() + " Tag Number: " + this.getTagNumber() + " Number of Animals in the Mammal exhibit: " + getNumberOfAnimals()+ " Number of Employees " + getNumberOfEmployees();
	}

	public String getAnimalSex() {
		return animalSex;
	}

	public void setAnimalSex(String animalSex) {
		this.animalSex = animalSex;
	}
	
	
	

}
