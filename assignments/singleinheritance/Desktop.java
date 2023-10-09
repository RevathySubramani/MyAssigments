package week2.day4.assignments.singleinheritance;

public class Desktop extends Computer{
	
	public void desktopSize(int size)
	{
		System.out.println("Desktop Size is - "+ size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop d = new Desktop();
		d.desktopSize(55);
		d.computerModel("HP");
		
	}

}
