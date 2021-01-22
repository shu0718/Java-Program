import java.io.*;
import java.util.*;

public class Main {

    public static String toggleCase(String str) {
        StringBuilder sc = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = sc.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char upc = (char)('A' + ch - 'a');
                sc.setCharAt(i, upc);
            } else {
                char lbc = (char)('a' + ch - 'A');
                sc.setCharAt(i, lbc);
            }
        }
        return sc.toString();

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}


INNPUT:-pepCODinG

OUTPUT:-
PEPcodINg
