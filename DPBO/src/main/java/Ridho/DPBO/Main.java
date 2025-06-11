package Ridho.DPBO;

import java.util.ArrayList;
import java.util.Scanner;

import Harsya.Pembayaran;
import Harsya.PembayaranKartuKredit;
import Harsya.PembayaranTransferBank;
import Ken.Apartemen;
import Ken.ApartemenBulanan;
import Ken.ApartemenHarian;
import Ken.ApartemenTahunan;

/**
 * Hello world!
 *
 */
public class Main 
{	
    public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
    	ArrayList<Kost> listKost = new ArrayList<Kost>();
        ArrayList<Apartemen> listApartemen = new ArrayList<Apartemen>();
        ArrayList<Pembayaran> listPembayaran = new ArrayList<Pembayaran>();
    	int menu;
    	
    	do {
    		PrintHeader();
    		menu = input.nextInt();
    		input.nextLine();
    		
    		switch (menu) {
			case 1:
				System.out.print("Jenis Kost: (1 untuk harian dan 2 untuk bulanan) ");
				int jenis = input.nextInt();
				input.nextLine();
				
			    System.out.print("ID Kost: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Nama Kost: ");
                String nama = input.nextLine();

                System.out.print("Lokasi Kost: ");
                String lokasi = input.nextLine();

                System.out.print("Tersedia? (true/false): ");
                boolean tersedia = input.nextBoolean();
				
                if (jenis == 1) {
                    System.out.print("Harga Harian: ");
                    float hargaHarian = input.nextFloat();
                    input.nextLine();
                    KostHarian kh = new KostHarian(id, nama, lokasi, tersedia, hargaHarian);
                    listKost.add(kh);
                    System.out.println("Kost Harian berhasil ditambahkan.");
                } else if (jenis == 2) {
                    System.out.print("Harga Bulanan: ");
                    float hargaBulanan = input.nextFloat();
                    input.nextLine();
                    KostBulanan kb = new KostBulanan(id, nama, lokasi, tersedia, hargaBulanan);
                    listKost.add(kb);
                    System.out.println("Kost Bulanan berhasil ditambahkan.");
                } else {
                    System.out.println("Jenis kost tidak valid.");
                }
                break;
                
                case 2:
                	System.out.println("\n===== Daftar Kost =====");
                	if (listKost.isEmpty()) {
                        System.out.println("Belum ada data kost.");
                    } else {
                        for (Kost k : listKost) {
                            k.getDetails();
                            if (k instanceof KostHarian kh) {
                                System.out.println("Total 3 hari: " + kh.hitungHarian(3));
                            } else if (k instanceof KostBulanan kb) {
                                System.out.println("Total 2 bulan: " + kb.hitungBulanan(2));
                            }
                            System.out.println("----------------------");
                        }
                    }
                    break;
                
                case 3:
                	System.out.print("Jenis Apartemen (1: Harian, 2: Bulanan, 3: Tahunan): ");
                    int jenisAp = input.nextInt();
                    input.nextLine();

                    System.out.print("ID Apartemen: ");
                    int idA = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Apartemen: ");
                    String namaA = input.nextLine();

                    System.out.print("Lokasi Apartemen: ");
                    String lokasiA = input.nextLine();

                    System.out.print("Tersedia? (true/false): ");
                    boolean tersediaA = input.nextBoolean();
                    input.nextLine();

                    if (jenisAp == 1) {
                        System.out.print("Harga Harian: ");
                        float hH = input.nextFloat();
                        input.nextLine();
                        ApartemenHarian ah = new ApartemenHarian(idA, namaA, lokasiA, tersediaA, hH);
                        listApartemen.add(ah);
                        System.out.println("Apartemen Harian berhasil ditambahkan.");
                    } else if (jenisAp == 2) {
                        System.out.print("Harga Bulanan: ");
                        float hB = input.nextFloat();
                        input.nextLine();
                        ApartemenBulanan ab = new ApartemenBulanan(idA, namaA, lokasiA, tersediaA, hB);
                        listApartemen.add(ab);
                        System.out.println("Apartemen Bulanan berhasil ditambahkan.");
                    } else if (jenisAp == 3) {
                        System.out.print("Harga Tahunan: ");
                        float hT = input.nextFloat();
                        input.nextLine();
                        ApartemenTahunan at = new ApartemenTahunan(idA, namaA, lokasiA, tersediaA, hT);
                        listApartemen.add(at);
                        System.out.println("Apartemen Tahunan berhasil ditambahkan.");
                    } else {
                        System.out.println("Jenis apartemen tidak valid.");
                    }
                	break;
                
                case 4:
                	System.out.println("\n===== Daftar Apartemen =====");
                    if (listApartemen.isEmpty()) {
                        System.out.println("Belum ada data apartemen.");
                    } else {
                        for (Apartemen a : listApartemen) {
                            a.getDetails();
                            if (a instanceof ApartemenHarian ah) {
                                System.out.println("Total 3 hari: " + ah.hitungHarian(3));
                            } else if (a instanceof ApartemenBulanan ab) {
                                System.out.println("Total 2 bulan: " + ab.hitungBulanan(2));
                            } else if (a instanceof ApartemenTahunan at) {
                                System.out.println("Total 1 tahun: " + at.hitungTahunan(1));
                            }
                            System.out.println("----------------------");
                        }
                    }
                	break;
                	
                case 5:
                    System.out.println("\n===== Metode Pembayaran =====");
                    System.out.println("1. Transfer Bank");
                    System.out.println("2. Kartu Kredit");
                    System.out.print("Pilihan Anda (1/2): ");
                    int pilihan = input.nextInt();
                    input.nextLine();

                    if (pilihan == 1) {
                        System.out.print("Masukkan nama bank: ");
                        String bank = input.nextLine();
                        System.out.print("Masukkan nomor rekening: ");
                        int rekening = input.nextInt();
                        input.nextLine();

                        PembayaranTransferBank transfer = new PembayaranTransferBank(bank, rekening);
                        if (transfer.verifikasiTransfer()) {
                            transfer.prosesPembayaran();
                            listPembayaran.add(transfer);
                            System.out.println("Pembayaran berhasil diproses.");
                            System.out.println("Status: " + transfer.cekStatus());
                        } else {
                            System.out.println("Verifikasi transfer gagal. Data tidak valid.");
                        }

                    } else if (pilihan == 2) {
                        System.out.print("Masukkan nomor kartu: ");
                        String kartu = input.nextLine();
                        System.out.print("Masukkan nama pemegang kartu: ");
                        String namaKartu = input.nextLine();
                        System.out.print("Masukkan tanggal kadaluwarsa (contoh: 12/2026): ");
                        String tanggal = input.nextLine();
                        System.out.print("Masukkan PIN: ");
                        int pin = input.nextInt();
                        input.nextLine();

                        PembayaranKartuKredit kredit = new PembayaranKartuKredit(kartu, namaKartu, tanggal, pin);
                        if (kredit.verifikasiKartu()) {
                            kredit.prosesPembayaran();
                            listPembayaran.add(kredit);
                            System.out.println("Pembayaran berhasil diproses.");
                            System.out.println("Status: " + kredit.cekStatus());
                        } else {
                            System.out.println("Verifikasi kartu gagal. Data tidak valid.");
                        }
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;

                case 6:
                    System.out.println("\n===== Riwayat Pembayaran =====");
                    if (listPembayaran.isEmpty()) {
                        System.out.println("Belum ada pembayaran.");
                    } else {
                        int i = 1;
                        for (Pembayaran p : listPembayaran) {
                            System.out.println("Pembayaran #" + i);
                            System.out.println("Status: " + p.cekStatus());
                            System.out.println("Jenis: " + p.getClass().getSimpleName());
                            System.out.println("----------------------");
                            i++;
                        }
                    }
                    break;
                    
                case 9:
                	System.out.println("Keluar");
                	break;

			default:
				break;
			}
    		
    	} while(menu != 9);
    	input.close();
    }

	private static void PrintHeader() {
        System.out.println("1. Tambah Kost");
        System.out.println("2. Tampilkan Semua Kost");
        System.out.println("3. Tambah Apartemen");
        System.out.println("4. Tampilkan Semua Apartemen");
        System.out.println("5. Lakukan Pembayaran");
        System.out.println("6. Lihat Riwayat Pembayaran");
        System.out.println("9. Keluar");
        System.out.print("Pilih menu: ");
	}
}
