package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/20.
 */
public class Q10062 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        String s;
        while ((s = stdin.nextLine()) != null && s.length() != 0) {
            char[] sArray = s.toCharArray();
            int[][] result = new int[1000][2];
            int currentASCIICode;

            for (int i = 0; i < sArray.length; i++) {
                currentASCIICode = (int) sArray[i];
                for (int j = 0; j < result.length; j++) {
                    if (result[j][0] == 0) {
                        result[j][0] = currentASCIICode;
                        result[j][1] = 1;
                        break;
                    } else if (result[j][0] == currentASCIICode) {
                        result[j][1]++;
                        break;
                    }
                }
            }

            /*
            for (int i = 0; result[i][0] > 0; i++) {
                System.out.format("%d %d\n", result[i][0], result[i][1]);
            }
            System.out.println("----------------------------------");
            */

            // 依照 count 排序
            for (int i = 1; result[i][0] > 0; i++) {
                int count = result[i][1], asciiCode = result[i][0];
                int j = i - 1;
                for (; j >= 0 && result[j][1] > count; j--) {
                    result[j + 1][1] = result[j][1];
                    result[j + 1][0] = result[j][0];
                }
                result[j + 1][1] = count;
                result[j + 1][0] = asciiCode;
            }

            /*
            for (int i = 0; result[i][0] > 0; i++) {
                System.out.format("%d %d\n", result[i][0], result[i][1]);
            }
            System.out.println("----------------------------------");
            */

            // 如果 count 相同，ASCII code 由大到小排列
            // vvwvwecbfwAAACCC
            ArrayList<Integer> kArr = new ArrayList<Integer>();
            for (int i = 0; i < result.length; i++) {
                if (i == 0 && result[i][1] == result[i + 1][1]) {
                    kArr.add(i + 1);
                } else if ( i > 0 && result[i][1] > 0 && result[i][1] != result[i - 1][1] && result[i][1] == result[i + 1][1]) {
                    kArr.add(i + 1);
                }
            }

            //System.out.println(kArr);

            for (int k : kArr) {
                for (int i = k; result[i][1] == result[k][1]; i++) {
                    int asciiCode = result[i][0], count = result[i][1];
                    int j = i - 1;
                    for (; j >= k - 1 && result[j][0] < asciiCode; j--) {
                        result[j + 1][0] = result[j][0];
                        result[j + 1][1] = result[j][1];
                    }
                    result[j + 1][0] = asciiCode;
                    result[j + 1][1] = count;
                }
            }

            for (int n = 0; result[n][0] > 0; n++) {
                System.out.format("%d %d\n", result[n][0], result[n][1]);
            }
            System.out.println();
        }
    }
}
