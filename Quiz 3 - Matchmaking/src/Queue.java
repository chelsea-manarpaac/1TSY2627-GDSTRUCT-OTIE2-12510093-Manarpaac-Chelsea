public class Queue<Q>
{
    private Q[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue()
    {
        queue = (Q[]) new Object[100];
        capacity = 100;
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {return size == 0;}
    public int size() {return size;}

    public void enqueue(Q item)
    {
        if (size == capacity)
        {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }
    public Q dequeue()
    {
        if(isEmpty())
        {
            return null;
        }
        Q item = queue[front];
        queue[front] = null;
        front = (front+1)%capacity;
        size--;

        return item;
    }
}
