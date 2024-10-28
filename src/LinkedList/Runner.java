package LinkedList;

public class Runner{
    public static void main(String[] args) {


        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(4);
        list.insertAtStart(7);
        list.insertAt(2,33);
        System.out.println();
        list.show();
        list.deleteAt(2);


    }
}
