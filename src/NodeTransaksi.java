public class NodeTransaksi {
    TransaksiPengisian data;
    NodeTransaksi next;

    public NodeTransaksi(TransaksiPengisian data, NodeTransaksi next) {
        this.data = data;
        this.next = next;
    }
}
