package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/19.
 */
public class Q10038 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int n = stdin.nextInt();
        int[] nArray = new int[n];
        for(int i = 0; i < n; i++)
            nArray[i] = stdin.nextInt();

        int abs;
        boolean jolly = true;
        for(int i = 1; i < n; i++) {
            abs = Math.abs(nArray[i - 1] - nArray[i]);
            if(abs < 1 || abs > (n - 1)) {
                jolly = false;
                break;
            }
        }
        if(jolly)
            System.out.println("Jolly");
        else
            System.out.println("Not jolly");
    }
}
