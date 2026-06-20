//Queue Implementation using Array
import java.util.Scanner;

class Main 
{
    static int arr[]=new int[10];
    static int front=-1,rear=-1;
    public static void insert(int data)
    {
        if(rear==arr.length-1)
        {
            System.out.println("Queue is Full!");
            return;
        }
        if(front==-1)
        {
            front=0;
        }
        rear++;
        arr[rear]=data;
    }
    public static void delete()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue is Empty!");
            return;
        }
        front++;
        if(front>rear)
        {
            front=-1;
            rear=-1;
        }
    }
    public static void display()
    {
        if(front==-1)
        {
            System.out.println("Queue is Empty!");
            return;
        }
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
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
        delete();
        display();
        delete();  
    }
}
