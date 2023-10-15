package homeassignments.week3;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberList1[] = {2,4,1,5,6,9};
		int numberList2[] = {1,7,3,4,9,0};
		
		List<Integer> numbers1 = new ArrayList<Integer>();
		List<Integer> numbers2 = new ArrayList<Integer>();
		
		for (Integer integer : numberList1) {
			numbers1.add(integer);
		}
		for (Integer integer : numberList2) {
			numbers2.add(integer);
		}
		
		System.out.println("###Common Values between the array###");
		for(int i=0; i<numbers1.size(); i++) {
			for(int j=0; j<numbers2.size(); j++) {
				if(numbers1.get(i)==numbers2.get(j)) {
					System.out.println(numbers1.get(i));
				}
			}
		}

	}

}
