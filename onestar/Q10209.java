package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 格子狀區域的面積 A = a 平方 * (1 - 根號 3 / 4 - 1 / 6 * pi)
 * 條狀區域的面積（中間那一塊） B = a 平方 * (1 - 根號 3 + 1 / 3 * pi)
 * 點狀區域的面積（ 4 個有點像正三角形的區域） C = a 平方 * (根號 3 / 2 - 1 + 1 / 12 * pi)
 */
public class Q10209 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        float a = 0.0f;
        double A = 0.0, B = 0.0, C = 0.0;

        while (stdin.hasNextLine()) {
            a = stdin.nextFloat();

            A = ( 1 - (Math.sqrt(3) / 4) - (Math.PI / 6) ) * a * a;
            B = ( 1 - Math.sqrt(3) + (Math.PI / 3) ) * a * a ;
            C = ( (Math.sqrt(3) / 2) - 1 + (Math.PI / 12) ) * a * a;

            System.out.printf("%.3f %.3f %.3f\n", B, 4* C, 4 * A);
        }
    }
}
