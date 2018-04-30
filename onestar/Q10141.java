package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/26.
 */
public class Q10141 {
    static Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<String>();

        int n, p;
        while ((n = stdin.nextInt()) != 0 && (p = stdin.nextInt()) != 0) {
            Vendor[] vendors = new Vendor[p];
            inputRequestItems(n);

            // 輸入
            for (int i = 0; i < p; i++) {
                Vendor v = new Vendor();
                v.name = stdin.next();
                v.price = stdin.nextFloat();
                v.provideNum = stdin.nextInt();
                v.index = i;
                vendors[i] = v;

                inputRequestItems(v.provideNum);
            }

            /*
            for (int i = 0; i < vendors.length; i++) {
                System.out.println(vendors[i]);
            }
            System.out.println("----------------------------------");
            */

            // 依照可供應的品項數目 由大到小 排列
            for (int i = 1; i < vendors.length; i++) {
                int provideNum = vendors[i].provideNum;
                String name = vendors[i].name;
                float price = vendors[i].price;
                int index = vendors[i].index;
                int j = i - 1;  // 如果将赋值放到下一行的for循环内, 会导致在第10行出现j未声明的错误
                for (; j >= 0 && vendors[j].provideNum < provideNum; j--) {
                    vendors[j + 1].provideNum = vendors[j].provideNum;
                    vendors[j + 1].name = vendors[j].name;
                    vendors[j + 1].price = vendors[j].price;
                    vendors[j + 1].index = vendors[j].index;
                }
                vendors[j + 1].provideNum = provideNum;
                vendors[j + 1].name = name;
                vendors[j + 1].price = price;
                vendors[j + 1].index = index;
            }

            /*
            for (int i = 0; i < vendors.length; i++) {
                System.out.println(vendors[i]);
            }
            System.out.println("----------------------------------");
            */

            // 依照報價 由小到大 排列
            int maxProvideNum = vendors[0].provideNum;
            for (int i = 1; vendors.length > 1 && vendors[i].provideNum == maxProvideNum; i++) {
                int provideNum = vendors[i].provideNum;
                String name = vendors[i].name;
                float price = vendors[i].price;
                int index = vendors[i].index;
                int j = i - 1;  // 如果将赋值放到下一行的for循环内, 会导致在第10行出现j未声明的错误
                for (; j >= 0 && vendors[j].price > price; j--) {
                    vendors[j + 1].price = vendors[j].price;
                    vendors[j + 1].provideNum = vendors[j].provideNum;
                    vendors[j + 1].name = vendors[j].name;
                    vendors[j + 1].index = vendors[j].index;
                }
                vendors[j + 1].price = price;
                vendors[j + 1].provideNum = provideNum;
                vendors[j + 1].name = name;
                vendors[j + 1].index = index;
            }

            /*
            for (int i = 0; i < vendors.length; i++) {
                System.out.println(vendors[i]);
            }
            System.out.println("----------------------------------");
            */

            // 如果連報價都一樣，則選先輸入的廠商，經過測試，輸入順序會由小到大排列，所以取第一個就好
            result.add(vendors[0].name);
        }

        for(int i = 0; i < result.size(); i++) {
            System.out.format("RFP #%d\n%s\n\n", i + 1, result.get(i));
        }
    }

    static void inputRequestItems(int n) {
        String item;
        // 似乎只要有換行，就算一個 stdin.nextLine()，所以要多一個
        for (int i = 0; i < n + 1; i++) {
            item = stdin.nextLine();
        }
    }

}

class Vendor {
    public String name;
    public float price;
    public int provideNum;
    public int index;

    public String toString() {
        return String.format("[ %d, %s, %.2f, %d ]", index, name, price, provideNum);
    }
}