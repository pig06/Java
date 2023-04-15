package boj;

import java.util.Scanner;
import java.lang.Math;

public class boj4344{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int C = scan.nextInt(); // 테스트케이스 수
        int N; // 학생 수
        int M; // 평균을 넘는 학생 수
        double avg; // 평균 점수
        int[] scores = new int[1000]; // 각 학생들의 점수

        while (C > 0) {
            N = scan.nextInt(); // 학생수

            avg = 0;
            M = 0;

            for (int i = 0; i < N; i++) {
                scores[i] = scan.nextInt();
                avg += scores[i];
            }

            // 평균 산출
            avg = avg / (double) N;

            // 평균을 상회하는 학생 파악
            for (int i = 0; i < N; i++) {
                if (scores[i] > avg)
                    M++;
            }

            // 평균을 상회하는 학생들의 비율 (정답)
            double ratio = ((double)M / (double)N) * 100;
            ratio = (double)Math.round(ratio * 1000) / 1000;

            System.out.printf("%.3f", ratio);
            System.out.println("%");

            C--;
        }
    }
}