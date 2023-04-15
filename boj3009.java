package boj;

import java.util.Arrays;
import java.util.Scanner;

public class boj3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] coorX = new int[3];
		int[] coorY = new int[3];
		
		for(int i = 0; i < 3; i++) {
			coorX[i] = scan.nextInt();
			coorY[i] = scan.nextInt();
		}
		
		Arrays.sort(coorX);
		Arrays.sort(coorY);
		
		if (coorX[1] == coorX[0]) {
			System.out.print(coorX[2] + " ");
		}
		else 
			System.out.print(coorX[0] + " ");
		
		if (coorY[1] == coorY[0]) {
			System.out.println(coorY[2]);
		}
		else 
			System.out.println(coorY[0]);
		
	}

}
