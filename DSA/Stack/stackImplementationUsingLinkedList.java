//Stack implementation using LinkedList

import java.util.Scanner;
class Node 
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class stackImplementationUsingLinkedList 
{
    static Node top=null;
    public static void push(int data)
    {
        Node newnode = new Node(data);
        if(top==null)
        {
            top = newnode;
            return;
        }
        newnode.next = top;
        top = newnode;
    }
    public static void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty.(Underflow)");
            return;
        }
        System.out.println("Popped element: "+top.data);
        top=top.next;
    }
    public static void peek()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.println("Peek Element: "+top.data);
    }
    public static void isEmpty()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.println("Stack is not Empty!");
    }
    public static void display()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty!");
            return;
        }
        Node temp = top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
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
            push(val);
        }
        pop();
        display();
    }
}

