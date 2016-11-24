package onestar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/17.
 */
public class Q272 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s, replace = "``";

        while((s = stdin.nextLine()) != null && s.length() != 0) {
            char[] stringArray = s.toCharArray();

            for(int i = 0; i < stringArray.length; i++) {
                char c = stringArray[i];
                if(c == '"') {
                    System.out.print(replace);
                    if(replace.contentEquals("``"))
                        replace = "''";
                    else
                        replace = "``";
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
