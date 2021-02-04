import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int r = lastIndex(arr,arr.length-1,x);
        System.out.println(r);
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if(idx == -1){
            return -1;
        }
        
        if(arr[idx] == x){
            return idx;
        }
        else{
            int first = lastIndex(arr,idx-1,x);
            return first;
        }
        

INPUT:-
6
15
11
40
4
4
9
40

OUTPUT:-
2
