import java.io.*;
import java.util.*;

public class Main {

    public static String compression1(String str) {
        String ss = String.valueOf(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);
            if(ch1 != ch2){
                ss += String.valueOf(ch1);
            }
        }
        return ss;
    }
    
public static void main(String[] args) 
{
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));  
        
}
}




INPUT :- aaabbbcccffsrrtt

OUTPUT :- abcfsrt
