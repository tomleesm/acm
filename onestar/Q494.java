package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/18.
 */
public class Q494 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        char[] sentence = stdin.nextLine().toCharArray();

        int count = 0, token = 0;
        char c;
        for(int i = 0; i < sentence.length; i++) {
            c = sentence[i];
            if(isLetter(c)) {
                token = 1;
            } else if(token == 1 && !isLetter(c)) {
                token = 0;
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean isLetter(char c) {
        return  'A' < c && c < 'z';
    }
}
