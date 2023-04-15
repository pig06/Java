package boj; 

import java.util.Scanner;

public class boj2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		
		byte val1 = scan.nextByte();
		byte val2 = scan.nextByte();
		byte val3 = scan.nextByte();

		
		int equals = 0;
		byte max = 0;
		
		if(val1 == val2 && val2 == val3) {
			equals = 3;
			max = val1;
		}
		else if(val1 == val2 || val2 == val3 || val1 == val3) {
			equals = 2;
			
			if(val1 == val2)
				max = val1;
			else if(val2 == val3)
				max = val2;
			else if(val3 == val1)
				max = val3;
		}
		else {
			equals = 1;
			
			max = val1 > val2 ? val1 : val2;
			max = val3 > max ? val3 : max;
		}
		if(equals == 3)
			System.out.println(10000 + max*1000);
		else if(equals == 2)
			System.out.println(1000 + max*100);
		else
			System.out.println(max*100);
		
		scan.close();
		
		return;
	}

}
