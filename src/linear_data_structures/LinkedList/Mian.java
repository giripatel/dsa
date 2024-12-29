package linear_data_structures.LinkedList;

public class Mian {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        //        list.insertFirst(10);
//        list.insertAt(1,3);
//        list.reverse();
//        list.removeNthNode(2);
        list.reverseRec();
        System.out.println(list);
    }    
}
