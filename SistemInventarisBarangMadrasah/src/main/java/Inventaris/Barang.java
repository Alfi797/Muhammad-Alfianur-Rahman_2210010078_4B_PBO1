package inventaris;

public class Barang {

    private String kode;
    private String nama;
    private int jumlah;
    private double harga;
    private String lokasi;

    public Barang() {
    }

    public Barang(String kode, String nama, int jumlah, double harga, String lokasi) {
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.lokasi = lokasi;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public double hitungNilai() {
        return jumlah * harga;
    }

    public void tampilData() {
        System.out.println("Kode   : " + kode);
        System.out.println("Nama   : " + nama);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Harga  : " + harga);
        System.out.println("Lokasi : " + lokasi);
        System.out.println("Total  : " + hitungNilai());
        System.out.println("------------------------");
    }
}