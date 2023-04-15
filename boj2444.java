package boj;

import java.lang.Math;
import java.util.Scanner;

public class boj2444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 
		 int N = scan.nextInt();
		 
		 for(int i = 1; i <= 2*N-1 ;i++)
		 {
			int num = Math.abs(N - i);
			System.out.print(" ".repeat(num));
			System.out.print("*".repeat(((2*N)-1) - (2*num)));
			System.out.println();
		 }
	}

}
