package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/27.
 */
public class Q10370 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int C = stdin.nextInt();
        for (int i = 0; i < C; i++) {
            int N = stdin.nextInt();
            int[] grade = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                grade[j] = stdin.nextInt();
                sum += grade[j];
            }
            // 計算全班平均
            float avg = (float) sum / (float) N;
            // 計算成績大於平均的學生人數
            int higherThanAvg = 0;
            for (int j = 0; j < N; j++) {
                if(grade[j] > avg)
                    higherThanAvg++;
            }
            float result = (float) higherThanAvg / (float) N * 100;
            System.out.format("%.3f%%\n", result);
        }
    }
}
