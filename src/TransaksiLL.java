

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

            System.out.printf("%-20s %-20s %-20s", "Plan Nomor", "Jenis", "Jenis BBM", "Total Bayar");
            System.out.println();
            while (current != null) {
                current.data.showInfo();
                System.out.println();
                current = current.next;
            }
        }
    }

}
