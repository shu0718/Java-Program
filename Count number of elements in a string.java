import java.io.*;
import java.util.*;

public class Main {

public static String compression2(String str) {
        String ssc = String.valueOf(str.charAt(0));
        int count = 1;
        for(int i=1;i<str.length();i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);
            if(ch1 == ch2){
                count+=1;
            } else{
                if(count>1){
                    ssc += count;
                    count = 1;
                }
                ssc += String.valueOf(ch1);
            }
        }
        //for last element count is greater than 1
        if(count>1){
            ssc += count;
            count = 1;
        }
        return ssc;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression2(str));
    }

}





INPUT :- aabbccdde

OUTPUT :- a2b2c2d2e
