public class SimpleQueue<T> {

    private Node <T> head;
    private Node <T> back;

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (back == null) {
            head = back = newNode;
            return;
        }
        back.next = newNode;
        back = newNode;

    }

    public T dequeue() {
        if (head == null) return null;
        T data = head.data;
        head = head.next;
        if (head == null) back = null;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }



}
