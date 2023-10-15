package homeassignments.week3;

import java.util.ArrayList;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int array[] = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> numbers = new ArrayList<Integer>();
		for (Integer integer : array) {
			numbers.add(integer);
		}
		numbers.sort(null);
		System.out.println(numbers);
		for(int i=0; i< numbers.size()-1; i++) {
			if(numbers.get(i)+1!= numbers.get(i+1)) {
				System.out.println(numbers.get(i)+1);
			}
		}
	}

}
