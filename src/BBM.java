public class BBM {
    String namaBBM;
    double hargaPerLiter;

    public BBM(String namaBBM, double hargaPerLiter) {
        this.namaBBM = namaBBM;
        this.hargaPerLiter = hargaPerLiter;
    }

    public String getNamaBBM() {
        return namaBBM;
    }

    public double getHargaPerLiter() {
        return hargaPerLiter;
    }

    void showInfo() {
        System.out.printf("%-20s %-20f", namaBBM, hargaPerLiter);
    }

    public static BBM[] getDataBBM() {
        BBM[] dataBBM = {
                new BBM("Pertalite", 10000),
                new BBM("Pertamax", 12400),
                new BBM("Dexlite", 13400),
                new BBM("Solar", 6800)
        };
        return dataBBM;
    }
}
