import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        count(n);
    }
    public static void count(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        else{
            System.out.println(n);
        }
    count(n-1);
        
    }
}


INPUT:-5


OUTPUT:-5
4
3
2
1
