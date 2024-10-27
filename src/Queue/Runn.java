public class Runn {
    public static void main(String[] args) {
    Queue q =new Queue();
    q.inQueue(4);
        q.show();
    q.inQueue(4);
        q.show();
        q.inQueue(5);
        q.show();
        q.inQueue(6);
        q.show();
        q.inQueue(7);
        q.show();


        q.dequeue();
        q.show();
        q.dequeue();
        q.show();
        q.dequeue();
        q.show();
        q.dequeue();
        q.show();

    }
}
