package Mojan;

public class Admin extends User{

	public Admin(String role) {
		super("Admin");
	}
	
	public void tampilkanMenu() {
        System.out.println("=== MENU ADMIN ===");
        System.out.println("1. Tambah Kost");
        System.out.println("2. Lihat Kost");
        System.out.println("3. Tambah Apartemen");
        System.out.println("4. Lihat Apartemen");
        System.out.println("5. Lakukan Pembayaran");
        System.out.println("6. Lihat Riwayat Pembayaran");
        System.out.println("9. Keluar");
        System.out.print("Pilih: ");
	}
}
