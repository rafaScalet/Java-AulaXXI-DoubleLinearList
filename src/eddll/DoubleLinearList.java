package eddll;

public class DoubleLinearList {
    private Node top;
    private Node bottom;
    private long size;

    public DoubleLinearList() {
        this.top = null;
        this.bottom = null;
        this.size = 0;
    }

    private void addSize() {
        this.size++;
    }

    private void decSize() {
        this.size--;
    }

    private boolean empty() {
        return (this.top == null && this.bottom == null);
    }

    public void add(Node node) {
        if (this.empty()) {
            this.top = this.bottom = node;
        } else {
            Node serv = this.top;
            node.setNext(serv);
            this.top = node;
            serv.setPrev(node);
        }
        this.addSize();
    }

    public void append(Node node) {
        if (this.empty()) {
            this.top = this.bottom = node;
        } else {
            Node serv = this.bottom;
            node.setPrev(serv);
            this.bottom = node;
            serv.setNext(this.bottom);
        }
        this.addSize();
    }

    public Node search(String id) {
        Node retNode = this.top;
        if (this.empty()) {
            return null;
        } else {
            while (retNode != null && !retNode.getId().equals(id)) {
                retNode = retNode.getNext();
            }
        }

        return retNode;
    }

    public void show() {
        Node serv = this.bottom;
        while (serv != this.top) {
            System.out.println("-->" + serv.getValue());
            serv = serv.getPrev();
        }
        System.out.println("-->" + serv.getValue());
    }
}
