package boj;

import java.util.Scanner;

public class boj10810 {

	public static void main(String[] args) {
		int N,M;
		int i, j, k;
		int [] num = new int[101];
		
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		
		for (int t = 0; t < M; t++) {
			i = scan.nextInt();
			j = scan.nextInt();
			k = scan.nextInt();
			
			for (int a = i; a < j + 1; a++) {
				num[a] = k;
				
			}
		}
		
		for (int t = 1; t< N +1; t++) {
			System.out.print(num[t] + " ");
		}
		scan.close();
	}
}
