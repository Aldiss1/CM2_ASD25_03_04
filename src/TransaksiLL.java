
import java.util.Scanner;

public class TransaksiLL {
    NodeTransaksi head;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(TransaksiPengisian data) {
        NodeTransaksi newNode = new NodeTransaksi(data, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        this.size++;
    }

    void layaniKendaraan(NodeKendaraan node, BBMLL data, Scanner sc) {

        System.out.println("Kendaraan " + node.data.platNomor);
        System.out.println("Daftar Jenis BBM :");
        System.out.printf("%-20s %-20s", "Jenis BBM", "Harga");
        System.out.println();
        NodeBBM currBBM = data.head;
        while (currBBM != null) {
            currBBM.data.showInfo();
            System.out.println();
            currBBM = currBBM.next;
        }
        System.out.print("Input Jenis BBM: ");
        String jenis = sc.nextLine();
        System.out.print("Input Jumlah Liter: ");
        int jml = sc.nextInt();
        sc.nextLine();

        double totalHargaBBM = 0;
        NodeBBM searchBBM = data.head;
        while (searchBBM != null) {
            if (searchBBM.data.namaBBM.equalsIgnoreCase(jenis)) {
                totalHargaBBM = jml * searchBBM.data.hargaPerLiter;
            }
            searchBBM = searchBBM.next;
        }

        addFirst(new TransaksiPengisian(node.data, jml, totalHargaBBM));

    }

}
