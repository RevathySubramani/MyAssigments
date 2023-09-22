package homeassignments.week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 10;
		int[] series = new int[range];
		
		// 0,1,1,2,3,5,8,13...
		
		System.out.println("*****Printing first 8 digits in Fibonacci Series*****");
		
		for (int i=0; i<range; i++) {
			
			if(i<2) {
			series[i]=i;
			System.out.println(series[i]);
			}
			
			else {
				series[i]=series[i-1] + series[i-2];
				System.out.println(series[i]);
			}
			
		}
	}
}