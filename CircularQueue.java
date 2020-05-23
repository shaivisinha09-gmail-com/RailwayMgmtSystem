package data_structures;

public class CircularQueue {
    int size;
    int front;     // INSERTION POINTER
    int rear;      // DELETION POINTER
    long[] array;

    public CircularQueue()
    {
        size = 10;
        front = rear = -1;
        array = new long[size];
    }

    public CircularQueue(int capacity)
    {
        size = capacity;
        front = rear = -1;
        array = new long[size];
    }

    public void push(long n)
    {
        if ( front == rear-1 || ( rear == 0 && front == size-1 ))
        {
            System.out.println("CIRCULAR QUEUE OVERFLOW");
        }
        else if (front == -1)
        {
            front = rear = 0;
            array[front] = n;
        }
        else if (front == size-1)
        {
            front = 0;
            array[front] = n;
        }
        else
        {
            front += 1;
            array[front] = n;
        }
    }

    public void pop()
    {
        if ( rear == -1)
        {
            System.out.println("CIRCULAR QUEUE UNDERFLOW");
        }
        else if (rear == front)
        {
            System.out.println(array[rear]);
            rear = front = -1;
        }
        else if (rear == size-1)
        {
            System.out.println(array[rear]);
            rear = 0;
        }
        else
        {
            System.out.println(array[rear]);
            rear += 1;
        }

    }

    public void show()
    {
        if ( rear == -1 )
        {
            System.out.println("CIRCULAR QUEUE UNDERFLOW");
        }
        else if(rear <= front)
        {
            System.out.print("ELEMENTS : ");
            for (int i=rear; i<=front; i++)
            {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
        else
        {
            System.out.println("ELEMENTS : ");
            for (int i=rear; i<=size-1; i++)
            {
                System.out.print(array[i]+" ");
            }
            for (int i=0; i<=front; i++)
            {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
}
