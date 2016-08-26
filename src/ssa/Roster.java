package ssa;

import java.util.ArrayList;
import java.util.Collections;

public class Roster {

public static void main(String[] args) {
	Roster roster = new Roster();
	roster.classRosterReport();
	
}
public void classRosterReport() {
		ArrayList<String> someStrings = new ArrayList<String>();
		
		
		
		someStrings.add("Evan");
		someStrings.add("Jarrett");
		someStrings.add("Karen");
		someStrings.add("Shaquil");
		someStrings.add("Aisha");
		someStrings.add("Daniel");
		someStrings.add("Kevin");
		someStrings.add("Joseph");
		someStrings.add("Li");
		someStrings.add("Stephen");
		someStrings.add("Stephen R.");
		someStrings.add("Peter");
		someStrings.add("Michael C.");
		someStrings.add("Reuben");
		someStrings.add("Dax");
		someStrings.add("Arun");
		someStrings.add("Michael S.");
		someStrings.add("Joshua");
		someStrings.add("Gabriel");
		someStrings.add("Jonathon");
		someStrings.add("Kyle");
		
		Collections.sort(someStrings);
		   for(String counter: someStrings){
				System.out.println(counter);
		   }
		   System.out.println();
		   System.out.println("Descending order");
		Collections.sort(someStrings, Collections.reverseOrder());
		 	for(String counter1: someStrings){
		 		System.out.println(counter1);

	}
}
}

