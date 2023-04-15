package boj;

import java.util.Scanner;
import java.util.Arrays;

public class boj5073 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] side = new int[3];
		side[0] = scan.nextInt();
		side[1] = scan.nextInt();
		side[2] = scan.nextInt();
		
		int a = 0 , b = 0, c = 0;
		while(side[0] != 0 && side[1] != 0 && side[2] != 0) {
			
			
			
			Arrays.sort(side);
			
			a = side[0];
			b = side[1];
			c = side[2];
			
			if (a + b > c) {
				if (a == b&& b == c)
					System.out.println("Equilateral");
				else if (a == b || b == c)
					System.out.println("Isosceles");
				else
					System.out.println("Scalene");
				
			}
				
			else
			{
				System.out.println("Invalid");
			}
				
			side[0] = scan.nextInt();
			side[1] = scan.nextInt();
			side[2] = scan.nextInt();
			

		
		}
	}
}
