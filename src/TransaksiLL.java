
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

    void showTransaksi() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian");
            return;
        } else {
            NodeTransaksi current = head;

            System.out.printf("%-20s %-20s %-20s %-20s", "Plat Nomor", "Jenis", "Jenis BBM", "Total Bayar");
            System.out.println();
            while (current != null) {
                current.data.showInfo();
                System.out.println();
                current = current.next;
            }
        }
    }

    void sortTransaksi() {
        if (isEmpty()) {
            System.out.println("Tidak ada transaksi untuk diurutkan");
            return;
        }

        NodeTransaksi current = head;
        NodeTransaksi index = null;
        TransaksiPengisian temp;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data.kendaraan.platNomor.compareTo(index.data.kendaraan.platNomor) > 0) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }

        System.out.println("Transaksi berhasil diurutkan berdasarkan plat nomor");
        showTransaksi();
    }

}
