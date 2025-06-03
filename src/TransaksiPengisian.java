public class TransaksiPengisian {

    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter, double totalBayar) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = totalBayar;
    }

    void layaniKendaraan() {
        System.out.println("Kendaraan " + kendaraan.getPlatNomor());
        System.out.println("Jenis BBM :");
        BBM[] dataBBM = BBM.getDataBBM();
        for (int i = 0; i < dataBBM.length; i++) {
            System.out.println((i + 1) + ". " + dataBBM[i].getNamaBBM());
        }

    }

}