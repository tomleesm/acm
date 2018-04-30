package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/27.
 */
public class Q10340 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        char[] s, t;
        while((s = stdin.next().toCharArray()).length != 0 && (t = stdin.next().toCharArray()).length != 0) {
            boolean[] result = new boolean[s.length];

            int j = 0;
            for (int i = 0; i < s.length; i++) {
                char sc = s[i];

                while (j < t.length) {
                    char tc = t[j];

                    if(tc == sc) {
                        j = j + 1;
                        result[i] = true;
                        break;
                    }
                    j++;
                }
            }

            //System.out.println(java.util.Arrays.toString(result));

            String msg = "Yes";
            for (int i = 0; i < result.length; i++) {
                if(result[i] == false) {
                    msg = "No";
                    break;
                }
            }
            System.out.println(msg);
        }
    }
}
