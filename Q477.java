package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/18.
 */
public class Q477 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Object[] shape = new Object[10];
        int i = 0;
        String type;
        // 輸入矩型或圓形
        while (!((type = stdin.next()).contentEquals("*")) && i < 10) {
            if (type.contentEquals("r")) {
                shape[i] = new Rectangle(stdin.nextFloat(),
                        stdin.nextFloat(),
                        stdin.nextFloat(),
                        stdin.nextFloat());
            } else if(type.contentEquals("c")) {
                shape[i] = new Cicle(stdin.nextFloat(),
                        stdin.nextFloat(),
                        stdin.nextFloat());
            }
            i++;
        }

        // 輸入點，並顯示比對結果
        float a, b;
        int p = 1;
        String msg;
        while ( (a = stdin.nextFloat()) != 9999.9f &&
                (b = stdin.nextFloat()) != 9999.9f) {
            boolean hasContained = false;

            for (i = 0; i < shape.length; i++) {
                // shape 陣列並沒有全部用到，所以有 null
                if (pointContainedInFigure(a, b, shape[i])) {
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

    static boolean pointContainedInFigure(float a, float b, Object shape) {
        if(shape == null) return false;
        if(shape instanceof Rectangle) {
            Rectangle rect = (Rectangle)shape;
            // x1 < a < x2 AND y1 < b < y2
            return rect.x1 < a && a < rect.x2 && rect.y1 < b && b < rect.y2;
        } else if(shape instanceof Cicle) {
            Cicle cicle = (Cicle) shape;
            // 點 (a, b) 到圓心 (x, y) 的距離小於半徑
            return Math.hypot(a - cicle.x, b - cicle.y) < cicle.r;
        }
        return false;
    }
}
// class Rectangle 在 Q476
class Cicle {
    float x, y, r;

    public Cicle(float x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}