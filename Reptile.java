
public class Reptile extends Exhibit{
	
	private int numberOfAnimals = 1;
	private static int numberOfEmployees = 0;
	
	public Reptile() {
		numberOfAnimals();
	}

	public int getNumberOfAnimals() {
		return numberOfAnimals;
	}

	public void setNumberOfAnimals(int numberOfAnimals) {
		this.numberOfAnimals = numberOfAnimals;
	}
	
	public String toString() {
		return "Number of Animals in this exhibit: " + this.getNumberOfAnimals() + ". This exhibit is the Reptile Exhibit, which has " + this.getNumberOfEmployees() + ".";
	}
	
	public int numberOfAnimals() {
		numberOfAnimals += 1;
		
		return numberOfAnimals;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		Reptile.numberOfEmployees = numberOfEmployees;
	}
	
	public int numberOfEmps() {
		numberOfEmployees++;
		
		return numberOfEmployees;
	}
	

}
