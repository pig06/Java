package boj;

import java.util.Scanner;

public class boj3003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIZE = 6;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < SIZE;i++)
		{
			int inputVal = scan.nextInt();
			
			if(i < 2)
			{
				System.out.print((1 - inputVal) + " ");
				continue;
			}
			else if(i < 5)
			{
				System.out.print((2 - inputVal) + " ");
				continue;
			}
			else
			{
				System.out.print((8 - inputVal) + " ");
				continue;
			}
			
			
		}
		System.out.println();
		
		scan.close();
	}
	
}
