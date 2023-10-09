package week2.day4.assignments.methodoverride;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		super.deposit();
		System.out.println("Minimum deposit amount can be 0");
	}

	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		a.deposit();
		a.fixed();
		a.saving();

	}

}
