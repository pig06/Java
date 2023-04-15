package boj;

import java.util.Scanner;

public class boj10807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int V;
		int cnt = 0;
		int[] num = new int[101];
		
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			num[i] = scan.nextInt();
		}
		
		V= scan.nextInt();
		
		for(int val : num) {
			if (val == V) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		scan.close();
	}


}
