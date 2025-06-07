package Ken;

public class ApartemenTahunan extends Apartemen {
	private float hargaTahunan;

	public ApartemenTahunan(int id, String name, String location, boolean availability, float hargaTahunan) {
		super(id, name, location, availability);
		this.hargaTahunan = hargaTahunan;
	}

	public float hitungTahunan(int tahun) {
		return hargaTahunan * tahun;
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();
		System.out.println("Harga Bulanan: " + hargaTahunan);
	}

}
