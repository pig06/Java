package boj;

import java.util.Scanner;

public class boj10812 {

	public static void main(String[] args) {
		int N; // 바구니의 개수
		int M; // 회전 횟수
		int i, j, k;
		
		int[] basket = new int[101];
		int[] temp = new int[101]; // 임시값 저장용 변수
		
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		
		for (int reps=1; reps<N+1; reps++) {
			basket[reps] = reps;
		}
		
		M = scan.nextInt();
		
		for (int reps=0; reps<M; reps++) {
			i = scan.nextInt(); // 회전 시작 인덱스
			k = scan.nextInt(); // 회전 끝 인덱스
			j = scan.nextInt(); // 회전 기준 인덱스
			
			// 기준 인덱스 이전 값들을 저장
			int idx = 0;
			for (int rev=i; rev<j; rev++) {
				temp[idx] = basket[rev];
				idx++;
			}
			
			// 기준 인덱스부터 끝 인덱스까지를 앞으로 당기는 로직
			int head = i;
			for (int rev=j; rev<k+1; rev++) {
				basket[head] = basket[rev];
				head++;
			}
			
			// 꼬리에 이전 값들을 이어붙이는 로직
			for(int rev=0; rev<idx; rev++) {
				basket[head] = temp[rev];
				head++;
			}
		}
		
		// 바구니의 내용을 출력
		for (int reps=1; reps<N+1; reps++) {
			System.out.print(basket[reps] + " ");
		}
		
		System.out.println(); // 개행 (New line)
		scan.close();
	}

}