import java.util.Scanner;

public class TransaksiMain {
    static Scanner CM = new Scanner(System.in);

    Kendaraan inputDataKendaraan() {
        System.out.print("Input Plat Nomor : ");
        String plat = CM.nextLine();
        System.out.print("Input Jenis Kendaraan : ");
        String jenis = CM.nextLine();
        System.out.print("Input Merk : ");
        String merk = CM.nextLine();

        return new Kendaraan(plat, jenis, merk);
    }

    public static void main(String[] args) {

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

        switch (pilihan) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
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

        CM.close();
    }
}
