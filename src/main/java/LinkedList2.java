import java.util.*;

public class LinkedList2<T> {

    public Node head;
    public Node tail;

    public LinkedList2() {
        head = null;
        tail = null;
    }

    public void addInTail(Node item) {
        if (head == null) {
            this.head = item;
            this.head.next = null;
            this.head.prev = null;
        } else {
            this.tail.next = item;
            item.prev = tail;
        }
        this.tail = item;
    }

    public Node find(T value) {
        Node node = this.head;
        while (node != null) {
            if (node.value == value)
                return node;
            node = node.next;
        }
        return null;
    }

    public ArrayList<Node> findAll(T value) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Node node = this.head;
        while (node != null) {
            if (node.value == value) {
                nodes.add(node);
            }
            node = node.next;
        }
        return nodes;
    }

    public boolean remove(T value) {
        Node node = this.head;

        while (node != null) {
            if (node.value == value) {
                if (node == this.head) {
                    if (node.next == null) {
                        this.head = null;
                        this.tail = null;
                    } else {
                        this.head = node.next;
                        this.head.prev = null;
                    }
                } else {
                    if (node.next == null) {
                        this.tail = node.prev;
                        this.tail.next = null;
                    } else {
                        node.prev.next = node.next;
                        node.next.prev = node.prev;
                    }
                }
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void removeAll(T value) {
        while (remove(value)) {

        }
    }

    public void clear() {
        this.head = null;
        this.tail = null;
    }

    public int count() {
        Node node = this.head;
        int length = 0;

        while (node != null) {
            length = length + 1;
            node = node.next;
        }
        return length;
    }

    public void insertAfter(Node _nodeAfter, Node _nodeToInsert) {
        Node node = this.head;

        if (node == null) {
            this.head = _nodeToInsert;
            this.tail = _nodeToInsert;
        }

        while (node != null) {
            if (node == _nodeAfter) {
                _nodeToInsert.next = node.next;
                if (node.next == null) {
                    this.tail = _nodeToInsert;
                } else {
                    node.next.prev = _nodeToInsert;
                }
                node.next = _nodeToInsert;
                _nodeToInsert.prev = node;
            }
            if (_nodeAfter == null) {
                _nodeToInsert.next = node;
                node.prev = _nodeToInsert;
                this.head = _nodeToInsert;
                break;
            }
            node = node.next;
        }
    }
}

class Node<T> {
    public T value;
    public Node next;
    public Node prev;

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}