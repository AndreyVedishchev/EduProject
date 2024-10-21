package collections;

public class MyLinkedList {

    Node head;

    public MyLinkedList() {
        this.head = new Node(null);
    }

    public class Node {
        Integer value;
        Node next;

        public Node(Integer value) {
            this.value = value;
            this.next = null;
        }

//        @Override
//        public String toString() {
//            return "Node{" +
//                    "value=" + value +
//                    ", next=" + next +
//                    '}';
//        }
    }

    void add(int value) {
        Node newNode = new Node(value);
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    boolean remove(int value) {
        Node currentNode = head;

        while (currentNode.next != null) {
            if (currentNode.next.value == value) {
                currentNode.next = currentNode.next.next; //получается, что тут уже не могу обратиться к предыдущей ноде. Сборщик ее удалит? т.к. на нее ничего теперь не ссылается, но она ссылается.
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    boolean contains(int value) {
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            if (currentNode.value == value) {
                return true;
            }
        }
        return false;
    }

    void printList() {
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.value);
        }
    }
}
