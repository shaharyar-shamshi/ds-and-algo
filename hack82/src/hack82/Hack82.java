/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack82;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Hack82 {

    




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
Scanner ss=new Scanner (System.in);
int n=ss.nextInt();
int arr[]=new int [n];

int r=ss.nextInt();

int fact=1; 
int fact1=1;
int fact2=1;


//It is the number to calculate factorial    
for( int y=1;y<=n;y++){    
    fact=fact*y;    
} 
for( int y=1;y<=r;y++){    
    fact1=fact1*y;    
} 
int h=n-r;
for( int y=1;y<=h;y++){    
    fact2=fact2*y;    
}
int l=fact*fact2/fact1;

for(int i=0;i<n;i++){
	arr[i]=ss.nextInt();

}
Hack82 sha=new Hack82();

sha.printCombination(arr, n, r,l);


}
	void combinationUtil(int arr[], int data[], int start,
            int end, int index, int r,int l,int def,int xyz[])
{

		
if (index == r)
{
for (int j=0; j<r; j++)
System.out.print(data[j]+" ");
System.out.println("");


xyz[def]=andarray(data, r);

System.out.println(xyz[def]);
def++;
return;
}


for (int i=start; i<=end && end-i+1 >= r-index; i++)
{
data[index] = arr[i];
combinationUtil(arr, data, i+1, end, index+1, r,l,def,xyz);
}
}

	
	
	
	
	int andarray(int data[],int r)
        {
		
		int result=data[0];
		for(int i=1;i<r;i++){
			result=result&data[i];
                        
		}
		
		
			
		return result;	
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

 void printCombination(int arr[], int n, int r,int l)
{

int data[]=new int[r];
int def=0;
int xyz[]=new int [l];
combinationUtil(arr, data, 0, n-1, 0, r,l,def,xyz);
for(int i=0;i<l;i++){
	
	System.out.println(xyz[i]);
}

}

}
    
    

