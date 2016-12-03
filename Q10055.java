package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/19.
 */
public class Q10055 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int a = stdin.nextInt(), b = stdin.nextInt();
        int D = a - b;

        if(D >= 0) {
            System.out.println(D);
        } else if(D < 0) {
            System.out.println(-D);
        }
    }
}