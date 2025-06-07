package Ridho.DPBO;

public class KostBulanan extends Kost {
    private float hargaBulanan;

    public KostBulanan(int kostId, String name, String location, boolean availability, float hargaBulanan) {
        super(kostId, name, location, availability);
        this.hargaBulanan = hargaBulanan;
    }

    public float hitungBulanan(int bulan) {
        return hargaBulanan * bulan;
    }

    public void getDetails() {
        System.out.println("Kost Bulanan:");
        System.out.println("ID: " + kostId);
        System.out.println("Nama: " + name);
        System.out.println("Lokasi: " + location);
        System.out.println("Harga bulanan: " + hargaBulanan);
        System.out.println("Tersedia: " + availability);
    }
}
