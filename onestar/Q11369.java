package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q11369 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int m = stdin.nextInt();

        for (int i = 0; i < m; i++) {
            // 輸入所有商品價格
            int n = stdin.nextInt();
            ArrayList<Integer> products = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                products.add(stdin.nextInt());
            }

            // 由大到小排列
            Collections.sort(products, Collections.reverseOrder());

            // 每3個一組，每組最小的加總即爲所求
            int sum = 0;
            for (int k = 2; k < products.size(); k += 3) {
                sum += products.get(k);
            }
            System.out.println("max save cost: " + sum);
        }
    }
}
