package Ken;

public class ApartemenHarian extends Apartemen{
	private float hargaHarian;

	public ApartemenHarian(int id, String name, String location, boolean availability, float hargaHarian) {
		super(id, name, location, availability);
		this.hargaHarian = hargaHarian;
	}
	
	public float hitungHarian(int hari) {
		return hargaHarian * hari;
	}
	
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Harga Harian: " + hargaHarian);
	}
}
