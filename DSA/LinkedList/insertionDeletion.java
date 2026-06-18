import java.util.*;
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
class insertionDeletion 
{
    static Node head = null;
    public static void insertAtEnd(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newnode;
    }
    public static void insertAtBegin(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public static void deleteAtBegin()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty.");
            return;
        }
        head = head.next;
    }
    public static void deleteAtEnd()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty.");
            return;
        }
        if(head.next==null)
        {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }
    
    public static void display()
    {
        if(head==null)
        {
            System.out.print("LinkedList is empty.");
            return;
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int val = sc.nextInt();
            insertAtEnd(val);
        }
        display();
        System.out.println();
        insertAtBegin(0);
        display();
        System.out.println();
        deleteAtBegin();
        display();
        System.out.println();
        deleteAtEnd();
        display();
    }
}
