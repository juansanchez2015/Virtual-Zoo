import java.util.*;
public class LocalZoo {
	
	int totalEmployees = 0;
	private static LocalZoo lzoo = null;
	private ArrayList<Exhibit> ex = new ArrayList<Exhibit>();
	

	private LocalZoo(ArrayList<Exhibit> e) {
		 for (Exhibit nm : e) {
			ex.add(nm);
		 }  	
	}
	
	public static LocalZoo getLocalZoo(ArrayList<Exhibit> e) {
		if(lzoo == null) {
			lzoo = new LocalZoo(e);
		}
		return lzoo;
		
	}
	
	public String toString() {
		for(Exhibit zooExhibit : ex) {
			System.out.println(zooExhibit.toString());
		}
		return "";
		
	}

}
