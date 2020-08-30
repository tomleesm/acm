package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q11364 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int m = stdin.nextInt();

        int n = 0;
        for (int i = 0; i < m; i++) {
            n = stdin.nextInt();
            // 找出最大和最小值
            int max = -1, min = -1, x;
            for (int j = 0; j < n; j++) {
                x = stdin.nextInt();
                // 輸入第一個值
                if(max == min && min == -1) {
                    min = x;
                    max = x;
                } else {
                    if(x < min) {
                        min = x;
                    } else if(x > max) {
                        max = x;
                    }
                }
            }
            // 最短距離 = ( max - min ) * 2
            int d = (max - min) * 2;
            System.out.println("min distance = " + d);
        }
    }
}
