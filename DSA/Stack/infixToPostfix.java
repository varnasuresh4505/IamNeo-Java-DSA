import java.util.Scanner;
class Node 
{
    char data;
    Node next;
    Node(char data) 
    {
        this.data = data;
        this.next = null;
    }
}

class infixToPostfix
{
    static Node top=null;
    public static void push(char data)
    {
        Node newnode = new Node(data);
        if(top == null)
        {
            top=newnode;
            return;
        }
        newnode.next=top;
        top=newnode;
    }
    public static void pop()
    {
        if(top==null)
        {
            return;
        }
        top=top.next;
    }
    public static char peek()
    {
        if(top==null)
        {
            return ' ';
        }
        return top.data;
    }
    public static boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        return false;
    }
    public static int precedence(char c)
    {
        if(c=='+' || c=='-')
        {
            return 1;
        }
        else if(c=='*' || c=='/' || c=='%')
        {
            return 3;
        }
        return 0;
    }
    public static void infixToPostFix(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isAlphabetic(c))
            {
                System.out.print(c);
            }
            else if(c=='(')
            {
                push(c);
            }
            else if(c==')')
            {
                while(peek() != '(' && !isEmpty())
                {
                    System.out.print(peek());
                    pop();
                }
                pop();
            }
            else
            {
                while(precedence(peek()) >= precedence(c))
                {
                    System.out.print(peek());
                    pop();
                }
                push(c);
            }
        }
        while(!isEmpty())
        {
            System.out.print(peek());
            pop();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        infixToPostFix(s);
    }
}


//Infix to Prefix Steps
//1.Find infixToPostfix of given expression
//2. Reverse the answer
//3.If the bracket is '(' change it to ')' and vice versa
//4.Again reverse the answer to get the prefix expression
