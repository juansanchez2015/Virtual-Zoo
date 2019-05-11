
public class Fish  extends Exhibit {
	
	
	private int numberOfAnimals = 1;
	private static int numberOfEmployees = 0;

	public Fish() {
		setNumberOfAnimals(getNumberOfAnimals()+1);
	}

	public int getNumberOfAnimals() {
		return numberOfAnimals;
	} 

	public void setNumberOfAnimals(int numberOfAnimals) {
		this.numberOfAnimals = numberOfAnimals;
	}
	
	public String toString() {
		return "Number of Animals in this exhibit: " + this.getNumberOfAnimals() + ". This exhibit is the Fish Exhibit, which has " + this.getNumberOfEmployees() + " Employees.";
	}
	
	
	public int numberOfAnimals() {
		numberOfAnimals++;
		
		return numberOfAnimals;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		Fish.numberOfEmployees = numberOfEmployees;
	}
	
	public int numberOfEmps() {
		numberOfEmployees++;
		
		return numberOfEmployees;
	}

}
