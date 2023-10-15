package homeassignments.week3;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] array = {3,2,11,9,5,1,10,25};
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (Integer num : array) {
			numbers.add(num);
		}
		numbers.sort(null);
		System.out.println("The numbers in ascending order: " + numbers);
		int size = numbers.size();
		System.out.println("Second largest number is " + numbers.get(size-2));
	}

}
