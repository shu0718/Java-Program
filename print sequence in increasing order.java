import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 1;
        printIncreasing(n, count);
    }

    public static void printIncreasing(int n, int count) {

        if (count == n) {
            System.out.println(count);
            return;
        } else {
            System.out.println(count);
        }
        printIncreasing(n, count + 1);
    }

}

INPUT:-5
OUTPUT:-
1
2
3
4
5
