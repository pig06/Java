package boj;

import java.util.Scanner;

public class boj25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X;
		int N;
		int a;
		int b;
		int total = 0;
		
		Scanner scan = new Scanner(System.in);
		
		X = scan.nextInt();
		N = scan.nextInt();
		
		for (int i = 0; i< N; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			
			total += a * b;
		}
		
		if (X == total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		scan.close();
	}

}
