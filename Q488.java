package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/18.
 */
public class Q488 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        // 輸入有幾組資料
        int n = stdin.nextInt();
        System.out.println();

        // wave[組數][0] = A, wave[組數][1] = F
        int[][] wave = new int[n][2];
        for (int i = 0; i < n; i++) {
            wave[i][0] = stdin.nextInt(); // A
            wave[i][1] = stdin.nextInt(); // F
            System.out.println();
        }

        int A = 0, F = 0;
        for (int i = 0; i < n; i++) {
            A = wave[i][0];
            F = wave[i][1];

            for (int j = 0; j < F; j++) {
                for (int k = 1; k <= A; k++) {
                    for (int L = 0; L < k; L++)
                        System.out.print(k);
                    System.out.println();
                }
                for (int k = A - 1; k > 0; k--) {
                    for (int L = k; L > 0; L--)
                        System.out.print(k);
                    System.out.println();
                }

                System.out.println();
            }
        }
    }
}
