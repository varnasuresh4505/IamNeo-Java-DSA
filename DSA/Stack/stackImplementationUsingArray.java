//Stack Implementation using Array

import java.util.*;
class stackImplementationUsingArray 
{
    static int size = 8;
    static int stack[] = new int[size];
    static int top = -1;
    public static void push(int data)
    {
        if(top<size-1)
        {
            top++;
            stack[top] = data;
        }
        else
        {
            System.out.println("Stack overflow");
        }
    }
    public static void pop()
    {
        if(top>=0)
        {
            top--;
            return;
        }
        else
        {
            System.out.println("Stack is Empty!");
        }
    }
    public static void peek()
    {
        if(top<0)
        {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.println(stack[top]);
    }
    public static void isEmpty()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.println("Stack is not Empty!");
    }
    public static void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty.");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.print(stack[i]+" ");
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
        pop();
        display();
        isEmpty();
    }
}

