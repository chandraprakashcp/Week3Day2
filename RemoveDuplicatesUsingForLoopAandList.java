package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesUsingForLoopAandList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn learn basics as part of java sessions in java week1";
		
				
		String[] splittext= text.split(" ");
		
	for (int i = 0; i < splittext.length; i++) {
		for (int k = i+1; k < splittext.length; k++) {
			
			if (splittext[i].equalsIgnoreCase(splittext[k])) {
				splittext[k]="";
				
			}
			
		}
		
		System.out.println(splittext[i]);
	}
	}

}
