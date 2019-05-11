import java.util.*;
public class Main {
	String name;

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		ArrayList<Exhibit> exhibits = new ArrayList<Exhibit>();
		Reptile croc = new Crocodile();
		Reptile alli = new Alligator();
		Mammal lion = new Lion();
		Mammal tiger = new Tiger();
		Fish stur = new Sturgeon();
		Fish shark = new Shark();
		Bird eagle = new Eagle();
		Bird crow = new Crow();


		exhibits.add(croc);
		exhibits.add(alli);
		exhibits.add(lion);
		exhibits.add(tiger);
		exhibits.add(stur);
		exhibits.add(shark);
		exhibits.add(eagle);
		exhibits.add(crow);

		
		
		LocalZoo zoo = LocalZoo.getLocalZoo(exhibits);
		System.out.println(zoo.toString());
	}

}
