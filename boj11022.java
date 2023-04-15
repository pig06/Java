package boj;

import java.util.Scanner;

public class boj11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A;
		int B;
		int x;
		
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		
		for (int i = 0; i < x; i++)
		{
			A = scan.nextInt();
			B = scan.nextInt();
			
			System.out.println("Case #" + (i+1) + ": " + A + " + " +  B + " = " + (A+B));
		}
		
		scan.close();
	}

}
/*
package boj;

import java.util.Scanner;

public class boj11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A;
		int B;
		int x;
		
		String format = "Case #%d: %d + %d = %d\n";
		
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		
		for (int i = 0; i < x; i++)
		{
			A = scan.nextInt();
			B = scan.nextInt();
			
			System.out.println(format, i+1, A, B, A+B);
		}
		
		scan.close();
	}

}
*/
