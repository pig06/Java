package boj;

import java.util.Scanner;

public class boj5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[31];
		for (int i = 1; i <= 28; i++) {
			int a = scan.nextInt();
			num[a] = a;
		}
		for (int i = 1; i <= 30; i++) {
			if(num[i] == 0)
			{
				System.out.println(i);
			}
		}
		
		
	}

}
