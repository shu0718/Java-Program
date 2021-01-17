import java.io.*;
import java.util.*;

public class Main {
    //taking input of string
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
    
    //generate all substring.
    public static void solution(String str) {
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sc = str.substring(i,j);
                // initializing function to check whether the substring is palindrome or not
                if(Plaindrome(sc)==true){
                    System.out.println(sc);
                }
            }
        }
    }
    // function to check the substring is palindrome or not
     public static boolean Plaindrome(String ss){
         int l = 0;
         int r = ss.length()-1;
         while(r>=l){
             char ch1 = ss.charAt(l);
             char ch2 = ss.charAt(r);
             if(ch1==ch2){
                 l++;
                 r--;
             }
             else{
                 return false;
             }
         }
         return true;
     }
    
   
}
