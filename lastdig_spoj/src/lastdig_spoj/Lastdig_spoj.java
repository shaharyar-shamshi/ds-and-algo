/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastdig_spoj;

import java.math.BigInteger;
import java.util.Scanner;
public class Lastdig_spoj {
    	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i < testCases; i++){
			BigInteger a = scan.nextBigInteger();
			BigInteger b = scan.nextBigInteger();
			BigInteger lastDigit = b.modPow(a, BigInteger.valueOf(10));
			System.out.println(lastDigit);
		} 

}
    
}
