package boj;

import java.util.Scanner;

public class boj10798{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrStr = new String[5];

        for (int i = 0; i < 5; i++)
            arrStr[i] = scan.next();

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {

                if(arrStr[i].length() <= j)
                    continue;

                System.out.print(arrStr[i].charAt(j));
            }
        }

    }

}
