package inventaris;

public class Mabel extends Barang {

    private String bahan;

    public Mabel() {
        super();
    }

    public Mabel(String kode, String nama, int jumlah,
            double harga, String lokasi, String bahan) {

        super(kode, nama, jumlah, harga, lokasi);
        this.bahan = bahan;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bahan   : " + bahan);
        System.out.println("========================");
    }
}