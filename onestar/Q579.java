package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/18.
 */
public class Q579 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        // 輸入時間，直到輸入 0:00
        String s;
        int hour = 0, min = 0;
        float A, B, angle;
        while ((s = stdin.nextLine()) != null && !s.contentEquals("0:00")) {
            String[] sArray = s.split(":");
            hour = Integer.parseInt(sArray[0]);
            min = Integer.parseInt(sArray[1]);

            A = 0.5f * (hour * 60 + min);
            B = 6 * min;
            angle = A - B;

            Formatter f = new Formatter(System.out);
            if(angle > 180.0f) {
                f.format("%.3f\n", 360.0f - angle);
            } else {
                f.format("%.3f\n", angle);
            }
        }
    }
}
