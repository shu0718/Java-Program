import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String ss = scn.next();
        int len = ss.length();
        int n = factorial(len);
        for(int i=0;i<n;i++){
            StringBuilder ss1 = new StringBuilder(ss);
            int temp = i;
            for(int div=len;div>=1;div--)
            {
                int q = temp/div;
                int r = temp%div;
                System.out.print(ss1.charAt(r));
                ss1.deleteCharAt(r);
                temp = q;
                
            }
            System.out.println();
        }
    }
    public static int factorial(int a){
        if(a==0){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }
    }
}

HINT:-https://www.youtube.com/watch?v=39SKIuA-ieY

INPUT:-abc
OUTPUT:-
abc
bac
cab
acb
bca
cba
