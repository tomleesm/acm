package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/19.
 */
public class Q10018 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int N = stdin.nextInt();

        int i, sum = 0, a, b, n, end;
        char[] p, after;
        int[][] result = new int[N][2];
        boolean isSame = true;

        for(int k = 0; k < N; k++) {
            p = stdin.next().toCharArray();

            for (i = 0; i < 1000; i++) {
                // 把數字反轉
                n = p.length;
                after = new char[n];

                for (int j = 0; j < n; j++)
                    after[n - 1 - j] = p[j];

                // 把反轉前後的 2 個數字相加
                a = Integer.parseInt(String.valueOf(p));
                b = Integer.parseInt(String.valueOf(after));
                sum = a + b;

                // 檢查和是不是迴文
                char[] sumArray = String.valueOf(sum).toCharArray();
                n = sumArray.length;
                end = (int) (n / 2 - (n % 2) / 2);
                for (int j = 0; j < end; j++) {
                    if (!(sumArray[j] == sumArray[n - 1 - j])) {
                        isSame = false;
                        break;
                    } else {
                        isSame = true;
                    }
                }
                if (isSame) {
                    break;
                } else {
                    p = sumArray;
                }
            }
            result[k][0] = i + 1;
            result[k][1] = sum;
        }
        for(int k = 0; k < N; k++) {
            System.out.format("%d %d\n", result[k][0], result[k][1]);
        }
    }
}
