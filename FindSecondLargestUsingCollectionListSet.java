package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.github.dockerjava.api.model.Link;

public class FindSecondLargestUsingCollectionListSet {
	
	public static void main(String[] args) {
		
		List values = new ArrayList();
		
		values.add("21");
		values.add("51");
		values.add("61");
		values.add("71");
		values.add("31");
		values.add("41");
		values.add("11");
		values.add("91");
		values.add("71");
		values.add("81");
		
		
		Collections.sort(values);
		
		System.out.println(values.get(values.size()-2));
		
	}

}
