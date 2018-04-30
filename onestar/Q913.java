package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/19.
 */
public class Q913 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        long N = stdin.nextLong();
        double sum = 1.5 * N * N + 3 * N -7.5;
        System.out.format("%.0f", sum);
    }
}
