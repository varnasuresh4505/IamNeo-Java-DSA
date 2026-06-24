/*This program creates a binary tree dynamically using level order insertion.
Each new node is inserted at the first available position using Queue.
The tree is then traversed using recursive DFS methods.

Concepts Used:
- Binary Tree
- Queue
- Level Order Insertion
- Recursion
- Tree Traversals*/

import java.util.*;
class Node
{
    int data;
    Node left = null;
    Node right = null;
    Node(int data)
    {
        this.data = data;
    }
}
class binaryTreeInsertionTraversalUsingQueue
{
    static Node root = null;
    public static void push(int data)
    {
        Node newnode = new Node(data);
        if(root == null)
        {
            root = newnode;
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            if(temp.left == null)
            {
                temp.left = newnode;
                return;
            }
            else
            {
                q.offer(temp.left);
            }
            
            if(temp.right == null)
            {
                temp.right = newnode;
                return;
            }
            else
            {
                q.offer(temp.right);
            }
        }
    }
    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int v = sc.nextInt();
            if(v == -1)
            {
                break;
            }
            push(v);
        }
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }
}
