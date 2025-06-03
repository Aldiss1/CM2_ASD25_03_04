public class Kendaraan {
    String platNomor;
    String tipe;
    String merk;

    public Kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    void showInfo() {
        System.out.printf("%-20s %-20s %-20s", this.platNomor, this.tipe, this.merk);
    }

    String getPlatNomor() {
        return this.platNomor;
    }

    
}


