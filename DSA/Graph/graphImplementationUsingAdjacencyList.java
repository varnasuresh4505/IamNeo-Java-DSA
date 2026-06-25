//Graph Implementation using Adjacency List

import java.util.*;
class Main 
{
    public static void main(String[] args)  
    {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
        }
        for(int i=0;i<v;i++)
        {
            System.out.print(i+" -> ");
            for(int j=0;j<graph.get(i).size();j++)
            {
                System.out.print(graph.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
