package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/17.
 */
public class Q476 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Rectangle[] rect = new Rectangle[10];
        int i = 0;

        // 輸入矩型
        while (stdin.next().contentEquals("r") && i < 10) {
            rect[i] = new Rectangle(stdin.nextFloat(),
                    stdin.nextFloat(),
                    stdin.nextFloat(),
                    stdin.nextFloat());
            i++;
        }
        // 輸入點，並顯示比對結果
        float a, b;
        int p = 1;
        String msg;
        while ( (a = stdin.nextFloat()) != 9999.9f &&
                (b = stdin.nextFloat()) != 9999.9f) {
            boolean hasContained = false;

            for (i = 0; i < rect.length; i++) {
                // rect 陣列並沒有全部用到，所以有 null
                if (rect[i] != null && pointContainedInFigure(a, b, rect[i])) {
                    msg = "Point " + p + " is contained in figure " + (i + 1);
                    System.out.println(msg);
                    hasContained = true;
                }
            }
            if (!hasContained) {
                msg = "Point " + p + " is not contained in any figure";
                System.out.println(msg);
            }
            p++;
        }
    }

    static boolean pointContainedInFigure(float a, float b, Rectangle rect) {
        return rect.x1 < a && a < rect.x2 && rect.y1 < b && b < rect.y2;
    }
}

class Rectangle {
    float x1, y1, x2, y2;

    public Rectangle(float x1, float y2, float x2, float y1) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}
