/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack1d;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Hack1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        tree head=null;
       
        for(int i=0;i<n;i++)
        {
            tree current=head;
            int val=in.nextInt();
            if(head==null)
            {
                head=new tree(val);
                current=head;
            }
            else
            {
                int s=0;
                while(s==0)
                {
                if(current.getdata()>=val)
                {
                    if(current.getleft()==null)
                    {
                        tree temp=new tree(val);
                        current.setleft(temp);
                        s=1;
                    }
                    else
                    {
                        current=current.getleft();
                    }
                }
                else
                {
                    if(current.getright()==null)
                    {
                        tree temp=new tree(val);
                        current.setright(temp);
                        s=1;
                    }
                    else
                    {
                        current=current.getright();
                    }
                }
            }
            
        }
        }
        Hack1d rs=new Hack1d();
       // rs.inorder(head);
        int height=rs.height(head);
        System.out.println(height);
        
    }
    public int height(tree node)
    {
        if(node==null)
            return 0;
        int l=height(node.getleft());
        int r=height(node.getright());
        if(l>r)
            return l+1;
        else
            return r+1;
        
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