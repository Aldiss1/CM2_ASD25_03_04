public class BBMLL {
    NodeBBM head;

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(BBM data) {
        NodeBBM newNode = new NodeBBM(data, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
}
