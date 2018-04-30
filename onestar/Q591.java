package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/18.
 */
public class Q591 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int n = 0, i = 0, move = 0, set = 0, sum = 0, height = 0;
        int[] brick;

        while((n = stdin.nextInt()) != 0) {
            brick = new int[n];
            for(i = 0; i < n; i++) {
                brick[i] = stdin.nextInt();
                sum += brick[i];
            }
            // 計算方塊要堆到的相同高度
            height = sum / n;

            // 計算搬動方塊最小的數目
            i = 0;
            while(i < n) {
                // 繼續找下一個
                if(brick[i] == height) {
                    i++;
                } else if(brick[i] > height) {
                    brick[i] -= 1;
                    // 找下一個是 < height 的
                    for(int j = i + 1; j < n; j++) {
                        if(brick[j] < height) {
                            brick[j] += 1;
                            move += 1;
                            i = 0; // 完成一個 +1 和 -1，從頭開始
                            break;
                        }
                    }
                } else if(brick[i] < height) {
                    brick[i] += 1;
                    // 找下一個是 > height 的
                    for(int j = i + 1; j < n; j++) {
                        if(brick[j] > height) {
                            brick[j] -= 1;
                            move += 1;
                            i = 0; // 完成一個 +1 和 -1，從頭開始
                            break;
                        }
                    }
                }
            }
            // Output
            set++;
            System.out.println("Set #" + set + "\nThe minimum number of moves is " + move + ".\n");
            // 顯示完畢，重新計算搬動方塊最小的數目
            move = 0;
        }
    }
}
