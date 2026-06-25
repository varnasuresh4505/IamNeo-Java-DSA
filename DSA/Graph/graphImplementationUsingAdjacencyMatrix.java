//Graph Implementation using Adjacency Matrix

import java.util.*;
class Graph
{
    static int v,e;
    static int mat[][];
    public Graph(int v, int e)
    {
        this.v = v;
        this.e = e;
        mat = new int[v][v];
    }
    public void add(int v1,int v2)
    {
        mat[v1][v2] = 1; 
        mat[v2][v1] = 1; // For Directed Graph remove this line
    }
    public void displayGraph()
    {
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class graphImplementationUsingAdjacencyMatrix 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(v,e);
        for(int i=0;i<e;i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            g.add(v1,v2);
        }
        g.displayGraph();
    }
}

