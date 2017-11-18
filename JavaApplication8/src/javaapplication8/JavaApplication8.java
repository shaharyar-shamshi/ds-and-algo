/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
        tree root=null;
          for(int i=0;i<7;i++)
          {
              int s=0;
             tree current=root;
              int n=in.nextInt();
              if(root==null)
              {
                  root=new tree(n);
              }
              else
              {
              while(s==0)
              {
               if(n>current.getdata())
              {
                  if(current.getright()==null)
                  {
                      current.setright(new tree(n));
                      s++;
                  }
                  else
                  {
                      current=current.getright();
                  }
              }
               else
               {
                   if(current.getleft()==null)
                   {
                       current.setleft(new tree(n));
                       s++;
                   }
                   else
                   {
                       current=current.getleft();
                   }
                   
              
          }
              
          } 
          }
          
    }
          JavaApplication8 t=new JavaApplication8();
          t.print(root);
      
       
    }
  
    int height(tree root)
    {
     if(root==null)
         return 0;
      else
     {
        int l= height(root.getleft());
         int r=height(root.getright());
         if(l>r)
             return (l+1);
         else
             return (r+1);
    }
    }
    void print(tree root)
    { int s=0;
        int h=height(root);
         for(int i=1;i<=h;i++)
         {
            s=  printlevel(root,i,0);
               
         }
         System.out.println(s);
          
    }
  int   printlevel(tree root,int level,int s)
  {
      if(root==null) 
          return 0;
      else if(level==1)
      {
         if(root.getleft()==null&&root.getright()==null)
            return s++;
              
          
      }
      else if(level>1)
              {
              printlevel(root.left,level-1,s);
              printlevel(root.right,level-1,s);
              }
      return s;
  }
  
}
class tree
{
     int data;
       tree left;
         tree right;
           public tree(int data)
           {
               this.data=data;
                this.left=null;
                  this.right=null;
                    
           }
            public int getdata()
            {
                return this.data;
            }
             public tree getright()
             {
                 return this.right;
             }
               public tree getleft()
               {
                   return this.left;
               }
               public void setdata(int data)
               {
               
                       this.data=data;
               }
               public void setright(tree right)
               {
               
                       this.right=right;
               }
               public void setleft(tree left)
               {
               
                       this.left=left;
               }
}
