package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/27.
 */
public class Q10222 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        char[] s;
        while((s = stdin.nextLine().toCharArray()).length != 0) {
            for(char c : s) {
                System.out.print(convertToRightChar(c));
            }
            System.out.println();
        }
    }
    static char convertToRightChar(char c) {
        switch (c) {
            case 'e': return 'q';
            case 'd': return 'a';
            case 'c': return 'z';
            case 'r': return 'w';
            case 'f': return 's';
            case 'v': return 'x';
            case 't': return 'e';
            case 'g': return 'd';
            case 'b': return 'c';
            case 'y': return 'r';
            case 'h': return 'f';
            case 'n': return 'v';
            case 'u': return 't';
            case 'j': return 'g';
            case 'm': return 'b';
            case 'i': return 'y';
            case 'k': return 'h';
            case ',': return 'n';
            case 'o': return 'u';
            case 'l': return 'j';
            case '.': return 'm';
            case 'p': return 'i';
            case ';': return 'k';
            case '/': return ',';
            case '[': return 'o';
            case '\'': return 'l';
            case ']': return 'p';
            case '\\': return '[';

            case '3': return '1';
            case '4': return '2';
            case '5': return '3';
            case '6': return '4';
            case '7': return '5';
            case '8': return '6';
            case '9': return '7';
            case '0': return '8';
            case '-': return '9';
            case '=': return '0';
            case '2': return '`';
        }
        return c;
    }
}
