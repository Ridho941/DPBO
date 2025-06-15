package Mojan;

public class Penyewa extends User {

	public Penyewa(String role) {
		super("Penyewa");
	}
	
	public void tampilkanMenu() {
        System.out.println("=== MENU USER ===");
        System.out.println("2. Lihat Kost");
        System.out.println("4. Lihat Apartemen");
        System.out.println("5. Lakukan Pembayaran");
        System.out.println("6. Lihat Riwayat");
        System.out.println("9. Keluar");
        System.out.print("Pilih: ");
	}
}
