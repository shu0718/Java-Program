import java.io.*;
import java.util.*;

public class Main {
    public static boolean isPrime(int val){
        for(int i=2;i*i<=val;i++){
            if(val%i==0){
                return true;
            }
        }
        return false;
    }
    public static void solution(ArrayList < Integer > al) {
        for (int i = al.size()-1; i>=0; i--){
            int val = al.get(i);
            if(isPrime(val) == false){
                al.remove(i);
            }

        }


    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList < Integer > al = new ArrayList < > ();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }

}







INPUT:-
4
3 12 15 17

OUTPUT:-
12 15
