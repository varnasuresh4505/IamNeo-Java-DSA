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
class findMidNode 
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
    
    public static void findMid()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
            return;
        }
        Node slowPointer = head;
        Node fastPointer = head;
        while(fastPointer.next!=null && fastPointer.next.next!=null)
        {
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        System.out.print(slowPointer.data);
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
    public static void reverseList()
    {
        Node prev=null;
        Node cur=head;
        while(cur!=null)
        {
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
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
        findMid();
    }
}

