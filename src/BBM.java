public class BBM {
    String namaBBM;
    double hargaPerLiter;

    public BBM(String namaBBM, double hargaPerLiter) {
        this.namaBBM = namaBBM;
        this.hargaPerLiter = hargaPerLiter;
    }

    void showInfo() {
        System.out.printf("%-20s %-20f");
    }
}
