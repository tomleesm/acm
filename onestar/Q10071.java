package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/20.
 */
public class Q10071 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        float v = stdin.nextFloat(), t = stdin.nextFloat(), a;
        // 避免除以零
        if(t > 0)
            a = v / t;
        else
            a = 0.0f;

        float x = 2 * a * t * t;
        System.out.format("%.0f", x);
    }
}
