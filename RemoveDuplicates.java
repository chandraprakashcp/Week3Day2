package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String text = "We learn learn basics as part of java sessions in java week1";
		
		List values= new ArrayList();
		
		values.add("We");
		values.add("learn");
		values.add("learn");
		values.add("basics");
		values.add("as");
		values.add("part");
		values.add("of");
		values.add("java");
		values.add("sessions");
		values.add("in");
		values.add("java");
		values.add("week1");
		
		
		//System.out.println(values);
		
		
		//System.out.println(values.size());
		
		for (int i = 0; i < values.size(); i++) {
			
			for (int j = i+1; j < values.size(); j++) {
				
				if (values.get(i).equals(values.get(j))) {
					
					
					values.remove(j);
					System.out.println(values);
					
					
					
				} 
				
			}
			
		}
		
		
	}

}
