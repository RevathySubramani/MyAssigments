package homeassignments.week3;

public class AbstractionClass implements DatabaseConnectionInterface{

	public static void main(String[] args) {
		DatabaseConnectionInterface db = new AbstractionClass();
		db.connect();
		db.disconnect();
		db.executeUpdate();

	}

	@Override
	public void connect() {
		System.out.println("Implementation for connect method");
	}

	@Override
	public void disconnect() {
		System.out.println("Implementation for disconnect method");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Implementation for execute update method");
	}

}
