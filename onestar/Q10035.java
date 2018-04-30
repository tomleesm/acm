package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/19.
 */
public class Q10035 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int a = 0, b = 0;
        while((a = stdin.nextInt()) != 0 && (b = stdin.nextInt()) != 0) {
            char[] aArray = String.valueOf(a).toCharArray(),
                   bArray = String.valueOf(b).toCharArray();
            int n = aArray.length;
            int carry = 0, extra = 0, sum = 0;
            for(int i = n - 1; i >= 0; i--) {
                sum = Character.getNumericValue(aArray[i]) + Character.getNumericValue(bArray[i]) + extra;
                if(sum >= 10) {
                    carry++;
                    extra = 1;
                } else {
                    extra = 0;
                }
            }
            if(carry == 0) {
                System.out.println("No carry operation.");
            } else if(carry == 1) {
                System.out.println(carry + " carry operation.");
            } else if(carry > 1) {
                System.out.println(carry + " carry operations.");
            }
        }
    }
}
