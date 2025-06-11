package Harsya;

public class PembayaranTransferBank extends Pembayaran {
    private String nomorBank;
    private int nomorRekening;

    public PembayaranTransferBank(String nomorBank, int nomorRekening) {
        this.nomorBank = nomorBank;
        this.nomorRekening = nomorRekening;
    }

    public boolean verifikasiTransfer() {
        return nomorBank != null && !nomorBank.isEmpty() && nomorRekening != 0;
    }
    
    @Override
    public boolean prosesPembayaran() {
        status = "Berhasil";
		return false;
    }
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Metode: Transfer Bank");
        System.out.println("Nama Bank: " + nomorBank);
        System.out.println("Nomor Rekening: " + nomorRekening);
    }
}