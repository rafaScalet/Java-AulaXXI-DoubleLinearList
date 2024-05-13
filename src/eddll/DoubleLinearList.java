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

    private void add(Node node) {
        if (empty()) {
            this.top = this.bottom = node;
        } else {
            Node serv = this.top;
            this.top = node;
            serv.setNext(node);
            serv.setPrev(this.bottom);
        }
        this.addSize();
    }

    private void append(Node node) {
        if (empty()) {
            this.top = this.bottom = node;
        } else {
            Node serv = this.bottom;
            this.bottom = node;
            serv.setNext(node);
            serv.setPrev(this.top);
        }
        this.addSize();
    }

    private void show(){
        Node serv = this.top;
        while(serv != this.bottom){
            System.out.println("-->" + serv.getValue());
            serv = serv.getNext();
        }
        System.out.println("-->" + serv.getValue());
    }
}
