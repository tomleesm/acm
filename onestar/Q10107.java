package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/20.
 */
public class Q10107 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        ArrayList<Integer> iArray = new ArrayList<Integer>();
        for (int N = 0; N < 10000; N++) {
            int i = stdin.nextInt();
            iArray.add(i);
            Collections.sort(iArray);

            int n = iArray.size();
            int median;
            if (n % 2 == 1) {
                median = iArray.get((n - 1) / 2);
            } else {
                median = (iArray.get(n / 2) + iArray.get(n / 2 - 1)) / 2;
            }
            System.out.println(median);
        }
    }
}
