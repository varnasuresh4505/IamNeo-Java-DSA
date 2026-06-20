//Queue Implementation using LinkedList
import java.util.Scanner;

class Node 
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class queueImplementationUsingLinkedList 
{
    static Node front = null;
    static Node rear = null;
    public static void insert(int data)
    {
        Node newnode = new Node(data);
        if(front == null)
        {
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }
    public static void delete()
    {
        if(front == null)
        {
            System.out.print("Queue is Empty!");
            return;
        }
        front=front.next;
        if(front==null)
        {
            rear=null;
        }
    }
    public static void peekFront()
    {
        if(front != null)
        {
            System.out.println(front.data);
            return;
        }
        System.out.println("Queue is Empty!");
    }
    public static void peekRear()
    {
        if(rear != null)
        {
            System.out.println(rear.data);
            return;
        }
        System.out.println("Queue is Empty!");
    }
    public static void display()
    {
        if(front==null)
        {
            System.out.println("Queue is Empty!");
            return;
        }
        Node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int val = sc.nextInt();
            insert(val);
        }
        display();
        
        peekFront();
        peekRear();
    }
}
