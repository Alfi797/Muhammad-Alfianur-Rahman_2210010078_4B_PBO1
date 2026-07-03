package inventaris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        InventarisManager manager = new InventarisManager();

        int pilihan;

        do {
            System.out.println("\n==============================");
            System.out.println(" SISTEM INVENTARIS MADRASAH ");
            System.out.println("==============================");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Cari Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Total Nilai");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Kode: ");
                    String kode = input.nextLine();

                    System.out.print("Nama: ");
                    String nama = input.nextLine();

                    System.out.print("Jumlah: ");
                    int jumlah = input.nextInt();

                    System.out.print("Harga: ");
                    double harga = input.nextDouble();
                    input.nextLine();

                    System.out.print("Lokasi: ");
                    String lokasi = input.nextLine();

                    Barang b = new Barang(kode, nama, jumlah, harga, lokasi);
                    manager.tambahBarang(b);
                    break;

                case 2:
                    manager.tampilkanSemua();
                    break;

                case 3:
                    System.out.print("Masukkan kode: ");
                    String cari = input.nextLine();
                    manager.cariBarang(cari);
                    break;

                case 4:
                    System.out.print("Masukkan kode: ");
                    String hapus = input.nextLine();
                    manager.hapusBarang(hapus);
                    break;

                case 5:
                    manager.totalNilai();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }
}