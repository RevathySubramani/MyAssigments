package homeassignments.week1;

public class IsPrimeNumber {
	
	public static void main (String args[]) {
		
		int n = 19;
		int count = 0;
		
		for(int i = 1; i<=n; i++) {
			
			if(n%i==0){
				count = count+1;
			}
		}
			if (count >2){
				System.out.println(n + " is non-prime number");
			}
			else {
				System.out.println(n + " is a prime number");
			}
			
		}
}
