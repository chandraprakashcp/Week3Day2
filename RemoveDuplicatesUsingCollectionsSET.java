package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingCollectionsSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn learn basics as part of java sessions in java week1";
		
		String[] splittext = text.split(" ");
		
		Set<String> text1= new LinkedHashSet<String>(Arrays.asList(splittext));
		for(String tempvaltext : text1 ) {
			
			
			System.out.println(tempvaltext);
		}
			
			
		
	}

}
