package Ken;
import Ridho.DPBO.Kost;

public class Booking {
	private Kost kost;
	private Apartemen apartemen;
	
	public Booking(Kost kost) {
		this.kost = kost;
        this.apartemen = null;
        this.kost.setAvailability(false);
	}
	
	public Booking(Apartemen apartemen) {
		this.apartemen = apartemen;
        this.kost = null;
        this.apartemen.setAvailability(false);
	}
	
	 public void detailBooking() {
	        if (kost != null) {
	            System.out.println("Booking Kost:");
	            kost.getDetails();
	        } else if (apartemen != null) {
	            System.out.println("Booking Apartemen:");
	            apartemen.getDetails();
	        }
	    }
	
}
