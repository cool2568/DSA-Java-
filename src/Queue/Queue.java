public class Queue {
    int queue[]=new int[5];
    int front;
    int rear ;
    int size;
    public void inQueue(int data){
        queue[rear]=data;
        size =size+1;
        rear=rear+1;


    }
    public int dequeue(){
        int data = queue[front];
        front++;
        size--;
        return data;
    }

    public void show(){
        System.out.println("Elements ;");
        for (int i=0;i<size;i++){
            System.out.print(queue[front+i] + " ,");

        }
    }
}

