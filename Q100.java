package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/17.
 */
public class Q100 {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Scanner stdin = new Scanner(input);

        int i = 0, j = 0, x = 0, y = 0;
        while((i = stdin.nextInt()) != 0 && (j = stdin.nextInt()) != 0) {
            if(i < j) {
                x = i;
                y = j;
            } else {
                x = j;
                y = i;
            }

            int cycleLength = 1, maxCycleLengh = 1;
            for(int n = x; n < y + 1; n++) {
                cycleLength = getCycleLength(n);
                if(cycleLength > maxCycleLengh)
                    maxCycleLengh = cycleLength;
            }

            System.out.println(i + " " + j + " " + maxCycleLengh);
        }
    }
    static int getCycleLength(int n) {
        int cycleLength = 1;

        while(n != 1) {
            // 奇數
            if(n % 2 == 1)
                n = 3 * n + 1;
            else
                n = n / 2;
            cycleLength++;
        }

        return cycleLength;
    }
}
