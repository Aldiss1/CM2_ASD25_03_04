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

        BBMLL nodeBBM = new BBMLL();

        nodeBBM.addFirst(new BBM("Petalite", 10000));
        nodeBBM.addFirst(new BBM("Pertamax", 12400));
        nodeBBM.addFirst(new BBM("Biosolat", 6800));
        nodeBBM.addFirst(new BBM("Dexlite", 13400));

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
                    if (node != null) {
                        tll.layaniKendaraan(node, nodeBBM, CM);
                    } else {
                        System.out.println("Tidak ada kendaraan dalam antrian.");
                    }
                    break;
                case 5:
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
