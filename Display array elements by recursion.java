import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
            
        }
        int idx = 0;
        displayArr(arr,idx);
    }

    public static void displayArr(int[] arr, int idx) {
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);

    }

}


INPUT:-5
3
2
1
0
4

OUTPUT:--
3
2
1
0
4
