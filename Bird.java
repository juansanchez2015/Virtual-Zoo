
public class Bird  extends Exhibit {
	
	private int numberOfAnimals = 1;
	private static int numberOfEmployees = 0;

	public Bird() {
		setNumberOfAnimals(getNumberOfAnimals() + 1);
	}

	public int getNumberOfAnimals() {
		return numberOfAnimals;
	}

	public void setNumberOfAnimals(int numberOfAnimals) {
		this.numberOfAnimals = numberOfAnimals;
	}
	
	public String toString() {
		return "Number of Animals in this exhibit: " + this.getNumberOfAnimals() + ". This exhibit is the Bird Exhibit, which has " + this.getNumberOfEmployees() + ".";
	}
	
	public int numberOfAnimals() {
		numberOfAnimals++;
		return numberOfAnimals;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		Bird.numberOfEmployees = numberOfEmployees;
	}
	
	public int numberOfEmps() {
		numberOfEmployees++;
		
		return numberOfEmployees;
	}


}
