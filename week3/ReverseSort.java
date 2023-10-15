package homeassignments.week3;

import java.util.ArrayList;
import java.util.List;

public class ReverseSort {

	public static void main(String[] args) {
		
		String array[] = {"TCS", "Wipro", "CTS", "Accenture", "HCL"};
		List<String> companies = new ArrayList<String>();
		
		for (String companyList : array) {
			companies.add(companyList);
		}
		//get the size and print companies in reverse order
		int size = companies.size();	
		for(int i=size-1; i>=0; i--) {
			System.out.println(companies.get(i));
		}
		//to sort the companies in alphabetical order
		companies.sort(null);
		System.out.println(companies);

	}

}
