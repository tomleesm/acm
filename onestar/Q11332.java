package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Q11332 {
    public static void main(String[] args) {
        System.out.print("input n = ");
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = stdin.nextInt();
        int origin = n;

        if (n >= 10) {
            while (n >= 10) {
                int x = n;
                ArrayList<Integer> div = new ArrayList<Integer>();

                // 把 n 依照位數拆成一組整數
                int y = 0;
                while (x >= 10) {
                    n = x;

                    x = n / 10;
                    y = n % 10;

                    div.add(y);
                }
                div.add(x);

                // 加總所有位數
                int sum = 0;
                for (int i : div) {
                    sum += i;
                }
                n = sum;
            }
        }

        System.out.println("g(" + origin + ") = " + n);
    }
}