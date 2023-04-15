package boj;

import java.util.Scanner;

public class boj2566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int X = 1;
		int Y = 1;
		
		
		int[][] num = new int [9][9];
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j< 9; j++) {
				num[i][j] = scan.nextInt();
			}
		}
		
		int Max = num[0][0];
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j< 9; j++) {
				if (num[i][j] > Max)
				{
					Max = num[i][j];
					X = i+1;
					Y = j+1;
				}
			}
		}
		
		System.out.println(Max + "\n" + X + " " + Y);

	}

}
