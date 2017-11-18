/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

/**
 *
 * @author shaharyar
 */
public class Multi extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Multi t1=new Multi();
        Multi t2=new Multi();
        Multi t3=new Multi();
        t1.setPriority(1);
        t2.setPriority(3);
        t3.setPriority(2);
        t1.start();
        try
        {
            t1.join();
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
        t2.start();
        t3.start();
                
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(500*i);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("answer "+Thread.currentThread().getName());
            System.out.println(i+1);
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
        }
    }
}
