package Ridho.DPBO;

public class KostHarian extends Kost {
    private float hargaHarian;

	public KostHarian(int kostId, String name, String location, boolean availability, float hargaHarian) {
		super(kostId, name, location, availability);
		this.hargaHarian = hargaHarian;
	}
	
	public float hitungHarian(int hari) {
		return hargaHarian * hari;
	}
    
	@Override
	public void getDetails() {
		System.out.println("Kost Harian:");
        System.out.println("ID: " + kostId);
        System.out.println("Nama: " + name);
        System.out.println("Lokasi: " + location);
        System.out.println("Harga harian: " + hargaHarian);
        System.out.println("Tersedia: " + availability);
	}
}
