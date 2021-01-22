import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String ss = scn.next();
        StringBuilder sc = new StringBuilder("");
        for(int i=0;i<ss.length()-1;i++){
            char ch1 = ss.charAt(i);
            char ch2 = ss.charAt(i+1);
            int sub = ch2-ch1;
            sc.append(ch1);
            sc.append(sub);
            
            
        }
        sc.append(ss.charAt(ss.length()-1));
        System.out.println(sc);
    }
}







INPUT:-pepCODinG

OUTPUT:-p-11e11p-45C12O-11D37i5n-39G
