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
    }

    void add(int value) {
        Node newNode = new Node(value);
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    int remove(int value) {
        Node currentNode = head;
        int result = 0;

        while (currentNode.next != null) {
            if (currentNode.next.value == value) {
                currentNode.next = currentNode.next.next; //получается, что тут уже не могу обратиться к предыдущей ноде. Сборщик ее удалит? т.к. на нее ничего теперь не ссылается, но она ссылается.
                return result;
            }
            result++;
            currentNode = currentNode.next;
        }
        return -1;
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

    public static void main(String[] args) {

        MyLinkedList ml = new MyLinkedList();
        ml.add(11);
        ml.add(22);
        ml.add(33);
        ml.add(44);
        System.out.println("-------------");
        System.out.println(ml.contains(444));
        System.out.println("-------------");
        ml.printList();
        System.out.println("-------------");
        System.out.println(ml.remove(33));
        System.out.println(ml.remove(333));
        System.out.println("-------------");
        ml.printList();
        System.out.println("-------------");
        System.out.println(ml.remove(11));
    }
}
