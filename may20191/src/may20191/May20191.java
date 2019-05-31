/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package may20191;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shaharyar
 */
public class May20191 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scan scan=new Scan();
        int testcase = 0;
        try {
            testcase = scan.scanInt();
        } catch (IOException ex) {
            Logger.getLogger(May20191.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int j=0;j<testcase;j++) {
        int n = scan.scanInt();
        BigInteger temp = BigInteger.valueOf(n);
        for (int i =0; i< n-1; i++) {
          BigInteger x = BigInteger.valueOf(i+1);
          temp = x.add(temp).add(x.multiply(temp)) ;
        }
        System.out.println(temp.mod(BigInteger.valueOf(1000000007)));
        }
        
    }
}
class Scan
{
    private byte[] buf=new byte[1024];    //Buffer of Bytes
    private int index;
    private InputStream in;
    private int total;
    public Scan()
    {
        in=System.in;
    }
    public int scan()throws IOException    //Scan method used to scan buf
    {
        if(total<0)
        throw new InputMismatchException();
        if(index>=total)
        {
            index=0;
            total=in.read(buf);
            if(total<=0)
            return -1;
        }
        return buf[index++];
    }
    public int scanInt()throws IOException
    {
        int integer=0;
        int n=scan();
        while(isWhiteSpace(n))    //Removing starting whitespaces
        n=scan();
        int neg=1;
        if(n=='-')                //If Negative Sign encounters
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n))
        {
            if(n>='0'&&n<='9')
            {
                integer*=10;
                integer+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        return neg*integer;
    }
    private boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
        return true;
        return false;
    }
}