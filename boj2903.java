package boj;

import java.util.Scanner;

public class boj2903 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int base = 2; // initial term
        int plus = 1;
        long res = 0; // result

        for(int i=0; i < N; i++) {

            if (i != 0)
                plus = plus*2;

            base += plus;
            res = base * base;
        }

        System.out.println(res);
    }
}