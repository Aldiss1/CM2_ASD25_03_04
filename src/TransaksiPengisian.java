
public class TransaksiPengisian {
    Kendaraan kendaraan;
    String namaBBm;
    double totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, String namaBBm, double totalBayar) {
        this.kendaraan = kendaraan;
        this.namaBBm = namaBBm;
        this.totalBayar = totalBayar;
    }

    void showInfo() {
        System.out.printf("%-20s %-20s %-20s %-20.2f", this.kendaraan.platNomor, this.kendaraan.tipe, this.namaBBm,
                this.totalBayar);
    }

}