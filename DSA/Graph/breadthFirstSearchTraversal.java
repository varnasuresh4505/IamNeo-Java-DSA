// Breadth First Search Traversal in Graph (Using Queue for Traversal and Boolean Array for Visited Nodes)
import java.util.*;
class breadthFirstSearchTraversal
{
    public static void bfsTraversal(int[][] adjMatrix,int vertices,int startVertex) 
    {
        Queue<Integer> q = new LinkedList<>();
        boolean isVisited[] = new boolean[vertices];
        q.offer(startVertex);
        isVisited[startVertex] = true;
        while(!q.isEmpty())
        {
            int t = q.poll();
            System.out.print(t+" ");
            for(int i=0;i<adjMatrix.length;i++)
            {
                if(adjMatrix[t][i] == 1 && !isVisited[i])
                {
                    q.offer(i);
                    isVisited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int[][] adjMatrix = new int[V][V];
        int E = sc.nextInt();
        for(int i = 0; i < E; i++) 
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; // For Directed Graph remove this line
        }
        int S = sc.nextInt();
        bfsTraversal(adjMatrix, V, S);
    }
}
