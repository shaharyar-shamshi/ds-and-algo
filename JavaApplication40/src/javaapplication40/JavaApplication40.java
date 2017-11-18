/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class JavaApplication40 {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
               int count=0;
        int n=in.nextInt();
        int numbers[] = new int[n];
        for(int i=0;i<n;i++)
        {
            numbers[i]=in.nextInt();
            if(numbers[i]==0)
                count++;
                
        }
 
        
 
        
        quickSortInDescendingOrder(numbers,0,numbers.length-1);
 
        
        
        for(int i=n-count-1;i>=0;i--)
        {
            System.out.print(numbers[i]+" ");
        }
        for(int i=0;i<count;i++)
        {
            System.out.print("0 ");
        }
 
    }
 
    //This method sorts the input array in descending order using quick sort
    public static void quickSortInDescendingOrder (int[] numbers, int low, int high)
    {
 
        int i=low;
        int j=high;
        int temp;
        int middle=numbers[(low+high)/2];
 
        while (i<j)
        {
            while (numbers[i]>middle)
            {
                i++;
            }
            while (numbers[j]<middle)
            {
                j--;
            }
            if (j>=i)
            {
                temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
                i++;
                j--;
            }
        }
 
 
        if (low<j)
        {
            quickSortInDescendingOrder(numbers, low, j);
        }
        if (i<high)
        {
            quickSortInDescendingOrder(numbers, i, high);
        }
    }
}
