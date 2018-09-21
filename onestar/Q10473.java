package onestar;

import java.util.Scanner;

public class Q10473 {
    static String[] A2F = {"A", "B", "C", "D", "E", "F"};
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String result = "";
        int A = 0, B = 0;

        while ((A = stdin.nextInt()) >= 0) {
            while(A >= 16) {
                B = A % 16;
                result += convertAF(B);
                A /= 16;
            }
            result += convertAF(A);
            System.out.printf("%s%s\n",
                    "0x",
                    reverseString(result));
            // 清空輸入的字串，否則會一直累加
            result = "";
        }
    }
    private static String convertAF(int n) {
        if(n < 10) return Integer.toString(n);
        return A2F[ (n - 10) ];
    }

    private static String reverseString(String result) {
        int len = result.length() - 1, i = len;
        char n;
        String newResult = "";

        while (i >= 0) {
            newResult += result.charAt(i);
            i--;
        }

        return newResult;
    }
}
