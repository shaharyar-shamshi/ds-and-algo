/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfsp;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 *
 * @author shaharyar
 */
public class Dfsp{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
         
         vertex []vertexlist;
        int adjmatrix[][];
        System.out.println("enter no. of vertices");
        int vertexno=in.nextInt();
        vertexlist=new vertex[vertexno];
        adjmatrix=new int[vertexno][vertexno];
        for(int i=0;i<vertexno;i++)
            for(int j=0;j<vertexno;j++)
                 adjmatrix[i][j]=0;
                   System.out.println("enter the no. of edges");
                     int edge=in.nextInt();
                       for(int i=0;i<edge;i++)
                       {
                           System.out.println("the start edge ");
                           int start=in.nextInt();
                            int end=in.nextInt();
                             adjmatrix[start][end]=1;
                              adjmatrix[end][start]=1;
                              
                       }
                       for(int i=0;i<vertexno;i++)
                       {
                           vertexlist[i]=new vertex(i);
                       }
                      int v=0;
                      
                      //  vertexlist[0].visited=true;
                        Queue queue=new LinkedList();
                        queue.add(0);
                       
                        while(!queue.isEmpty())
                        {
                            
                             System.out.println(queue.peek());
                            int v1=(int)queue.remove();
                            vertexlist[v1].visited=true;
                            for(int i=0;i<vertexno;i++)
                            {
                                if(adjmatrix[v1][i]==1&&vertexlist[i].visited==false)
                                {
                                    queue.add(i);
                                    break;
                                }  
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