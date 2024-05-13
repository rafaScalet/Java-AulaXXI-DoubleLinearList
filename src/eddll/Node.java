package eddll;

public class Node {
    private int id;
    private Object value;
    private Node next;
    private Node prev;

    public Node() {
        this.id = 0;
        this.value = null;
        this.next = null;
        this.prev = null;
    }

    public Node(int id, Object value) {
        this.id = id;
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
