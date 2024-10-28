package Queue;

public class Queue
{
    int queue[]=new int[5];
    int front;
    int rear ;
    int size;

    public void inQueue(int data)

    { if(!isFull()) {
        queue[rear] = data;
        size = size + 1;
        rear = (rear + 1) % 5;
    }else System.out.println("size full");

    }
    public int dequeue()
    {   int data = queue[front];
        if (!isEmpty())
        {

            front = (front + 1) % 5;
            size--;
        }
            else {
            System.out.println("empty");

        }return data;
    }

    public void show()
    {
        System.out.print("Elements ;");
        for (int i=0;i<size;i++){
            System.out.print(queue[(front+i)%5] + " ,");
        }
        System.out.println();
            for (int n:queue)
            {
                System.out.print(n +"");
            }
    }
    public int  sizeOf()
    {
            return size;
    }
    public boolean isEmpty(){
        return sizeOf()==0;

    }
    public boolean isFull(){
        return sizeOf()==5;
    }
}

