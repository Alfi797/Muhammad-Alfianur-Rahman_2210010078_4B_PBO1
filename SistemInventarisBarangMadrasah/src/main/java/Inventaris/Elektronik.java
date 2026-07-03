package inventaris;

public class Elektronik extends Barang {

    private int garansi; // dalam tahun

    public Elektronik() {
        super();
    }

    public Elektronik(String kode, String nama, int jumlah,
            double harga, String lokasi, int garansi) {

        super(kode, nama, jumlah, harga, lokasi);
        this.garansi = garansi;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Garansi : " + garansi + " tahun");
        System.out.println("========================");
    }
}