package boj;

import java.util.Scanner;

public class boj10811 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, M;
		
		int[] arr = new int[101];
		
				
		N = scan.nextInt();
		M = scan.nextInt();

		// 배열 초기화
		for (int idx = 1; idx <= N; idx++) {
			arr[idx] = idx;
		}

		//연산 수행 (M회) : Swap을 이용한 구현
		int temp;
		
		for (int idx = 1; idx <= M; idx++) {
			int i, j;
			i = scan.nextInt();
			j = scan.nextInt();
			
			temp = 0;
			
			for(int num = 0; num < ((j - i) + 1)/2; num++) {
				temp = arr[i + num];
				arr[i + num] = arr[j - num];
				arr[j - num] = temp;
			}
			
			
			// i번째 바구니에서 j번째 바구니의 순서를 역전
			
		}
		
		
		// 결과 출력
		for (int idx = 1; idx <= N; idx++) {
			System.out.print(arr[idx] + " ");
		}
		
		// 개행
		System.out.println();
	}

}