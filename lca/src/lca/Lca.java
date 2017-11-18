
package lca;
import java.util.Scanner;

public class Lca {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        tree root=null;
         for(int i=0;i<7;i++)
         {
             int s=0;
            tree current=root;
         int n=in.nextInt();
         if(root==null)
             root=new tree(n);
         
               else
             while(s==0)
             {
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
        
       
        Lca t=new Lca();
       tree f=  t.find(root,6,9);
         System.out.println(f.getdata());
       t.preorder(f,9);
       t.postorder(f, 6);
         
          
    }
    public tree find(tree root,int a,int b)
    {
        if(root!=null)
        {
        if(root.getdata()>a && root.getdata()>b)
         return   find (root.getleft(),a,b);
        else if
                (root.getdata()<a && root.getdata()<b)
            
           return find(root.getright(),a,b);
            else
            return root;
        }
        else
        {
         return null;
        }
        
         
    }
    public void preorder(tree root,int data)
    {
        
        if(root.getleft().getdata()!=data)
        {
                preorder(root.getleft(),data);
                 System.out.println(root.getdata());
         }
  
    }
     public void postorder(tree root,int data)
    {
        if(root.getright().getdata()!=data)
        {
            System.out.println(root.getdata());
            
              postorder(root.getleft(),data);
           
    }
        
    
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
                this.left=left;
                 this.right=right;
                    
           }
        public void setdata(int data)
        {
            this.data=data;
        }
        public void setleft(tree left)
        {
            this.left=left;
        }
        public void setright(tree right)
        {
            this.right=right;
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
        
}