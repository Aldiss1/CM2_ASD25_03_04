public class KendaraanLL {
    int size;
    NodeKendaraan head;

    boolean isEmpty() {
        return head == null;
    }

    void addDataKendaraan(Kendaraan data) {
        NodeKendaraan newNode = new NodeKendaraan(data, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
        System.out.println(">> Kendaraan masuk ke dalam antrian");
    }

    void showAntrian() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian");
            return;
        } else {
            NodeKendaraan current = head;

            System.out.printf("%-20s %-20s %-20s", "Plan Nomor", "Jenis", "Merk");
            System.out.println();
            while (current != null) {
                current.data.showInfo();
                System.out.println();
                current = current.next;
            }
        }
    }

    public NodeKendaraan removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return null;
        } else {
            NodeKendaraan curr = head;
            head = head.next;
            this.size--;
            return curr;
        }
    }

    int getAntrian() {
        return this.size;
    }

}
