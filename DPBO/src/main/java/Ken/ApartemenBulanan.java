package Ken;

public class ApartemenBulanan extends Apartemen {
    private float hargaBulanan;

	public ApartemenBulanan(int id, String name, String location, boolean availability, float hargaBulanan) {
		super(id, name, location, availability);
		this.hargaBulanan = hargaBulanan;
	}

    public float hitungBulanan(int bulan) {
    	return hargaBulanan * bulan;
    }    
    
    public void getDetails() {
    	super.getDetails();
    	System.out.println("Harga Bulanan" + hargaBulanan);
    }
}