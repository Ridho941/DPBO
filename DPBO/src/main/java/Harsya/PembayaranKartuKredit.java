package Harsya;

public class PembayaranKartuKredit extends Pembayaran {
    private String nomorKartu;
    private String namaPemegang;
    private String tanggalKadaluwarsa;
    private int pin;

    public PembayaranKartuKredit(String nomorKartu, String namaPemegang, String tanggalKadaluwarsa, int pin) {
        this.nomorKartu = nomorKartu;
        this.namaPemegang = namaPemegang;
        this.tanggalKadaluwarsa = tanggalKadaluwarsa;
        this.pin = pin;
    }

    public boolean verifikasiKartu() {
        return nomorKartu != null && !nomorKartu.isEmpty() && pin > 0;
    }
    
    @Override
    public boolean prosesPembayaran() {
        status = "Berhasil";
		return false;
    }
    @Override
    public void getDetails() {
        super.printDetails();
        System.out.println("Metode: Kartu Kredit");
        System.out.println("Nomor Kartu: " + nomorKartu);
        System.out.println("Nama Pemegang: " + namaPemegang);
        System.out.println("Kadaluwarsa: " + tanggalKadaluwarsa);
    }
}
