package week2.day4.assignments.methodoverload;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID is " + id);
	}

	public void getStudentInfo(int id, String name)
	{
		System.out.println("Welcome " + name + " with ID# " + id );
	}
	
	public void getStudentInfo(String email, int phoneNumber)
	{
		System.out.println("Student email address is " + email + " and Phone number is " + phoneNumber);
	}
	
	public static void main(String[] args) {
		
		Students s = new Students();
		s.getStudentInfo(9);
		s.getStudentInfo(9, "Revathy");
		s.getStudentInfo("revathy@testleaf.com", 1234567890);
	}
}
