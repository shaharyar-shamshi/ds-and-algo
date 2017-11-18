
package graph;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shaharyar
 */
public class Graph {
   
    public static void main(String[] args) {
         int vertexcount=0;
              int vertexno;
                int adjmatrix[][];
               vertex [] vertexlist;
               Stack stack=new Stack();
             
    
        System.out.println("enter the number of vertex");
         Scanner in=new Scanner(System.in);
         vertexno=in.nextInt();
         adjmatrix=new int[vertexno][vertexno];
         
         
        for(int i=0;i<vertexno;i++)
        {
            for(int j=0;j<vertexno;j++)
                adjmatrix[i][j]=0;
        
        }
                 System.out.println("enter the no. of edges");
                int f=in.nextInt();
                  for(int i=0;i<f;i++)
        {
           
            System.out.println("enter first vertex ");
                    int start=in.nextInt();
                    System.out.println("enter the second vertex");
                     int end=in.nextInt();
                       adjmatrix[start][end]=1;
                        adjmatrix[end][start]=1;
        }
                  
               
         vertexlist=new vertex[vertexno];
         for(int i=0;i<vertexno;i++)
             vertexlist[i]=new vertex(i);
        // Graph g=new Graph();
          vertexlist[0].visited=true;
           System.out.println("0");
           stack.push(0);
            while(!stack.isEmpty())
            {
                 int v=(int)stack.peek();
                 int x=-1;
                 for(int i=0;i<vertexno;i++)
                 {
                     if(adjmatrix[v][i]==1&&vertexlist[i].visited==false)
                     {
                          x=i;
                          break;
                                
                     }
                 }
                 if(x==-1)
                     stack.pop();
                 else
                 {
                     stack.push(x);
                     System.out.println(x);
                     vertexlist[x].visited=true;
                 }
                  
            }
            
               
         
    }
    
    
    
}
class vertex
{
   public int label;
   public boolean visited;
   public vertex(int lab)
   {
       label=lab;
       visited=false;
   }
    
}