package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values= new ArrayList<Integer>();
		
		values.add(1);
		values.add(2);
		values.add(6);
		values.add(8);
		values.add(4);
		values.add(3);
		values.add(5);
		values.add(9);

		
		Collections.sort(values);
	
		int temp= values.get(0);
		
		for (int i = 0; i < values.size(); i++) {
			
				if (temp != values.get(i)) {
					System.out.println(temp);
					
					break;
				}
				temp=temp+1;
				
			}
		
		
			}
			
		}
		
	


