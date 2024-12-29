package linear_data_structures.LinkedList;

/**
 * Node
 */
class Node {
    public int data;
    public Node next = null;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {

    private Node head;
    private Node tail = null;
    public MyLinkedList(){
        this.head = null;
    }

    public void insert(int value) {
        Node node = new Node(value);

        if(this.head == null) {
            head = tail = node;
        } else {
//            Node current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = node;
//            this.tail = node;
//
            tail.next = node;
            tail = node;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null){
            head = tail = node;
            return;
        }
        node.next=head;
        head = node;
    }

    public void insertAt(int index, int value) {

        if (head == null || head.next == null) return;

        Node node = new Node(value);
        Node current = head;
        Node prev = null;

        while (index > 0 && current != null){
            prev = current;
            current = current.next;
            index --;
        }

        prev.next = node;
        node.next = current;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while (next != null){
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }

        current.next = prev;
        head = current;
    }

    public Node recRev(Node head){
        if (head == null || head.next == null) return head;

        Node rest = recRev(head.next);
//        System.out.println("print");
//        System.out.println(head.data);

        Node next = head.next;
        next.next = head;
        head.next = null;

        return rest;
    }

    public void reverseRec(){
       head = recRev(head);
    }

    public Node swapPairs(Node head) {
        if (head == null || head.next == null || head.next.next == null) return head;

        Node rest = swapPairs(head.next.next);

        Node next = head.next;
        Node nextPair = head.next.next;
        next.next = head;
        head.next = next;
        next.next = nextPair;
        
        return  head;
    }

    public void removeNthNode(int n){
        Node current = head;
        int totalNodes = 0;

        while (current != null) {
            current = current.next;
            totalNodes ++;
        }

        int removeElementAt = totalNodes - n +1;
        current = head;
        Node prev = null;
        while (removeElementAt > 1){
            prev = current;
            current = current.next;
            removeElementAt --;
        }
        prev.next = current.next;
        current = null;

    }
    public String toString(){

        Node current = head;
        StringBuilder result = new StringBuilder();
        while (current != null){
            result.append(current.data);
            if (current.next != null)
                result.append("-->");
            current = current.next;
        }

        return  result.toString();
    }
}
