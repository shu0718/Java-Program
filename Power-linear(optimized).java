import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int p = power(n,x);
        System.out.println(p);
    }

    public static int power(int n, int x) {
        if(x == 0){
            return 1;
        }
        else if(x==1){
            return n;
        }
        else{
            if(x%2==0){
                return power(n,x/2)*power(n,x/2);
            }
            else{
                return power(n,x/2)*power(n,x/2)*n;
            }
        }
    }

}

INPUT:-
2
5

OUTPUT:-
32




HINT:---
f(n)=[n/2*n/2 if x is even]
     [n/2*n/2*n if x is odd]
