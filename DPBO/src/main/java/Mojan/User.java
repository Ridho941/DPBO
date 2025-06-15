package Mojan;

public abstract class User {
	protected String role;

	public User(String role) {
		super();
		this.role = role;
	}
	
	public abstract void tampilkanMenu();
}
