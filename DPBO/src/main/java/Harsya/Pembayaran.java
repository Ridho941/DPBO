package Harsya;

public class Pembayaran {
    protected int pembayaran;
    protected double jumlah;
    protected String date;
    protected String status;

    public boolean prosesPembayaran() {
        if (jumlah > 0) {
            status = "Diproses";
            return true;
        } else {
            status = "Gagal";
            return false;
        }
    }

    public String cekStatus() {
        return status;
    }

    public void printDetails() {
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Tanggal: " + date);
        System.out.println("Status: " + status);
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void getDetails() {
        printDetails();
    }
}
