package inventaris;

import java.util.ArrayList;

public class InventarisManager {

    private ArrayList<Barang> listBarang = new ArrayList<>();

    // tambah barang
    public void tambahBarang(Barang b) {
        listBarang.add(b);
        System.out.println("Barang berhasil ditambahkan!");
    }

    // tampil semua barang
    public void tampilkanSemua() {
        if (listBarang.isEmpty()) {
            System.out.println("Data kosong!");
        } else {
            for (Barang b : listBarang) {
                b.tampilData();
            }
        }
    }

    // cari barang
    public void cariBarang(String kode) {
        boolean ketemu = false;

        for (Barang b : listBarang) {
            if (b.getKode().equalsIgnoreCase(kode)) {
                b.tampilData();
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Barang tidak ditemukan!");
        }
    }

    // hapus barang
    public void hapusBarang(String kode) {
        for (int i = 0; i < listBarang.size(); i++) {
            if (listBarang.get(i).getKode().equalsIgnoreCase(kode)) {
                listBarang.remove(i);
                System.out.println("Barang berhasil dihapus!");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan!");
    }

    // total nilai inventaris
    public void totalNilai() {
        double total = 0;

        for (Barang b : listBarang) {
            total += b.hitungNilai();
        }

        System.out.println("Total Nilai Inventaris: " + total);
    }
}