import java.util.Scanner;

public class TransaksiMain {
    static Scanner CM = new Scanner(System.in);
    static KendaraanLL kll = new KendaraanLL();
    static TransaksiLL tll = new TransaksiLL();

    static Kendaraan inputDataKendaraan() {
        System.out.print("Input Plat Nomor : ");
        String plat = CM.nextLine();
        System.out.print("Input Jenis Kendaraan : ");
        String jenis = CM.nextLine();
        System.out.print("Input Merk : ");
        String merk = CM.nextLine();

        return new Kendaraan(plat, jenis, merk);
    }

    static BBM inputDataBBM() {
        System.out.print("Input Jenis BBM : ");
        String jenis = CM.nextLine();
        System.out.print("Input jumlah liter : ");
        double liter = CM.nextDouble();
        return new BBM(jenis, liter);
    }

    public static void main(String[] args) {

        BBM[] bbm = new BBM[4];
        bbm[0] = new BBM("Petalite", 10000);
        bbm[1] = new BBM("Pertamax", 12400);
        bbm[2] = new BBM("Biosolat", 6800);
        bbm[3] = new BBM("Dexlite", 13400);

        while (true) {
            System.out.println("===  SISTEM ANTRIAN SPBU ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Cek Sisa Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. Sort Riwayat Transaksi");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu (1-6): ");
            int pilihan = CM.nextInt();
            CM.nextLine();

            switch (pilihan) {
                case 1:
                    kll.addDataKendaraan(inputDataKendaraan());
                    break;
                case 2:
                    kll.showAntrian();
                    break;
                case 3:
                    System.out.println(">> Sisa antrian: " + kll.getAntrian());
                    break;
                case 4:
                    NodeKendaraan node = kll.removeFirst();
                    if (node == null) {
                        System.out.println("Kendaraan Kosong");
                        return;
                    }
                    System.out.println("Kendaraan " + node.data.platNomor);
                    System.out.println("Daftar Jenis BBM");
                    for (int i = 0; i < bbm.length; i++) {
                        bbm[i].showInfo();
                        System.out.println();
                    }

                    System.out.print("Input Jenis BBM: ");
                    String jenis = CM.nextLine();
                    System.out.print("Input Jumlah Liter: ");
                    int jml = CM.nextInt();
                    CM.nextLine();

                    boolean found = false;
                    double bayar = 0;
                    for (int i = 0; i < bbm.length; i++) {
                        if (bbm[i].namaBBM.equalsIgnoreCase(jenis)) {
                            bayar = bbm[i].hargaPerLiter * jml;
                            System.out.println();
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        tll.addFirst(new TransaksiPengisian(node.data, jml, bayar));
                    } else {
                        System.out.println("Tidak Ditemukan Jenis BBM");
                    }

                    break;
                case 5:
                    tll.showTransaksi();
                    break;
                case 6:
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
