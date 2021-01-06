package cs10_week1;

import java.util.Scanner;

public class Boj1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        int[] results = new int[test];

        for (int i = 0; i < test; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            a %= 10;
            if (a == 1 || a == 5 || a == 6) {
                b = 1;
            } else if (a == 3 || a == 7) {
                b %= 4;
            } else if (a == 2 || a == 8) {
                b %= 4;
                if (b == 0) b = 4;
            } else if (a == 4 || a == 9) {
                b %= 2;
                if (b == 0) b = 2;
            }
            int result = 1;
            for (int j = 0; j < b; j++) {
                result *= a;
            }

            result %= 10;

            if (result == 0) {
                result = 10;
            }
            results[i] = result;
        }

        for (int result : results) {
            System.out.println(result);
        }
    }
}
