import java.util.*;

public class Stack<T> {

    public LinkedList2 linkedList;

    public Stack() {
        this.linkedList = new LinkedList2<T>();
    }

    public int size() {
        return linkedList.count();
    }

    public T pop() {
        if (size() == 0) {
            return null;
        }
        T value = (T) linkedList.tail.value;
        linkedList.tail = linkedList.tail.prev;
        if (linkedList.tail != null) {
            linkedList.tail.next = null;
        } else {
            linkedList.head = null;
        }
        return value;
    }

    public void push(T value) {
        Node item = new Node<T>(value);
        linkedList.addInTail(item);
    }

    public T peek() {
        if (size() == 0) {
            return null;
        }
        return (T) linkedList.tail.value;
    }
}