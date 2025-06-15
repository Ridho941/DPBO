package Ridho.DPBO;

public abstract class Kost {
	protected int kostId;
	protected String name;
	protected String location;
	protected boolean availability;

	public Kost(int kostId, String name, String location, boolean availability) {
		this.kostId = kostId;
		this.name = name;
		this.location = location;
		this.availability = availability;
	}

	public abstract void getDetails();

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public boolean isAvailability() {
		return availability;
	}

}
