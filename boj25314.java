package boj;

import java.util.Scanner;

public class boj25314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for (int i = 0; i < N/4; i++) {
			System.out.print("long ");
		}
		
		System.out.print("int");
		scan.close();
	}

}
