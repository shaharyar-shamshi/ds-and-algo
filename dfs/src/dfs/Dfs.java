
package dfs;

import java.util.Stack;

/**
 *
 * @author shaharyar
 */
public class Dfs {

    private final int maxVertices=20;
    private vertex vertexList[];
    private int adjmatrix[][];
    private int vertexcount;
    private Stack stack;
     public Dfs()
     {
         vertexList=new vertex[maxVertices];
         adjmatrix=new int[maxVertices][maxVertices];
          vertexcount=0;
          for(int y=0;y<maxVertices;y++)
              for(int x=0;x<maxVertices;x++)
                  adjmatrix[x][y]=0;
                    stack=new Stack();
         
         
     }
      public void addvertex(char lab)
      {
          vertexList[vertexcount]=new vertex(lab);
           vertexcount++;
      }
    public void addedge(int start,int end)
    {
        adjmatrix[start][end]=1;
        adjmatrix[end][start]=1;
    }
    public void display(int v)
    {
        System.out.println(vertexList[v].label);
    }
    public void dfs()
    {
        vertexList[0].visited=true;
         display(0);
         
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
class vertex
{
    public char label;
    public boolean visited;
    public vertex(char lab)
    {
        this.label=lab;
         visited=false;
    }
}
