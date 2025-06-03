

public class TransaksiPengisian {
    Kendaraan kendaraan;
    int liter;
    double totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, int liter, double totalBayar) {
        this.kendaraan = kendaraan;
        this.liter = liter;
        this.totalBayar = totalBayar;
    }

    void showInfo() {
        System.out.printf("%-20s %-20s %-20d %-20.2f", this.kendaraan.platNomor, this.kendaraan.tipe, this.liter,
                this.totalBayar);
    }

}