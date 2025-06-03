public class KendaraanLL {
    int size;
    NodeKendaraan head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void addDataKendaraan(Kendaraan data) {
        NodeKendaraan newNode = new NodeKendaraan(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            tail = head;
            head = newNode;
        }
        size++;
        System.out.println(">> Kendaraan masuk ke dalam antrian");
    }

}
