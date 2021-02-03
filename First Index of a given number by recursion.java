import java.util.*;
public class Main
{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    int x = scn.nextInt();
    int r = firstIndex(arr,0,x);
    System.out.println(r);
    
    }
    
    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
        return -1;
        }
        if(arr[idx]==x){
        return idx;
        }
        else{
        int first = firstIndex(arr,idx+1,x);
        return first;
        }
    }
}


INPUT:-
6
15
11
40
4
4
9
4

OUTPUT:-
3
