package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/27.
 */
public class Q10300 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int n = stdin.nextInt();
        for (int i = 0; i < n; i++) {
            int f = stdin.nextInt(), money = 0;
            for (int j = 0; j < f; j++) {
                int area = stdin.nextInt(), animalCount = stdin.nextInt(), level = stdin.nextInt();
                money += area * level;
            }
            System.out.println(money);
        }
    }
}
