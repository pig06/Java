package boj;

import java.util.Scanner;

public class boj2738 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N,M;
		N = scan.nextInt();
		M = scan.nextInt();
		
		int[][] num = new int [100][100];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j< M; j++) {
				num[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				num[i][j] += scan.nextInt();
			}
		}
		
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

}
