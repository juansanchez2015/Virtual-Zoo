import java.util.Random;

public class Sturgeon extends Fish {
	private int tagNumber;
	public static int count = 1;
	private String[] sex = {"male","female"};
	private String animalSex;
	Random number = new Random();

	public Sturgeon() {
		super();
		setAnimalSex(sex[number.nextInt(1)]);
		setNumberOfEmployees(getNumberOfEmployees() + 6);

		//setNumberOfAnimals(getNumberOfAnimals()+1);
		tagNumber = number.nextInt(999)+1;
		count++;
	}
	
	public int getTagNumber() {
		return tagNumber;
	}
	

	public String toString() {
		return "Sex: " + this.getAnimalSex() + " Tag Number: " + this.getTagNumber() + " Number of Animals in the Fish exhibit: " + getNumberOfAnimals()+ " Number of Employees " + getNumberOfEmployees();
	}

	public String getAnimalSex() {
		return animalSex;
	}

	public void setAnimalSex(String animalSex) {
		this.animalSex = animalSex;
	}
	
	
	

}
