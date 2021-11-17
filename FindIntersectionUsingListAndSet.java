package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingListAndSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str1= {"one","Two","Three","Four","Five" };
		String[] str2= {"Two","Four","six" ,"Eight","Ten"};
		
		
		
		for (int i = 0; i < str1.length; i++) {
			
			for (int j = 0; j < str2.length; j++) {
				
				if (str1[i].equals(str2[j])) {
					
					System.out.println(str1[i]);
										
				}
			}
			
		}
	}

}
